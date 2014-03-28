/**
 * Created by cjames on 3/26/2014.
 */
public class Move {
    private int _To_X = Integer.MIN_VALUE;
    private int _To_Y = Integer.MIN_VALUE;

    private ChessPiece _expectedPiece = ChessPiece.Pawn;
    private boolean _isCapture;

    public int getToX() {
        return _To_X;
    }

    public void setToX(int _To_X) {
        this._To_X = _To_X;
    }

    public int getToY() {
        return _To_Y;
    }

    public void setToY(int _To_Y) {
        this._To_Y = _To_Y;
    }

    public boolean isCapture() {
        return _isCapture;
    }

    public void flagCapture(boolean _isCapture) {
        this._isCapture = _isCapture;
    }

    public ChessPiece getExpectedPiece() {
        return _expectedPiece;
    }

    public void setExpectedPiece(ChessPiece p_ExpectedPiece) {
        _expectedPiece = p_ExpectedPiece;
    }
}
