import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by Edward on 11/19/2015.
 */
public class InstrumentedCollectionTest
{
    //Failing test due to equals() contract violation
    @Test
    public void testCollectionEquals()
    {
        Set<String> p = new HashSet<String>();
        InstrumentedCollection<String> t = new InstrumentedCollection<String>(p);

        p.add("cat"); p.add("dog");

        assertTrue(p.equals(t));
        assertTrue(t.equals(p));
    }

    @Test
    public void testMapEquals()
    {
        Map s = new HashMap();
        s.put("five", 5);
        s.put("ten", 10);

        Map r = new InstrumentedMap(s);
        Map q = new InstrumentedMap(r);

        assertTrue(r.equals(q));
    }

    @Test
    public void testListEquals()
    {
        List<String> s = new ArrayList<String>();
        s.add("GMethod"); s.add("ClassCast"); s.add("RawType");

        List<String> r = new InstrumentedList<String>(s);
        List<String> q = new InstrumentedList<String>(r);

        assertTrue(r.equals(q));

    }
}