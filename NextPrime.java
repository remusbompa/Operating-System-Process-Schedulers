//package tema1;

public class NextPrime extends Proces{
	NextPrime(String nume,int cota){
		super(nume,cota);
	}
	int Executa(int nr) {
		super.rulare();
		int i;
		for(i=nr+1;;i++) {
			if(i<=2) return 2;
			int nr_div=0;
			for(int d=1;d<=i;d++)
				if(i%d==0) nr_div++;
			if(nr_div==2)
				return i;
		}
	}
}
