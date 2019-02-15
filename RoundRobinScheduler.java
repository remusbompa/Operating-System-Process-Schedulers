//package tema1;

public class RoundRobinScheduler extends Planificator{
	Proces Select(Array_procese arr) {
		int i,j;
		for(i=0;i<arr.size();i++) {
			int ok=1;
			for(j=0;j<arr.size()&&ok==1;j++)	
				if(arr.get(i).nr_rulari-arr.get(j).nr_rulari>0)
					ok=0;
			if(ok==1) return arr.get(i);
		}
		return null;
	}
}
