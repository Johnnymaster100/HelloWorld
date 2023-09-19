public class Main {
  
  public static String division(int i, int j){
    if (j == 0) {
      return "Cannot divide by zero!"; }
    else {
      return Integer.toString(i / j); }
  }
  
  public static void main(String[]args) {
    
    Card card = new Card("Five", "Diamonds");
    
    Card worth = new Card(5);
    
    System.out.println("Your card is the " + card.getCard() + "!");
    
    if (worth.getWorth() == 1)
    {
      System.out.println("Your card is worth " + worth.getWorth() + " point.");
    }
    else {
      System.out.println("Your card is worth " + worth.getWorth() + " points.");
    }
  }
}
