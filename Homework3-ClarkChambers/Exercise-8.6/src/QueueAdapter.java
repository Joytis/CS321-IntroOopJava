import java.util.Iterator;

public class QueueAdapter<T> implements QueueInterface<T>{

	@Override
	public void add(T obj) {}
	@Override
	public T remove() { return null; }
 	@Override
	public int size() { return 0; }
 	@Override
	public T get(int index) { return null; }
 	@Override
	public T peek() { return null; }
 	@Override
	public boolean isFull() { return false; }
 	@Override
	public boolean isEmpty() { return false; }
 	@Override
	public Iterator<T> iterator() { return null; }

}
