import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by Edward on 11/19/2015.
 */
public class ForwardingMap implements Map
{
    private final Map s;

    public ForwardingMap(Map s)
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
    public boolean containsKey(Object key)
    {
        return s.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value)
    {
        return s.containsValue(value);
    }

    @Override
    public Object get(Object key)
    {
        return s.get(key);
    }

    @Override
    public Object put(Object key, Object value)
    {
        return s.put(key, value);
    }

    @Override
    public Object remove(Object key)
    {
        return s.remove(key);
    }

    @Override
    public void putAll(Map m)
    {

    }

    @Override
    public void clear()
    {

    }

    @Override
    public Set keySet()
    {
        return s.keySet();
    }

    @Override
    public Collection values()
    {
        return s.values();
    }

    @Override
    public Set<Entry> entrySet()
    {
        return s.entrySet();
    }

    @Override
    public boolean equals(Object o)
    {
        return s.equals(o);
    }
}



