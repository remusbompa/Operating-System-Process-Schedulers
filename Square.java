//package tema1;

public class Square extends Proces{
	Square(String nume,int cota){
		super(nume,cota);
	}
	int Executa(int nr) {
		super.rulare();
		return (int) Math.pow(nr, 2);
	}
}
