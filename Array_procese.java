//package tema1;

public class Array_procese {
	private int vf=-1;
	private Proces[] arr_procese;
	Array_procese(){
		this(10);
	}
	Array_procese(int dim){
		arr_procese=new Proces[dim];
	}
	
	void add(String proces,int cota) {
		vf++;
		switch(proces) {
		case "CheckPrime":	arr_procese[vf]=new CheckPrime(proces,cota);
							break;
		case "NextPrime":	arr_procese[vf]=new NextPrime(proces,cota);
							break;
		case "Fibonacci":	arr_procese[vf]=new Fibonacci(proces,cota);
							break;
		case "Sqrt":	arr_procese[vf]=new Sqrt(proces,cota);
						break;
		case "Square":	arr_procese[vf]=new Square(proces,cota);
						break;
		case "Cube":	arr_procese[vf]=new Cube(proces,cota);
						break;
		case "Factorial":	arr_procese[vf]=new Factorial(proces,cota);
							break;
		default:	System.out.println("Functie invalida!");
					break;
		}
	}
	
	Proces get(int index) {
		return arr_procese[index];
	}
	
	int size() {
		return vf+1;
	}
}
