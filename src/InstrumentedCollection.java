import java.util.Collection;

/**
 * Created by Edward on 11/19/2015.
 */
public class InstrumentedCollection<E> extends ForwardingCollection<E>
{
    private int addCount = 0;

    public InstrumentedCollection(Collection<E> s)
    {
        super(s);
    }

    @Override
    public boolean add(E e)
    {
        addCount++;
        return super.add(e);
    }

    public int getAddCount()
    {
        return this.addCount;
    }

}
