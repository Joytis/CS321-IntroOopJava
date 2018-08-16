import java.util.Iterator;

public class TestBoundedQueue {
	static BoundedQueue<Integer> iQueue = new BoundedQueue<Integer>(10);
	static BoundedQueue<String> sQueue = new BoundedQueue<String>(10);
	

	public static void main(String[] args) {
		iQueue.add(10);
		iQueue.add(20);
		
		Iterator<Integer> iteratorI = iQueue.iterator();
		while(iteratorI.hasNext()) {
			System.out.print(iteratorI.next() + " ");
		}
		System.out.println();	
		
		sQueue.add("aa");
		sQueue.add("bb");
		sQueue.add("cc");
		
		Iterator<String> iteratorS = sQueue.iterator();
		while(iteratorS.hasNext()) {
			System.out.print(iteratorS.next() + " ");
		}
		System.out.println();
		
		
		sQueue.remove();
		iteratorS = sQueue.iterator();
		while(iteratorS.hasNext()) {
			System.out.print(iteratorS.next() + " ");
		}
		
		System.out.println();
	}
}
