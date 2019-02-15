//package tema1;

public class LruCache extends Cache{
	LruCache(String tip,int nr_linii){
		super(tip,nr_linii);
	}
	void Cache_plin(int nr_procesat,Proces tip_proces,int timp) {
		int i;
		int timp_min=Integer.MAX_VALUE;
        int indlCache=-1;
		for(i=0;i<size();i++) {
			if(get(i).timp<timp_min){
				timp_min=get(i).timp;
                indlCache=i;}
		}
        remove(indlCache);
    }
}
