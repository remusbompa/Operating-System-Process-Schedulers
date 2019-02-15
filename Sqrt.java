//package tema1;

public class Sqrt extends Proces{
	Sqrt(String nume,int cota){
		super(nume,cota);
	}
	int Executa(int n) {
		super.rulare();
		return (int)Math.sqrt(Math.abs(n));
	}
}
