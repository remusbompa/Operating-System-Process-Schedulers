//package tema1;

public class Cmmdc {
	static int DivizorComun(int a,int b) {
		    if(b == 0)
		        return a;
		    else return DivizorComun(b, a % b);
	}
}
