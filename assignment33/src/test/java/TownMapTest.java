import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TownMapTest {

    private Map<String, TownMap> townMap;
    private TownMap town1;
    private TownMap town2;
    private TownMap town3;

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void test1() {
        townMap = new HashMap<String, TownMap>();

        town1 = new TownMap();
        town2 = new TownMap();
        town3 = new TownMap();

        town1.setName("Mthatha");
        town1.setProvince("Eastern Cape");
        town2.setName("Cape Town");
        town2.setProvince("Western Cape");
        town3.setName("Durban");
        town3.setProvince("KZN");

        townMap.put(town1.getName(), town1);
        townMap.put(town2.getName(), town2);
        townMap.put(town3.getName(), town3);

        Assert.assertTrue(townMap.get("Mthatha") != null);
    }

}