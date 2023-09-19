public class Card {
  
  //attributes
  private String value;
  private String suit;
  private int worth;
  
  public Card(String v, String s)
  {
    value = v;
    suit = s;
  }
  
  public Card(int w)
  {
    worth = w;
  }
  
  public void spin()
  {
    System.out.println("Ooh... Fancy!");
  }
  
  public void toss()
  {
    System.out.println("Whoosh!");
  }
  
  public String getCard()
  {
    return value + " of " + suit;
}
  
  public int getWorth()
  {
    return worth;
  }
}
