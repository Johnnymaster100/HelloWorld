import java.util.Scanner;



public class Main {
  
  public static String division(int i, int j){
    if (j == 0) {
      return "Cannot divide by zero!"; }
    else {
      return Integer.toString(i / j); }
  }
  
  public static void main(String[]args) {
    
    //Pause time
    try {
      Thread.sleep(10000);
    }
    
    catch(InterruptedException e) {
      System.out.println(e);
    }
    
    
    //Hello World project
    System.out.println("Hello, World!");
    System.out.println("My name is Jonathan, and I am a junior at Brooklyn Technical High School.");
    System.out.println("I have a few hobbies. For example, I am a magician and I love to entertain people with lots of tricks!");
    System.out.println("I am also a competitive swimmer. Overall, I have been swimming for over 10 years!");
    System.out.println("Well, that's all for now. And remember, don't have a good day, have a GREAT day!\n");
    
    
    //Variables and Data Types
    int x = 12;
    double y = 0.123456789;
    final boolean z = false;
    
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println();
    
    
    //Expressions and Assignment Statements
    int a = 42;
    double b = 3.14;
    boolean c = false;
    
    System.out.println(a + 10);
    System.out.println((b + 0.86) / 2);
    System.out.println(c);
    System.out.println(division(a, 0));
    System.out.println();
    
    
    //User Input
    Scanner s = new Scanner(System.in);
    
    System.out.println("What is your name?");
    String name = s.nextLine();
    
    System.out.println("What is your age?");
    int age = s.nextInt();
    
    System.out.println("What is your height in feet?");
    double height = s.nextDouble();
    
    System.out.println("True/False: Classical music is the superior music genre.");
    boolean classical_music = s.nextBoolean();
    
    System.out.println("Your name is " + name + ".");
    System.out.println("You are " + age + " years old.");
    System.out.println("Your height is " + height + " feet.");
    s = new Scanner(System.in);
    if (classical_music) {
      System.out.println("You think that classical music is the superior music genre.\n");
      
      System.out.println("What is your favorite classical music piece?");
      String favorite_classical_music = s.nextLine();
      
      System.out.println("Cool! Your favorite classical music piece is " + favorite_classical_music + ".\n");
    }
    else {
      System.out.println("You do not think that classical music is superior.\n");
      
      System.out.println("What is your favorite music genre?");
      String favorite_music_genre = s.nextLine();
      
      System.out.println("Your favorite music genre is " + favorite_music_genre + ".\n");
    }
    
    
    //Compound Assignment Operators
    Scanner scanner = new Scanner(System.in);
    
    int calculations = 3;
    int result = 0;
    
    System.out.println("Welcome to 'Create a Number by Adding'!");
    System.out.println("We start of with 0 and you enter numbers to add to it. You will add numbers to the previous one 3 times.");
    System.out.println("Let's begin!");
    
    System.out.println();
    System.out.println("Enter your first number: ");
    int num = scanner.nextInt();
    result += num;
    calculations --;
    
    System.out.println("Your number is currently: " + result + ". You have " + calculations + " entries left. Enter your second number: ");
    num = scanner.nextInt();
    result += num;
    calculations --;
    
    System.out.println("Your number is currently: " + result + ". You have " + calculations + " entry left. Enter your third number: ");
    num = scanner.nextInt();
    result += num;
    calculations --;
    
    System.out.println("Your final number is: " + result + "! Great job!");
    
    try {
      Thread.sleep(2000);
    }
    
    catch(InterruptedException e) {
      System.out.println(e);
    }
    
    System.out.println("And remember: Don't have a good day, have a GREAT day!");
  }
}
