import java.util.*;

/**
 * Created by cjames on 3/24/2014.
 *
 * http://www.reddit.com/r/dailyprogrammer/comments/217klv/4242014_challenge_154_easy_march_madness_brackets/
 */
public class Main {
    static String DEBUG_STRING = "((your[drink {remember to}]) ovaltine)";
    //static String DEBUG_STRING = "[racket for {brackets (matching) is a} computers]";
    //static String DEBUG_STRING = "[can {and it(it (mix) up ) } look silly]";

    // ERROR CASES
    //static String DEBUG_STRING = "((your[drink {remember to))) ovaltine)";
    //static String DEBUG_STRING = "[can {and it(it (mix) up ) look silly]";
    //static String DEBUG_STRING = "[racket for brackets (matching) is a} computers]";
    //static String DEBUG_STRING = "{years [four score] ago (and seven) our fathers};

    public static void main(String[] p_Args) {
        Solution s = new Solution(p_Args[0]);
        System.out.println(s.solve());
    }
}
