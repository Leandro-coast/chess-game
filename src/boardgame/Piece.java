package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        //para fins didáticos, já sabendo que o java atribui o valor por padrão como nulo.
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
