//package tema1;

public class CheckPrime extends Proces{
	CheckPrime(String nume,int cota){
		super(nume,cota);
	}
	int Executa(int nr) {
		super.rulare();
		if(nr<2) return 0;
		int nr_div=0;
		for(int i=1;i<=nr;i++) 
			if(nr%i==0) nr_div++;
		if(nr_div==2) return 1;
		return 0;
	}
}

