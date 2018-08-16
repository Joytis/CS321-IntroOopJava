import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestBoundedQueue {
	BoundedQueue<Integer> iQueue = new BoundedQueue<Integer>(10);
	BoundedQueue<String> sQueue = new BoundedQueue<String>(10);
	
	@Test
	public void testAddSizePeek() {
		iQueue.add(10);
		sQueue.add("aa");
		assertTrue(iQueue.size() == 1);
		assertTrue(sQueue.size() == 1);
		assertTrue(iQueue.peek() == 10);
		assertTrue(sQueue.peek().equals("aa"));
	}

	@Test
	public void testRemove() {
		iQueue.add(10);
		iQueue.add(20);
		sQueue.add("aa");
		assertTrue(iQueue.size() == 2);
		assertTrue(sQueue.size() == 1);
		assertTrue(iQueue.peek() == 10);
		assertTrue(sQueue.peek().equals("aa"));
		assertTrue(iQueue.remove() == 10);
		assertTrue(iQueue.peek() == 20);
		assertTrue(iQueue.size() == 1);
	}
}
