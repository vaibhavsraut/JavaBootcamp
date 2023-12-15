//Vaibhav Raut

import java.util.Random;

public class SnakeAndLadder {
    private static final int WINNING_POSITION = 100;
    private static final int START_POSITION = 0;

    public static void main(String[] args) {
        playGameWithSinglePlayer();
        playGameWithTwoPlayers();
    }

    private static void playGameWithSinglePlayer() {
        int playerPosition = START_POSITION;
        int diceRolls = 0;

        while (playerPosition < WINNING_POSITION) {
            int diceValue = rollDice();
            int option = getOption();

            switch (option) {
                case 0:
                    break;
                case 1:
                    playerPosition += diceValue;
                    break;
                case 2:
                    playerPosition -= diceValue;
                    break;
            }


            if (playerPosition < START_POSITION) {
                playerPosition = START_POSITION;
            }


            if (playerPosition > WINNING_POSITION) {
                playerPosition -= diceValue;
            }

            diceRolls++;
            System.out.println("Player Position: " + playerPosition);
        }

        System.out.println("Player won the game in " + diceRolls + " dice rolls");
    }

    private static void playGameWithTwoPlayers() {
        int player1Position = START_POSITION;
        int player2Position = START_POSITION;

        int player1Turns = 0;
        int player2Turns = 0;

        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {
            player1Position = playTurn(player1Position, "Player 1");
            player1Turns++;

            if (player1Position >= WINNING_POSITION) {
                System.out.println("Player 1 won the game in " + player1Turns + " turns");
                break;
            }

            player2Position = playTurn(player2Position, "Player 2");
            player2Turns++;

            if (player2Position >= WINNING_POSITION) {
                System.out.println("Player 2 won the game in " + player2Turns + " turns");
                break;
            }
        }
    }


    private static int playTurn(int playerPosition, String playerName) {
        int diceValue = rollDice();
        int option = getOption();

        switch (option) {
            case 0:
                break;
            case 1:
                playerPosition += diceValue;
                break;
            case 2:
                playerPosition -= diceValue;
                break;
        }


        if (playerPosition < START_POSITION) {
            playerPosition = START_POSITION;
        }


        if (playerPosition > WINNING_POSITION) {
            playerPosition -= diceValue;
        }

        System.out.println(playerName + "'s Position: " + playerPosition);
        return playerPosition;
    }

    private static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    private static int getOption() {
        Random random = new Random();
        return random.nextInt(3);
    }
}
