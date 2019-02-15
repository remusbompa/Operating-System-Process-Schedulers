//package tema1;

import java.util.Random;

public class RandomScheduler extends Planificator{
	Proces Select(Array_procese arr) {
		Random randgen=new Random();
		return arr.get(randgen.nextInt(arr.size()));
	}
}
