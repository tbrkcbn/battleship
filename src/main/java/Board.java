import java.util.Arrays;

public class Board {
    public int boardLength;
    public int boardHeigth;
    public char water = 'O';
    public char ship = 'S';
    public char hit = 'X';
    public char miss = '-';
    public char [][] board;

    public Board(int boardLength, int boardHeigth) {
        this.boardLength = boardLength;
        this.boardHeigth = boardHeigth;
        this.board = new char[this.boardHeigth][this.boardLength];
        for (int i = 0;i < this.boardHeigth;i++ ){
            for (int j = 0;j < this.boardLength;j++ ){
                board[i][j] = water;
            }
        }
    }

    public void showBoard(){
        System.out.println("        A B C D E F \n        -----------");
        for (int i = 0;i < this.boardHeigth;i++ ){
            if(i == (boardHeigth/2)-1){
                System.out.print("    "+(i+1)+" | ");
                for (int j = 0;j < this.boardLength;j++ ){
                    System.out.print(board[i][j]+" ");
                }
                System.out.print("\n");
                System.out.println("      | -----------");
            }else{
                System.out.print("    "+(i+1)+" | ");
                for (int j = 0;j < this.boardLength;j++ ){
                    System.out.print(board[i][j]+" ");
                }
                System.out.print("\n");
            }
        }
    }

    public void hit(int coordinatesX, int coordinatesY){
        if(coordinatesX <= boardLength && coordinatesY <= boardHeigth){

        }else{
            System.out.println("Wrong coordinates");
        }
    }

}
