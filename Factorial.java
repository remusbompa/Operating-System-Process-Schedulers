//package tema1;

public class Factorial extends Proces{
	Factorial(String nume,int cota){
		super(nume,cota);
	}
	int Executa(int nr) {
		super.rulare();
		if(nr<0) return 0;
		int produs=1,i;
		for(i=1;i<=nr;i++) {
			produs=(produs*i)%9973;}
		return produs;
	}
}
