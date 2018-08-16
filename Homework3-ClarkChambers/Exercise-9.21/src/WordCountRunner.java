import java.util.concurrent.BlockingQueue;

public class WordCountRunner implements Runnable{
	String filename;
	BlockingQueue<Integer> queue;

	public WordCountRunner(String arg, BlockingQueue<Integer> q) { 
		filename = arg; 
		queue = q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		WordCounter ec = new WordCounter(filename);
		try {
			queue.put(ec.getCount());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
