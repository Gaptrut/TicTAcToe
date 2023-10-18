import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public void gameLoop() {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'x';
        Board board = new Board();
        System.out.println("\uD83C\uDF1FWelcome to a thrilling game of Tic Tac Toooe!\uD83C\uDF1F");


        while (true) {
            playerTurn(scanner, board, currentPlayer);
            board.printBoard();

            if (board.hasWinner()) {
                System.out.println("Player " + currentPlayer + " is the Winner!!\uD83C\uDF89 " +
                        "Start a new game!");
                board = new Board();
                currentPlayer = 'x';
            }
            else if (board.isBoardFull() &&
                    !board.hasWinner()) {
                System.out.println("It's a draw, start a new game!");
                board = new Board();
                currentPlayer = 'x';
            } else {
                currentPlayer = (currentPlayer == 'x' ? 'o' : 'x');
            }
        }
    }
    private void makeMove(int computerMove, char currentPlayer) {
    }


    public void playerTurn(Scanner scanner, Board board,
                           char currentPlayer) {
        int playerMove;
        do {
            System.out.println("Player " + currentPlayer +
                    " Your turn! Choose 1 - 9: ");
            playerMove = scanner.nextInt();
            if (playerMove < 1 || playerMove > 9) {
                System.out.println("Oops! That number is out of range. " +
                        "Try again!");


            }else  if (board.isSquareTaken(playerMove)) {
                System.out.println("It's taaaaken! Try again.");
            }
        }while (playerMove < 1 || playerMove > 9 || board.isSquareTaken(playerMove));

        board.updateBoard(playerMove, currentPlayer);

    }
}


