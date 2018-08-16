import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;


public class BoundedQueue<T> extends QueueAdapter<T>{

	private List<T> objs;

	public BoundedQueue(int i) {
		objs = new ArrayList<T>(i);
	}

	@Override
	public void add(T obj) {
		objs.add(obj);	
	}

	@Override
	public T remove() {
		if(objs.get(0) != null) {
			return objs.remove(0);
		}
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return objs.size();
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return objs.get(0);
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return objs.iterator();
	}
}
