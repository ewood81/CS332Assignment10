import java.util.List;

/**
 * Created by Edward on 11/19/2015.
 */
public class InstrumentedList<E> extends ForwardingList<E>
{
    private int addCount = 0;

    public InstrumentedList(List<E> s)
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
