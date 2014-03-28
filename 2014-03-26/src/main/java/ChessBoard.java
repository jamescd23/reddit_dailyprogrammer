/**
 * Created by cjames on 3/26/2014.
 */
public class ChessBoard {
    private ChessPiece[][] _Board = new ChessPiece[8][8];

    public ChessBoard() {
        // White
        _Board[1][1] = ChessPiece.Rook;
        _Board[1][2] = ChessPiece.Knight;
        _Board[1][3] = ChessPiece.Bishop;
        _Board[1][4] = ChessPiece.Queen;
        _Board[1][5] = ChessPiece.King;
        _Board[1][6] = ChessPiece.Bishop;
        _Board[1][7] = ChessPiece.Knight;
        _Board[1][8] = ChessPiece.Rook;

        _Board[2][1] = ChessPiece.Pawn;
        _Board[2][2] = ChessPiece.Pawn;
        _Board[2][3] = ChessPiece.Pawn;
        _Board[2][4] = ChessPiece.Pawn;
        _Board[2][5] = ChessPiece.Pawn;
        _Board[2][6] = ChessPiece.Pawn;
        _Board[2][7] = ChessPiece.Pawn;
        _Board[2][8] = ChessPiece.Pawn;

        // Black
        _Board[7][1] = ChessPiece.Pawn;
        _Board[7][2] = ChessPiece.Pawn;
        _Board[7][3] = ChessPiece.Pawn;
        _Board[7][4] = ChessPiece.Pawn;
        _Board[7][5] = ChessPiece.Pawn;
        _Board[7][6] = ChessPiece.Pawn;
        _Board[7][7] = ChessPiece.Pawn;
        _Board[7][8] = ChessPiece.Pawn;

        _Board[8][1] = ChessPiece.Rook;
        _Board[8][2] = ChessPiece.Knight;
        _Board[8][3] = ChessPiece.Bishop;
        _Board[8][4] = ChessPiece.Queen;
        _Board[8][5] = ChessPiece.King;
        _Board[8][6] = ChessPiece.Bishop;
        _Board[8][7] = ChessPiece.Knight;
        _Board[8][8] = ChessPiece.Rook;
    }

    public void applyMoves(Move[] p_Moves) {


    }
}
