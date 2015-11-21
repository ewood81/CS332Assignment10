import java.util.Map;

/**
 * Created by Edward on 11/19/2015.
 */
public class InstrumentedMap extends ForwardingMap
{
    private int addCount = 0;

    public InstrumentedMap(Map s)
    {
        super(s);
    }

    @Override
    public Object put(Object o, Object p )
    {
        addCount++;
        return super.put(o,p);
    }

    public int getAddCount()
    {
        return this.addCount;
    }

}
