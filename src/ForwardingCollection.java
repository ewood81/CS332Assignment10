import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Edward on 11/19/2015.
 */
public class ForwardingCollection<E> implements Collection<E>
{
    private final Collection<E> s;

    public ForwardingCollection(Collection<E> s)
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
        return s.toArray(a);
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
    public boolean equals(Object o)
    {
        return s.equals(o);
    }


    @Override
    public int hashCode()
    {
        return 0;
    }
}


