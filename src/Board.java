public class Board {
    private char[][] board;

    public Board() {
        board = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                    //forloop börjar med i satt till 0 och fortsätter
                    // tills i är mindre än 3,
                    //med i ökande med 1 för varje iteration.
                }
            }
        }
        return true;
    }
    public boolean hasWinner() {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] &&
                    board[i][1] == board[i][2]) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != ' ' && board[0][i] == board[1][i] &&
                    board[1][i] == board[2][i]) {
                return true;
            }
        }

        if (board[0][0] != ' ' && board[0][0] == board[1][1] &&
                board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] &&
                board[1][1] == board[2][0]) {
            return true;
        }

        return false;
    }


    public void printBoard() {
        System.out.println(board[0][0] + " |" + board[0][1] + " |" + board[0][2]);
        System.out.println("--+--+--");
        System.out.println(board[1][0] + " |" + board[1][1] + " |" + board[1][2]);
        System.out.println("--+--+--");
        System.out.println(board[2][0] + " |" + board[2][1] + " |" + board[2][2]);
        System.out.println();
    }

    public void updateBoard(int position, char marker) {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        board[row][col] = marker;
        //beräknar rad och kolumn baserat på position
    }
    public boolean isSquareTaken(int move) {
        // Konvertera move till rad och kolumnindex
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;

        // Kontrollera om rutan är upptagen
        if (board[row][col] != ' ') {
            return true;
        } else {
            return false;
        }
    }



    public void makeMove(int move, char symbol) {
        //Switch (move) switchsatsen jämför värdet av move med varje case.
        switch (move) {
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][0] = symbol;
                break;
            case 3:
                board[0][0] = symbol;
                break;
            case 4:
                board[0][0] = symbol;
                break;
            case 5:
                board[0][0] = symbol;
                break;
            case 6:
                board[0][0] = symbol;
                break;
            case 7:
                board[0][0] = symbol;
                break;
            case 8:
                board[0][0] = symbol;
                break;
            case 9:
                board[0][0] = symbol;
                break;
        }

    }
}

