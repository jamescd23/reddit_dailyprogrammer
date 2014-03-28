import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjames on 3/26/2014.
 */
public class MoveParser {

    public static Move[] parse(String p_Move) {
        List<Move> output = new ArrayList<Move>();

        String[] chunks = p_Move.split("\\|");

        for (String chunk : chunks) {
            output.add(parseMove(chunk));
        }

        Move[] m = new Move[output.size()];
        output.toArray(m);
        return m;
    }

    private static Move parseMove(String p_Notation) {
        Move output = new Move();

        int charIndex = 0;

        char c = p_Notation.charAt(charIndex);
        if (Character.isUpperCase(c)) {
            // this is likely a piece declaration
            output.setExpectedPiece(ChessPiece.parse(c));
            charIndex++;
        }

        c = p_Notation.charAt(charIndex);
        if (c == 'x' || c == 'X') {
            // should be a capture
            output.flagCapture(true);
            charIndex++;
        }

        // should be the move to position now
        c = p_Notation.charAt(charIndex);
        output.setToX(Integer.valueOf(Character.toString(c)));
        charIndex++;

        c = p_Notation.charAt(charIndex);
        output.setToY(Integer.valueOf(Character.toString(c)));

        return output;
    }
}
