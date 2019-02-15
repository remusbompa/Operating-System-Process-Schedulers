//package tema1;

import java.util.Objects;
import java.io.PrintWriter;

public abstract class Cache {
	String tip;
	private int nr_linii;
	private LinieCache[] arr;
    private int vf=-1;
	Cache(){
		this(null,0);
	}
	Cache(String tip,int nr_linii){
		this.tip=tip;
		this.nr_linii=nr_linii;
		arr=new LinieCache[nr_linii];
		
	}
	
	abstract void Cache_plin(int nr_procesat,Proces tip_proces,int timp);
	void add(PrintWriter out,int nr_procesat,Proces tip_proces,int timp) {
		int i;
		for(i=0;i<size();i++)
			if(Objects.equals(get(i).tip_proces,tip_proces) && Objects.equals(get(i).nr_procesat,nr_procesat)) {
				get(i).nr_folosiri++;
				get(i).timp=timp;
                out.println(get(i).nr_procesat+" "+get(i).tip_proces.nume+" "+get(i).tip_proces.Executa(nr_procesat)+" FromCache");
				return;}
		if(Objects.equals(size(), nr_linii)) {
			Cache_plin(nr_procesat,tip_proces,timp);
		}
		vf++;
		set(vf,new LinieCache(nr_procesat,tip_proces,timp));
        out.println(nr_procesat+" "+tip_proces.nume+" "+tip_proces.Executa(nr_procesat)+" Computed");
		}
	
	LinieCache get(int index) {
		return arr[index];
	}

    void set(int index, LinieCache l){
        arr[index] = l;
    }
	
	int size() {
		return vf+1;
	}

    void remove(int index){
        if(index>=0&&index<=vf) {
            int i;
            for(i=index;i<vf;i++)
                arr[i]=arr[i+1];
            arr[vf]=null;
            vf--;
            }
        else
            System.out.println("Indexul este invalid!");
    }
}
