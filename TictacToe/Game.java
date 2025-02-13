import java.util.Scanner;

public class Game {
    private Board board;
    private int turns;
    private Scanner scanner;

    public Game() {
        board = new Board();
        scanner = new Scanner(System.in);
        turns = 0;
    }

    public void playGame() {
        while (true) {
            board.printBoard();
            String player = (turns % 2 == 0) ? "Player 1 (O)" : "Player 2 (X)";
            char symbol = (turns % 2 == 0) ? 'O' : 'X';
            System.out.println(player + ", it's your turn!");
            System.out.print("Enter row (0 1 2) and column (0 1 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!board.isValidMove(row, col)) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board.makeMove(row, col, symbol);
            turns++;

            if (board.checkWinner()) {
                board.printBoard();
                System.out.println(player + " wins!");
                break;
            }
            if (board.isFull()) {
                board.printBoard();
                System.out.println("It's a draw!");
                break;
            }
        }
        scanner.close();
    }
}
