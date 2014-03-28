import java.util.Arrays;
import java.util.Collections;

/**
 * Created by cjames on 3/25/2014.
 * http://www.reddit.com/r/dailyprogrammer/comments/20sjif/4192014_challenge_154_intermediate_gorellian/
 */
public class GorellianSorter {
    private String[] _words = {"ANTLER", "ANY", "COW", "HILL", "HOW", "HOWEVER", "WHATEVER", "ZONE"};

    private char[] _alphaSequence;

    public GorellianSorter(String p_AlphaSequence) {
        setAlphaSequence(p_AlphaSequence);
    }

    public GorellianSorter(String p_AlphaSequence, String[] p_Words) {
        setAlphaSequence(p_AlphaSequence);
        _words = p_Words;
    }

    private void setAlphaSequence(String p_AlphaSequence) {
        validateAlphaSequence(p_AlphaSequence);

        _alphaSequence = new char[26];

        for (int i = 0; i < Math.min(26, p_AlphaSequence.length()); i++) {
            _alphaSequence[i] = Character.toUpperCase(p_AlphaSequence.charAt(i));
        }
    }

    private void validateAlphaSequence(String p_AlphaSequence) {
        if (p_AlphaSequence.length() != 26) throw new IllegalArgumentException("Illegal number of characters in Alpha-Sequence");

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder b = new StringBuilder();
        for (char c : alphabet) {
            if (!p_AlphaSequence.contains(Character.toString(c))) {
                b.append(c);
                b.append(',');
            }
        }

        if (b.length() > 0) {
            throw new IllegalArgumentException("Missing characters from Alpha-Sequence: " + b.toString());
        }
    }

    public String[] sort() {
        String[] sorted = Arrays.copyOf(_words, _words.length);
        Arrays.sort(sorted, new OrderedStringComparator(_alphaSequence));
        return sorted;
    }
}
