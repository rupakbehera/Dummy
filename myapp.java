import java.util.*;

class LudoGame {
    private static final int BOARD_SIZE = 40;
    private static final int NUM_PLAYERS = 4;

    private List<Player> players;
    private Board board;
    private int currentPlayerIndex;

    public LudoGame() {
        board = new Board(BOARD_SIZE);
        players = new ArrayList<>();
        for (int i = 0; i < NUM_PLAYERS; i++) {
            players.add(new Player("Player " + (i + 1)));
        }
        currentPlayerIndex = 0;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        while (!gameWon) {
            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.println(currentPlayer.getName() + ", it's your turn.");
            // Implement dice rolling and moving tokens logic here

            // Update currentPlayerIndex for the next turn
            currentPlayerIndex = (currentPlayerIndex + 1) % NUM_PLAYERS;
        }
    }
}

class Board {
    private int size;
    // Implement the board structure, token positions, etc.

    public Board(int size) {
        this.size = size;
        // Initialize the board and token positions
    }

    // Implement methods for moving tokens, checking for captures, etc.
}

class Player {
    private String name;
    // Implement player-specific properties like tokens, home area, etc.

    public Player(String name) {
        this.name = name;
        // Initialize player-specific properties
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        LudoGame game = new LudoGame();
        game.playGame();
    }
}