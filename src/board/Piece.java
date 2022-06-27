package board;

public class Piece {
    protected Position pos;
    private Board board;

    public Piece(Board board){ this.board = board; }

    protected Board getBoard(){
        return board;
    }
}
