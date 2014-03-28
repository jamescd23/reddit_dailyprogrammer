import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by cjames on 3/24/2014.
 */
public class SolutionTest {

    public void test_Example_001() {
        String element = "((your[drink {remember to}]) ovaltine)";
        String expected = "remember to drink your ovaltine";

        Solution s = new Solution(element);
        String actual = s.solve();

        assertEquals(expected, actual);
    }

    public void test_Example_002() {
        String element = "[racket for {brackets (matching) is a} computers]";
        String expected = "matching brackets is a racket for computers";

        Solution s = new Solution(element);
        String actual = s.solve();

        assertEquals(expected, actual);
    }

    public void test_Example_003() {
        String element = "[can {and it(it (mix) up ) } look silly]";
        String expected = "mix it up and it can look silly";

        Solution s = new Solution(element);
        String actual = s.solve();

        assertEquals(expected, actual);
    }

    public void test_Example_004() {
        String element = "[can {and it(it (mix) up ) } look silly]";
        String expected = "mix it up and it can look silly";

        Solution s = new Solution(element);
        String actual = s.solve();

        assertEquals(expected, actual);
    }

    @Test(expected = java.lang.IllegalStateException.class)
    public void test_Example_005() {
        String element = "((your[drink {remember to))) ovaltine)";
        String expected = "exception is expected, not a result";

        Solution s = new Solution(element);
        String actual = s.solve();

        assertEquals(expected, actual);
    }

    @Test(expected = java.lang.IllegalStateException.class)
    public void test_Example_006() {
        String element = "[can {and it(it (mix) up ) look silly]";
        String expected = "exception is expected, not a result";

        Solution s = new Solution(element);
        String actual = s.solve();

        assertEquals(expected, actual);
    }

    @Test(expected = java.lang.IllegalStateException.class)
    public void test_Example_007() {
        String element = "[racket for brackets (matching) is a} computers]";
        String expected = "exception is expected, not a result";

        Solution s = new Solution(element);
        String actual = s.solve();

        assertEquals(expected, actual);
    }

    public void test_Example_008() {
        String element = "{years [four score] ago (and seven) our fathers}";
        String expected = "four score and seven years ago our fathers";

        Solution s = new Solution(element);
        String actual = s.solve();

        assertEquals(expected, actual);
    }
}
