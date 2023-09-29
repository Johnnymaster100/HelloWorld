import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        Deck deck = new Deck();
        boolean repeat = true;
        ArrayList<String> random_cards = new ArrayList<String>();

        System.out.println("Welcome to the Random Card Generator!");
        System.out.println("This random generator allows you to generate up to 13 random cards from a deck of cards, at once!");

        while(repeat) {
            random_cards.clear();
            System.out.println("Please enter how many random cards you would like to generate: ");

            int num_cards = scanner.nextInt();

            for (int i = 0; i < num_cards; i++) {
                int rand_int = rand.nextInt(52 - i);
                String abbrev_card = deck.randomCard(rand_int);
                String card_value;
                String card_suit = null;

                if (abbrev_card.charAt(0) == 'A') {
                    card_value = "Ace";
                } else if (abbrev_card.charAt(0) == 'J') {
                    card_value = "Jack";
                } else if (abbrev_card.charAt(0) == 'Q') {
                    card_value = "Queen";
                } else if (abbrev_card.charAt(0) == 'K') {
                    card_value = "King";
                } else if (abbrev_card.startsWith("10")) {
                    card_value = "10";
                } else {
                    card_value = abbrev_card.substring(0, 1);
                }

                if (abbrev_card.charAt(1) == 'S') {
                    card_suit = "Spades";
                } else if (abbrev_card.charAt(1) == 'H') {
                    card_suit = "Hearts";
                } else if (abbrev_card.charAt(1) == 'C') {
                    card_suit = "Clubs";
                } else if (abbrev_card.charAt(1) == 'D') {
                    card_suit = "Diamonds";
                } else {
                    if (abbrev_card.charAt(2) == 'S') {
                        card_suit = "Spades";
                    } else if (abbrev_card.charAt(2) == 'H') {
                        card_suit = "Hearts";
                    } else if (abbrev_card.charAt(2) == 'C') {
                        card_suit = "Clubs";
                    } else if (abbrev_card.charAt(2) == 'D') {
                        card_suit = "Diamonds";
                    }
                }

                Card random_card = new Card(card_value, card_suit);
                random_cards.add(random_card.getCard());
                deck.removeCard(rand_int);
            }

            System.out.println();
            System.out.println("Your randomly generated cards are:");
            System.out.println();
            for (int i = 0; i < num_cards; i++) {
                System.out.println((i + 1) + ": " + random_cards.get(i));
            }

            deck.resetDeck();

            Scanner new_scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Would you like to generate a new set of numbers: y/n");
            String prompt_repeat = new_scanner.nextLine();

            if (prompt_repeat.equals("n")){
                repeat = false;
            }
            System.out.println();

        }
        System.out.println("Thank you for using the 'Random Card Generator'!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("And remember, don't have a good day, have a GREAT day!");

    }
}
