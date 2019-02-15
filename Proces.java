//package tema1;

public abstract class Proces{
	public String nume;
	int cota;
	int nr_rulari=0;
	Proces(){
		nume=null;
		cota=0;
	}
	Proces(String nume,int cota){
		this.nume=nume;
		this.cota=cota;
	}
	abstract int Executa(int nr);
	void rulare() {
		nr_rulari++;
	}
	
}
