import java.util.Scanner;

public class DeckOfCards {

    // Method to initialize the deck of cards
    public static String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {

        int totalCardsRequired = players * cardsPerPlayer;

        if (totalCardsRequired > deck.length) {
            return null; // Cannot distribute
        }

        String[][] playerCards = new String[players][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }

        return playerCards;
    }

    // Method to print players and their cards
    public static void printPlayers(String[][] players) {

        System.out.println("\nCards Distribution:");
        System.out.println("----------------------------");

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Suits and Ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // Initialize deck
        String[] deck = initializeDeck(suits, ranks);

        shuffleDeck(deck);

        // User input
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        // Distribute cards
        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);

        if (distributedCards == null) {
            System.out.println("Cannot distribute cards. Not enough cards in the deck.");
        } else {
            printPlayers(distributedCards);
        }

        sc.close();
    }
}
