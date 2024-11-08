package ar.edu.unlp.info.oo1.ejercicio16;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.Iterator;


public class EvenSetNumber implements Set<Integer>{
	private ArrayList<Integer> elementos = new ArrayList<>();

	@Override
	public int size() {
		return elementos.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return elementos.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return elementos.contains(o);
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Integer e) {
		if (e%2 == 0)
		{
			if (!elementos.contains(e))
			{
				elementos.add(e);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean remove(Object o) {
		if (elementos.contains(o))
		{
			elementos.remove(o);
			return true;
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		elementos.clear();
		
	}
	

}
