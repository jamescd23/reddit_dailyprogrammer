import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by cjames on 3/25/2014.
 */
public class OrderedStringComparator implements Comparator<String> {

    char[] _alphaSequence = null;

    public OrderedStringComparator(char[] p_AlphaSequence) {
        _alphaSequence = p_AlphaSequence;
    }

    public int compare(String p_A, String p_B) {
        int charIndex  = 0;

        while(charIndex < Math.min(p_A.length(), p_B.length())) {
            int a_Index = indexOf(_alphaSequence, Character.toUpperCase(p_A.charAt(charIndex)));
            int b_Index = indexOf(_alphaSequence, Character.toUpperCase(p_B.charAt(charIndex)));

            if (a_Index < b_Index) return -1;
            if (b_Index < a_Index) return 1;

            charIndex++;
        }

        // Words equal, up to the max number of letters
        //  use the default string comparisons
        return p_A.compareToIgnoreCase(p_B);
    }

    private int indexOf(char[] p_Array, char p_Key) {
        for(int i = 0; i < p_Array.length; i++) {
            if (p_Array[i] == p_Key) return i;
        }

        return -1;
    }
}
