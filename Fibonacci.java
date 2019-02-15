//package tema1;

public class Fibonacci extends Proces{
	Fibonacci(String nume,int cota){
		super(nume,cota);
	}
	int Executa(int n) {
		super.rulare();
		if(n<0) return -1;
		if(n==0) return 0;
		if(n==1) return 1;
		int nr=1,a=0,b=1;
		while(nr!=n) {
			a=(a+b)%9973;
			nr++;
			if(nr==n) return a;
			b=(b+a)%9973;
			nr++;
		}
		return b;
	}
}
