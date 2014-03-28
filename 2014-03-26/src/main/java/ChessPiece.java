import java.util.HashMap;
import java.util.Map;

/**
 * Created by cjames on 3/26/2014.
 */
public enum ChessPiece {
    Pawn(' '),
    Rook('R'),
    Knight('K'),
    Bishop('B'),
    Queen('Q'),
    King('K');

    private static Map<Character, ChessPiece> _Lookups = new HashMap<Character, ChessPiece>();

    private Character _value;

    static {
        for(ChessPiece p : ChessPiece.values()) {
            _Lookups.put(p.getValue(), p);
        }
    }

    public static boolean isDefined(Character p_Key) {
        return _Lookups.containsKey(p_Key);
    }

    public static ChessPiece parse(Character p_Key) {
        return _Lookups.get(p_Key);
    }

    private ChessPiece(Character p_PieceKey) {
        _value = p_PieceKey;
    }

    public Character getValue() {
        return _value;
    }
}
