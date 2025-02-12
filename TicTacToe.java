import java.util.Scanner;

public class TicTacToe {
    static char[][] board = new char[3][3];
    static int turns = 0;

    public static void main(String[] args) {
        initializeBoard();
        playGame();
    }

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard() {
        System.out.println("\n-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
        System.out.println("\nNomor posisi baris dan kolom:");
        System.out.println("Baris 0: 0 1 2");
        System.out.println("Baris 1: 0 1 2");
        System.out.println("Baris 2: 0 1 2");
        System.out.println ("");
        System.out.println("Pilih posisi dengan memasukkan nomor baris dan kolom, misalnya '1 1' untuk posisi tengah.");
    }

    // Fungsi utama permainan
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            int row, col;
            String player = (turns % 2 == 0) ? "Player 1 (O)" : "Player 2 (X)";
            System.out.println(player + ", it's your turn!");
            System.out.print("Enter row and column (0, 1, or 2) separated by a space: ");
            row = scanner.nextInt();
            col = scanner.nextInt();

            if (!isValidMove(row, col)) {
                System.out.println("Invalid move! Please choose an empty spot within the range of 0, 1, or 2.");
                continue;
            }

            board[row][col] = (turns % 2 == 0) ? 'O' : 'X';

            if (checkWinner()) {
                printBoard();
                System.out.println(player + " wins!");
                break;
            }

            if (turns == 8) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            turns++;
        }
        scanner.close();
    }

    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row <= 2 && col >= 0 && col <= 2 && board[row][col] == '-';
    }

    public static boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
                return true;
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
            return true;
        }

        return false;
    }
}
