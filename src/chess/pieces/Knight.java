package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(board, color);;
    }
    
    @Override 
    public String toString(){
        return "N";
    }

    private boolean canMove(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p==null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);


        p.setValues(pos.getRow() - 1, pos.getColumn() - 2);
        if(getBoard().positionExists(p) && canMove(p)) mat[p.getRow()][p.getColumn()] = true;

        p.setValues(pos.getRow() - 2, pos.getColumn()- 1);
        if(getBoard().positionExists(p) && canMove(p)) mat[p.getRow()][p.getColumn()] = true;

        p.setValues(pos.getRow() - 1, pos.getColumn() + 2);
        if(getBoard().positionExists(p) && canMove(p)) mat[p.getRow()][p.getColumn()] = true;
 
        p.setValues(pos.getRow() - 2, pos.getColumn() + 1);
        if(getBoard().positionExists(p) && canMove(p)) mat[p.getRow()][p.getColumn()] = true;

        p.setValues(pos.getRow() + 1, pos.getColumn() - 2);
        if(getBoard().positionExists(p) && canMove(p)) mat[p.getRow()][p.getColumn()] = true;
   
        p.setValues(pos.getRow() + 2, pos.getColumn() - 1);
        if(getBoard().positionExists(p) && canMove(p)) mat[p.getRow()][p.getColumn()] = true;

        p.setValues(pos.getRow() + 1, pos.getColumn() + 2);
        if(getBoard().positionExists(p) && canMove(p)) mat[p.getRow()][p.getColumn()] = true;

        p.setValues(pos.getRow() + 2, pos.getColumn() + 1);
        if(getBoard().positionExists(p) && canMove(p)) mat[p.getRow()][p.getColumn()] = true;

        return mat;
    }
}
