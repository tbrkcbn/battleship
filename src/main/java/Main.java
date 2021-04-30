import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opponentName = "Admiral Red Beard";
        String difficulty = "HARD";
        int choice = 0;
        int boardLength = 6;
        int boardHeigth = 8;

        while (choice != -1) {
            choice = menu(opponentName, difficulty);
            switch (choice) {
                case 1:
                    Board opponentBoard = randomBoardGenerator(boardLength,boardHeigth/2,3);

                    Board userBoard = userBoardPlacement(boardLength, boardHeigth/2,3);

                    Board gameBoard =  joinUserOpponentBoard(opponentBoard,userBoard);
                    gameBoard.showGameBoard();
                    gameBoard.showPersonalBoard();

                    switch (difficulty) {
                        case "HARD":
                            hardGame(opponentName);
                            break;
                        case "MEDIUM":
                            mediumGame(opponentName);
                            break;
                        case "EASY":
                            easyGame(opponentName);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    String[] arr = difficultySelectionMenu();
                    if (arr[0] != "tugberk" && arr[1] != "tugberk") {
                        difficulty = arr[0];
                        opponentName = arr[1];
                    }
                    break;
                case 3:
                    howToPlay(boardLength, boardHeigth);
                    scanner.nextLine();
                    break;
                case 4:
                    choice = -1;
                    break;
                default:
                    System.out.println(" You entered a wrong number, try to use menu next time :)");
            }
        }

        System.out.println(" Thanks for playing, this game implemented by Tuğberk Çoban ");
    }

    public static int menu(String opponentName, String difficulty) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to Battleship!\n");
        System.out.println(" 1. Play a Game with " + opponentName + " (Difficulty Level : " + difficulty + ")");
        System.out.println(" 2. Choose Difficulty");
        System.out.println(" 3. How to play");
        System.out.println(" 4. Exit");
        System.out.print("\n Choice : ");

        return Integer.parseInt(scanner.nextLine());
    }

    public static String[] difficultySelectionMenu() {
        String[] myArr = new String[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which commander will be your opponent? (Exit by any other number)");
        System.out.println(" 1. Admiral Red Beard, he will burry you in deep oceans!                            ---> Difficulty : *****");
        System.out.println(" 2. Lieutenant Harvy, he maybe seems not so hard but has own tricks to defeat you!  ---> Difficulty : ***");
        System.out.println(" 3. Seaman Mason, he is a newbie in navy, but try his best                          ---> Difficulty : *");
        System.out.print("\n Choice : ");

        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                myArr[0] = "HARD";
                myArr[1] = "Admiral Red Beard";
                break;
            case 2:
                myArr[0] = "MEDIUM";
                myArr[1] = "Lieutenant Harvy";
                break;
            case 3:
                myArr[0] = "EASY";
                myArr[1] = "Seaman Mason";
                break;
            default:
                myArr[0] = "tugberk";
                myArr[1] = "tugberk";
                break;
        }
        return myArr;
    }

    public static void howToPlay(int boardLength, int boardHeigth) {
        System.out.println("\nHow to play section :\n");
        System.out.println("This is a Single Player BattleShip game. Every player has 2 battleships, a big one (SSSS) and a small one (SS) ");
        System.out.println("and a board which has " + boardLength + "x" + boardHeigth + " size. like this :");
        System.out.println("\n   Admiral Red Beard\n");
        System.out.println("        A B C D E F \n        ----------- \n    1 | O - O O - O\n    2 | O O X O O O\n    3 | O O X O O O\n      | -----------\n    4 | O O S O O O\n    5 | O O S O S S\n    6 | O O X O O O\n");
        System.out.println("            You       ");
        System.out.println("\n There are also other symbols like :");
        System.out.println("O <--> water");
        System.out.println("S <--> ship");
        System.out.println("X <--> when your shot hits a ship");
        System.out.println("- <--> when your shot misses");
        System.out.println("Press ENTER key to continue...");
    }

    public static void hardGame(String opponentName) {

    }

    public static void mediumGame(String opponentName) {
    }

    public static void easyGame(String opponentName) {
    }

    public static Board randomBoardGenerator(int boardLength, int boardHeigth, int shipNumber) {
        Board myBoard = new Board(boardLength, boardHeigth);
        Random rand = new Random();
        int placedShips = 0;
        int x,y;
        int direction;

        while(placedShips < shipNumber){

            x = rand.nextInt(boardLength);
            y = rand.nextInt(boardHeigth);

            if(myBoard.board[x][y] == 'O'){

                direction = rand.nextInt(3);
                switch (direction){
                    case 0:
                        //right
                        if(x+1 < boardLength){
                            if (myBoard.board[x+1][y] == 'O'){
                                myBoard.board[x][y] = 'S';
                                myBoard.board[x+1][y] = 'S';
                                placedShips++;
                            }
                        }
                        break;
                    case 1:
                        //up
                        if(y+1 < boardHeigth){
                            if (myBoard.board[x][y+1] == 'O'){
                                myBoard.board[x][y] = 'S';
                                myBoard.board[x][y+1] = 'S';
                                placedShips++;
                            }
                        }
                        break;
                    case 2:
                        //left
                        if(x-1 >= 0){
                            if (myBoard.board[x-1][y] == 'O'){
                                myBoard.board[x][y] = 'S';
                                myBoard.board[x-1][y] = 'S';
                                placedShips++;
                            }
                        }
                        break;
                    default:
                        //down
                        if(y-1 >= 0){
                            if (myBoard.board[x][y-1] == 'O'){
                                myBoard.board[x][y] = 'S';
                                myBoard.board[x][y-1] = 'S';
                                placedShips++;
                            }
                        }
                        break;
                }
            }
        }
        return myBoard;
    }

    public static Board userBoardPlacement(int boardLength, int boardHeigth, int shipNumber){
        Board userBoard = new Board(boardLength,boardHeigth);
        Scanner scanner = new Scanner(System.in);
        int placedShips = 0;
        boolean letterFlag = true;
        boolean numberFlag = true;
        String choice;
        int x = 0,y = 0;
        int direction;

        while(placedShips < shipNumber){
            userBoard.showPersonalBoard();
            System.out.println("\nPlease give the coordinates for start point of your ship number "+(placedShips+1)+" : ");
            choice = scanner.nextLine();
            if(choice.length() == 2){
                switch (choice.toLowerCase().charAt(0)){
                    case 'a':
                        x = 0;
                        letterFlag = true;
                        break;
                    case 'b':
                        x = 1;
                        letterFlag = true;
                        break;
                    case 'c':
                        x = 2;
                        letterFlag = true;
                        break;
                    case 'd':
                        x = 3;
                        letterFlag = true;
                        break;
                    case 'e':
                        x = 4;
                        letterFlag = true;
                        break;
                    case 'f':
                        x = 5;
                        letterFlag = true;
                        break;
                    default:
                        System.out.println("Wrong letter coordinate given, try again");
                        letterFlag = false;
                }
                y = Integer.parseInt(String.valueOf(choice.charAt(1)));
                y--;
                if (y < boardHeigth && y >= 0)
                    numberFlag = true;
                else
                    numberFlag = false;

                if(letterFlag && numberFlag){
                    if (userBoard.board[x][y] == 'O'){
                        System.out.println("Which direction do you want to place this ship?");
                        System.out.println("1. Right");
                        System.out.println("2. Up");
                        System.out.println("3. Left");
                        System.out.println("4. Down");

                        direction = Integer.parseInt(String.valueOf(scanner.nextLine()));
                        if(direction < 4 && direction >= 0){
                            switch (direction){
                                case 1:
                                    //right
                                    if(x+1 < boardLength){
                                        if (userBoard.board[x+1][y] == 'O'){
                                            userBoard.board[x][y] = 'S';
                                            userBoard.board[x+1][y] = 'S';
                                            placedShips++;
                                        }else
                                            System.out.println("Invalid direction!");
                                    }
                                    break;
                                case 2:
                                    //up
                                    if(y+1 < boardHeigth){
                                        if (userBoard.board[x][y+1] == 'O'){
                                            userBoard.board[x][y] = 'S';
                                            userBoard.board[x][y+1] = 'S';
                                            placedShips++;
                                        }else
                                            System.out.println("Invalid direction!");
                                    }
                                    break;
                                case 3:
                                    //left
                                    if(x-1 >= 0){
                                        if (userBoard.board[x-1][y] == 'O'){
                                            userBoard.board[x][y] = 'S';
                                            userBoard.board[x-1][y] = 'S';
                                            placedShips++;
                                        }else
                                            System.out.println("Invalid direction!");
                                    }
                                    break;
                                default:
                                    //down
                                    if(y-1 >= 0){
                                        if (userBoard.board[x][y-1] == 'O'){
                                            userBoard.board[x][y] = 'S';
                                            userBoard.board[x][y-1] = 'S';
                                            placedShips++;
                                        }else
                                            System.out.println("Invalid direction!");
                                    }
                                    break;
                            }
                        }else
                            System.out.println("İnvalid Choice!");
                    }else
                        System.out.println("Given start coordination is invalid, try again");
                }else
                    System.out.println("Invalid coordinates!");
            }else
                System.out.println("Choice must be a valid coordinate (ex. a3)");
        }
        return userBoard;
    }

    public static Board joinUserOpponentBoard(Board opponentBoard, Board userBoard){
        int boardHeigth = opponentBoard.boardHeigth*2;
        Board gameBoard = new Board(opponentBoard.boardLength,boardHeigth);

        for(int x = 0; x < gameBoard.boardLength; x++)
            for (int y = 0; y < gameBoard.boardHeigth; y++)
                if(y < opponentBoard.boardHeigth)
                    gameBoard.board[x][y] = opponentBoard.board[x][y];
                else
                    gameBoard.board[x+ opponentBoard.boardHeigth][y+opponentBoard.boardHeigth] = userBoard.board[x][y];

        return gameBoard;
    }
}
