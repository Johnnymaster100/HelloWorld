import java.util.Random;

public class Main {
  
  public static void main(String[]args) {
    Random rand = new Random();
    int rand_int = rand.nextInt(13) + 1;
    String card_value = Integer.toString(rand_int);
    if (card_value.equals("1")) {
      card_value = "Ace";
    }
    else if (card_value.equals("11")) {
      card_value = "Jack";
    }
    else if (card_value.equals("12")) {
      card_value = "Queen";
    }
    else if (card_value.equals("13")) {
      card_value = "King";
    }
    
    rand_int = rand.nextInt(4) + 1;
    String card_suit = Integer.toString(rand_int);
    if (card_suit.equals("1")) {
      card_suit = "Spades";
    }
    else if (card_suit.equals("2")) {
      card_suit = "Hearts";
    }
    else if (card_suit.equals("3")){
      card_suit = "Diamonds";
    }
    else if (card_suit.equals("4")) {
      card_suit = "Clubs";
    }
    
    Card rand_card = new Card(card_value, card_suit);
    
    System.out.println("Your randomly generated card is the: " + rand_card.getCard());
  }
}
