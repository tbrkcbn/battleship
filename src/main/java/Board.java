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
        this.board = new char[this.boardLength][this.boardHeigth];
        for (int i = 0; i < this.boardLength; i++ )
            for (int j = 0; j < this.boardHeigth; j++ )
                board[i][j] = water;
    }

    public void showGameBoard(){
        System.out.println("        A B C D E F \n        -----------");
        for (int i = 0;i < this.boardLength;i++ ){
            if(i == (boardLength/2)-1){
                System.out.print("    "+(i+1)+" | ");
                for (int j = 0;j < this.boardHeigth;j++ ){
                    System.out.print(board[i][j]+" ");
                }
                System.out.print("\n");
                System.out.println("      | -----------");
            }else{
                System.out.print("    "+(i+1)+" | ");
                for (int j = 0;j < this.boardHeigth;j++ ){
                    System.out.print(board[i][j]+" ");
                }
                System.out.print("\n");
            }
        }
    }
    public void showPersonalBoard(){
        System.out.println("        A B C D E F \n        -----------");
        for (int i = 0;i < this.boardLength;i++ ){
                System.out.print("    "+(i+1)+" | ");
                for (int j = 0;j < this.boardHeigth;j++ ){
                    System.out.print(board[i][j]+" ");
                }
                System.out.print("\n");
        }



    }

    public void hit(int coordinatesX, int coordinatesY){
        if(coordinatesX <= boardLength && coordinatesY <= boardHeigth){

        }else{
            System.out.println("Wrong coordinates");
        }
    }

}
