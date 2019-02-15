//package tema1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		int i;
		File input=new File(args[0]);
		Scanner s=new Scanner(input);
		
		String cacheType=s.next();
		int cacheLines=s.nextInt();
		Cache cache=null;
		switch(cacheType) {
		case "NoCache":		cache=new NoCache(cacheType,cacheLines);
							break;
		case "LruCache":	cache=new LruCache(cacheType,cacheLines);
							break;
		case "LfuCache":	cache=new LfuCache(cacheType,cacheLines);
							break;
		default:	System.out.println("Cache invalid!");
		}
		
		Planificator scheduler=null;
		String schedulerType=s.next();
		switch(schedulerType) {
		case "RandomScheduler":	scheduler=new RandomScheduler();
								break;
		case "RoundRobinScheduler":	scheduler=new RoundRobinScheduler();
									break;
		case "WeightedScheduler":	scheduler=new WeightedScheduler();
									break;
		default:	System.out.println("Planificator invalid!");
		}
		
		int numberOfEvents=s.nextInt();
		Array_procese arr=new Array_procese(numberOfEvents);
		for(i=0;i<numberOfEvents;i++) {
			String process=s.next();
			int weight=s.nextInt();
			arr.add(process, weight);
		}
		PrintWriter out=new PrintWriter(args[1],"UTF-8");
		int numberOfNumbersToBeProcessed=s.nextInt();
		for(i=0;i<numberOfNumbersToBeProcessed;i++) {
			int number=s.nextInt();
			Proces proces=scheduler.Select(arr);
			if(cache.tip.equals("NoCache"))
				out.println(number+" "+proces.nume+" "+proces.Executa(number)
				+" "+"Computed");
			else
				cache.add(out,number, proces,i+1);	
		}
		s.close();
		out.close();
	}

}
