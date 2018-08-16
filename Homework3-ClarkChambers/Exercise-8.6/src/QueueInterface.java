import java.util.Iterator;

public interface QueueInterface<T> {
	public void add(T obj);
	public T remove();
	public int size();
	public T get(int index);
	public T peek();
	public boolean isFull();
	public boolean isEmpty();
	public Iterator<T> iterator();
}
