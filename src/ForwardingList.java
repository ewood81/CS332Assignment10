import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Edward on 11/19/2015.
 */
public class ForwardingList<E> implements List<E>
{
    private final List<E> s;

    public ForwardingList(List<E> s)
    {
        this.s = s;
    }

    @Override
    public int size()
    {
        return s.size();
    }

    @Override
    public boolean isEmpty()
    {
        return s.isEmpty();
    }

    @Override
    public boolean contains(Object o)
    {
        return s.contains(o);
    }

    @Override
    public Iterator<E> iterator()
    {
        return s.iterator();
    }

    @Override
    public Object[] toArray()
    {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a)
    {
        return null;
    }

    @Override
    public boolean add(E e)
    {
        return s.add(e);
    }

    @Override
    public boolean remove(Object o)
    {
        return s.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c)
    {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c)
    {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c)
    {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c)
    {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c)
    {
        return false;
    }

    @Override
    public void clear()
    {

    }

    @Override
    public E get(int index)
    {
        return s.get(index);
    }

    @Override
    public E set(int index, E element)
    {
        return s.set(index, element);
    }

    @Override
    public void add(int index, E element)
    {
        s.add(index,element);
    }

    @Override
    public E remove(int index)
    {
        return s.remove(index);
    }

    @Override
    public int indexOf(Object o)
    {
        return s.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o)
    {
        return s.lastIndexOf(o);
    }

    @Override
    public ListIterator<E> listIterator()
    {
        return s.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index)
    {
        return s.listIterator(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex)
    {
        return null;
    }

    @Override
    public boolean equals(Object o)
    {
        return s.equals(o);
    }
}

