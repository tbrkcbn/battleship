import java.util.Arrays;

public class Board {
    public int boardLength;
    public char water = 'O';
    public char ship = 'S';
    public char hit = 'X';
    public char miss = '-';
    public char [][] board;

    public Board(int boardLength) {
        this.boardLength = boardLength;
        this.board = new char[this.boardLength][this.boardLength];
        for (int i = 0;i < this.boardLength;i++ ){
            for (int j = 0;j < this.boardLength;j++ ){
                board[i][j] = water;
            }
        }
    }
    public void showBoard(){
        for (int i = 0;i < this.boardLength;i++ ){
            for (int j = 0;j < this.boardLength;j++ ){
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }
    }

}
