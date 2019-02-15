//package tema1;

public class LinieCache {
	Proces tip_proces;
	int timp;
    int nr_folosiri;
    int nr_procesat;
	LinieCache(int nr_procesat,Proces tip_proces,int timp){
		this.tip_proces=tip_proces;
		this.timp=timp;
        nr_folosiri=1;
        this.nr_procesat=nr_procesat;
	}
}
