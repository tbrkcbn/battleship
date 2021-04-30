public class Board {
    public int Xcoord;
    public int Ycoord;
    public char water = 'O';
    public char ship = 'S';
    public char hit = 'X';
    public char miss = '-';
    public char [][] board;

    public Board(int Xcoord, int Ycoord) {
        this.Xcoord = Xcoord;
        this.Ycoord = Ycoord;
        this.board = new char[this.Xcoord][this.Ycoord];
        for (int i = 0; i < this.Xcoord; i++ )
            for (int j = 0; j < this.Ycoord; j++ )
                board[i][j] = water;
    }

    public void showGameBoard(){

        System.out.println("        A B C D E F \n        -----------");
        for (int i = 0;i < this.Ycoord;i++ ){
            if(i == (this.Ycoord/2)-1){
                System.out.print("    "+(i+1)+" | ");
                for (int j = 0;j < this.Xcoord;j++ ){
                    System.out.print(board[j][i]+" ");
                }
                System.out.print("\n");
                System.out.println("      | -----------");
            }else{
                System.out.print("    "+(i+1)+" | ");
                for (int j = 0;j < this.Xcoord;j++ ){
                    System.out.print(board[j][i]+" ");
                }
                System.out.print("\n");
            }
        }
    }
    public void showPersonalBoard(){
        System.out.println("        A B C D E F \n        -----------");
        for (int i = 0;i < this.Ycoord;i++ ){
                System.out.print("    "+(i+1)+" | ");
                for (int j = 0;j < this.Xcoord;j++ ){
                    System.out.print(board[j][i]+" ");
                }
                System.out.print("\n");
        }
    }

    public void hit(int coordinatesX, int coordinatesY){
        if(coordinatesX <= Xcoord && coordinatesY <= Ycoord){

        }else{
            System.out.println("Wrong coordinates");
        }
    }

}
