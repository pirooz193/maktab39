import java.util.Scanner;

public class Dooz {
    Scanner scanner = new Scanner(System.in);


    static int cntr = 0;//COUNTER FOR CHECKING THAT BOARED IS FULL OR NOT.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dooz dooz = new Dooz();
        int m, n, player1, player2;
        System.out.printf("ENTER THE NUM OF ROWS : ");
        m = scanner.nextInt();
        System.out.printf("ENTER THE NUM OF COLUMNS : ");
        n = scanner.nextInt();
        String[][] board = new String[m][n];
        String player1Name, player2Name, player1Mark = " o ", player2Mark = " * ";
        System.out.println("ENTER YOUR NAMES");
        System.out.printf("PLAYER 1 : ");
        player1Name = scanner.next();
        System.out.printf("PLAYER 2 : ");
        player2Name = scanner.next();
        System.out.printf("%s  IS : \"%s\"\n", player1Name, player1Mark);
        System.out.printf("%s  IS : \"%s\"\n", player2Name, player2Mark);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = " . ";
            }
        }

        System.out.println("ENTER NUMBER OF COLUMN ( 0 TO " + (n - 1) + ") : ");
        while (dooz.cntr <= (m * n)) {
            System.out.printf("%s turn : ", player1Name);
            player1 = scanner.nextInt();
            dooz.beadsForPlayer1(board, player1, player1Mark);
            System.out.printf("%s turn : ", player2Name);
            player2 = scanner.nextInt();

            dooz.beadsForPlayer2(board, player2);

            System.out.printf("  +");
            for (int i = 0; i < 2 * n; i++) {
                System.out.printf(" -");
            }
            System.out.println();
            for (int i = 0; i < board.length; i++) {
                System.out.printf("%d |", i);
                for (int j = 0; j < n; j++) {

                    System.out.printf("%s ", board[i][j]);
                }
                System.out.printf("|");

                System.out.println();
            }
            System.out.printf("  +");
            for (int i = 0; i < 2 * n; i++) {
                System.out.printf(" -");
            }
            System.out.println();


            for (int i = 0; i < n; i++) {
                System.out.printf("   %d", i);
            }
            System.out.println();
            if (dooz.player1CheckWinner(board, n, player1Mark)) {
                System.out.println("CONGRAGULATIONNN!\n " + player1Name + " IS WINNER ! :)");
                break;
            } else if (dooz.player2CheckWinner(board, n, player2Mark)) {
                System.out.println("CONGRAGULATIONNN!\n" + player2Name + " IS WINNER ! :)");
                break;
            }
        }


    }


    public void beadsForPlayer1(String[][] board, int num, String player1Mark) {
        cntr++;
        for (int i = board.length - 1; i >= 0; i--) {

            if (board[i][num] == " . ") {
                board[i][num] = player1Mark;
                break;
            }
            if (board[i][num] != " . ") continue;

        }
    }

    public void beadsForPlayer2(String[][] board, int num) {
        cntr++;
        for (int i = board.length - 1; i >= 0; i--) {

            if (board[i][num] == " . ") {
                board[i][num] = " * ";
                break;
            }
            if (board[i][num] != " . ") continue;

        }
    }

    public boolean player1CheckWinner(String[][] board, int n, String player1Mark) {

        for (int i = 0; i < n; i++) {
            int cntr2 = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != player1Mark) cntr2 = 0;

                if (board[j][i] == player1Mark) {
                    cntr2++;
                    if (cntr2 == 4) return true;
                }
            }
        }
        return false;
    }

    public boolean player2CheckWinner(String[][] board, int n, String player2Mark) {
        horizontal(board, n, player2Mark);
        vertical(board, n, player2Mark);
        diagonal(board, n, player2Mark);

        return false;

    }

    public static boolean diagonal(String[][] board, int n, String playerMark) {
        for (int line = 1; line <= (board.length + n - 1); line++) {

            int start_col = Math.max(0, line - board.length);
            int count = Math.min(Math.min(line, (n - start_col)), board.length);

            int cntr4 = 0;
            for (int i = 0; i < count; i++) {

                if (board[Math.min(board.length, line) - i - 1][start_col + i] != playerMark) cntr4 = 0;
                if (board[Math.min(board.length, line) - i - 1][start_col + i] == playerMark) cntr4++;
                if (cntr4 == 4) return true;

            }
            int cntr5 = 0;
            for (int i = count - 1; i >= 0; i--) {

                if (board[Math.min(board.length, line) - i - 1][start_col + i] != playerMark) cntr5 = 0;
                if (board[Math.min(board.length, line) - i - 1][start_col + i] == playerMark) cntr5++;
                if (cntr5 == 4) return true;


            }
            int cntr6 = 0;
            for (int i = 0; i < count - 1; i++) {
                for (int j = 0; j < count; j++) {
                    if (board[i + 1][j] != playerMark) cntr6 = 0;

                    if (board[i + 1][j] == playerMark) {
                        cntr6++;
                        if (cntr6 == 4) return true;
                    }
                }
            }

        }
        return false;
    }


    public static boolean horizontal(String[][] board, int n, String playerMark) {

        for (int i = 0; i < board.length; i++) {//IN ONE ROW
            int cntr1 = 0;
            for (int j = 0; j < n; j++) {
                if (board[i][j] != playerMark) cntr1 = 0;

                if (board[i][j] == playerMark) {
                    cntr1++;
                    if (cntr1 == 4) return true;
                }


            }
        }

        return false;
    }

    public static boolean vertical(String[][] board, int n, String playerMark) {

        return false;
    }
}



