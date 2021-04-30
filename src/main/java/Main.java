import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String opponentName = "Admiral Red Beard";
        String difficulty = "HARD";
        int choice = 0;
        int boardLenght = 6;
        Board board = new Board(boardLenght);

        while (choice != -1) {

            choice = menu(opponentName, difficulty);

            switch (choice) {
                case 1:
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
                    howToPlay(boardLenght);
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
        System.out.println(" Welcome to Battleship! ");
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

    public static void howToPlay(int boardLenght) {
        System.out.println("\nHow to play section :\n");
        System.out.println("This is a Single Player BattleShip game. Every player has 3 battleships ");
        System.out.println("and a board which has " + boardLenght + "x" + boardLenght + " size. like this :");
        System.out.println("OOOOOO\nOOOOOO\nOOOOOO\nOOOOOO\nOOOOOO\nOOOOOO\n");
        System.out.println("\n There are also other symbols like :");
        System.out.println("O <--> water");
        System.out.println("S <--> ship");
        System.out.println("X <--> when your shot hits a ship");
        System.out.println("- <--> when your shot misses");
    }

    public static void hardGame(String opponentName) {


    }

    public static void mediumGame(String opponentName) {
    }

    public static void easyGame(String opponentName) {
    }
}
