
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class IGadgetSetTest{

    private Set<IGadgetSet> iGadgetSets;
    private IGadgetSet gadget1, gadget2, gadget3;

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    @Test
    public void testOne() {
        iGadgetSets = new HashSet<IGadgetSet>();

        gadget1.setAppliance("Sex Doll");

        gadget2.setAppliance("Shaving Laser");

        gadget3.setAppliance("Watch Raider");

        Assert.assertTrue(iGadgetSets.isEmpty());

        iGadgetSets.add(gadget1);
        iGadgetSets.add(gadget2);
        iGadgetSets.add(gadget3);
        iGadgetSets.add(gadget3);
        iGadgetSets.add(gadget2);
        iGadgetSets.add(gadget3);

        Assert.assertFalse(iGadgetSets.isEmpty());
        Assert.assertEquals(iGadgetSets.size(), 3);
    }

}