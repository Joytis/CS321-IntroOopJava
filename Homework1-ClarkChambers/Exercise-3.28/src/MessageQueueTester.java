import static org.junit.Assert.*;

import org.junit.Test;

public class MessageQueueTester {

	@Test
	public void test_add() {
		MessageQueue msgq = new MessageQueue(3);
		for(int i = 0; i < 10; i++) {
			msgq.add(new Message("Cool"));
		}
	}

	@Test
	public void test_remove() {
		MessageQueue msgq = new MessageQueue(3);
		Message m = null;
		for(int i = 0; i < 10; i++) {
			m = msgq.remove();
		}
		if(msgq.peek() == m)
			fail("Not actually removed");
	}

	@Test
	public void test_size() {
		MessageQueue msgq = new MessageQueue(3);
		if(msgq.size() != 0) {
			fail("Queue not initialized correctly");
		}
		msgq.add(new Message("Cool"));
		if(msgq.size() != 1) {
			fail("Queue not initialized correctly");
		}
	}

	@Test
	public void test_full() {
		MessageQueue msgq = new MessageQueue(3);
		if(msgq.isFull()) {
			fail("Queue is not full and says it is");
		}
		for(int i = 0; i < 3; i++) {
			msgq.add(new Message("Cool"));
		}
		if(!msgq.isFull()) {
			fail("Queue is  full and says it isn't");
		}
		for(int i = 0; i < 10; i++) {
			msgq.add(new Message("Cool"));
		}
		if(!msgq.isFull()) {
			fail("Queue is  full and says it isn't");
		}
	}

}
