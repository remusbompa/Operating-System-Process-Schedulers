//package tema1;

public class WeightedScheduler extends Planificator{
	Proces Select(Array_procese arr) {
		int suma_cote=0,cmmdc=arr.get(0).cota,t;
		int i;
		for(i=0;i<arr.size();i++)
			suma_cote+=arr.get(i).cota;
		for(i=1;i<arr.size();i++)
			cmmdc=Cmmdc.DivizorComun(cmmdc, arr.get(i).cota);
		t=suma_cote/cmmdc;
		int moment_timp=0;
		for(i=0;i<arr.size();i++)
					moment_timp+=arr.get(i).nr_rulari;
		int rulari_i=0;
		for(i=0;i<arr.size();i++) {
			rulari_i+=arr.get(i).cota/cmmdc;
			if(moment_timp%t<rulari_i)
				return arr.get(i);
		}
		return null;
	}
}
