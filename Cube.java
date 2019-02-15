//package tema1;

public class Cube extends Proces{
	Cube(String nume,int cota){
		super(nume,cota);
	}
	int Executa(int nr) {
		super.rulare();
		return (int)Math.pow(nr, 3);
	}
}
