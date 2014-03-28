import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cjames on 3/25/2014.
 */
public class SorterTest {
    @Test
    public void testSort_Example001() {
        String alphaSequence = "UVWXYZNOPQRSTHIJKLMABCDEFG";
        String[] expected = {"WHATEVER",
                "ZONE",
                "HOW",
                "HOWEVER",
                "HILL",
                "ANY",
                "ANTLER",
                "COW"};

        GorellianSorter sorter = new GorellianSorter(alphaSequence);
        String[] actual = sorter.sort();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort_Example002() {
        String alphaSequence = "ZYXWVuTSRQpONMLkJIHGFEDCBa";
        String[] expected = {"teamS",
                "go",
                "Go",
                "aLL",
                "ACM"};

        GorellianSorter sorter = new GorellianSorter(alphaSequence, new String[]{"go", "aLL", "ACM", "teamS", "Go"});
        String[] actual = sorter.sort();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSort_Exception_001() {
        // Alpha sequence is too short (must be 26 characters) so this
        //  should throw an exception
        GorellianSorter sorter = new GorellianSorter("abc");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSort_Exception_002() {
        String alphaSequence = "bbcdefghijklmnopqrstuvwxyy"; // Missing A and Z

        GorellianSorter sorter = new GorellianSorter(alphaSequence);
    }
}
