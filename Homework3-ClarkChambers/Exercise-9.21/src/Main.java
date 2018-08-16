import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		if(args.length < 1) {
			System.out.println("Not enough file names!");
			return;
		}
		
		BlockingQueue<Integer> que = new ArrayBlockingQueue<Integer>(args.length);
		List<Thread> threads = new ArrayList<Thread>();

		for(String s : args) {
			threads.add(new Thread(new WordCountRunner(s, que)));
		}

		for(Thread t : threads) {
			t.start();
		}

		try{
			for(Thread t : threads) {
				t.join();
			}
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}

		Iterator<Integer> it = que.iterator();
		int count = 0;
		System.out.print("[ ");
		while(it.hasNext()){
			int n = it.next();
			count += n;
			System.out.print(n + ", ");
		}
		System.out.print("]");
		System.out.println("\nTotal wordcount: " + count);
	}
}
