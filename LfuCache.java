//package tema1;

public class LfuCache extends Cache{
	LfuCache(String tip,int nr_linii){
		super(tip,nr_linii);
	}
	void Cache_plin(int nr_procesat,Proces tip_proces,int timp) {
		int min=Integer.MAX_VALUE;
		int i;
        int indlCache=-1;
		for(i=0;i<size();i++) {
			if(get(i).nr_folosiri<min){
				min=get(i).nr_folosiri;
                indlCache=i;}
		}
		remove(indlCache);
	}
}
