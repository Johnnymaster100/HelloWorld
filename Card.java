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

    public String getCard()
    {
        return value + " of " + suit;
    }

    public int getWorth()
    {
        return worth;
    }

    public String interpretValue(int i) {
        return "The value of the card is " + i;
    }

    public String interpretValue(String s) {
        return "The value of the card is " + s;
    }
}
