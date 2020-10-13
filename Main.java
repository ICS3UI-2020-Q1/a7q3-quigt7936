import java.util.Scanner;
/**
 * Creates random amounts of astrics a given amount of times
 * @author Thomas Quigley
 */
public class Main {
  public static void chaos(int numbLines) {
    // makes numbLines amount of lines
    for (int i = 0; i < numbLines; i++) {
      // create the random
      int randNumb = (int)(Math.random()*(5 - 1 + 1)) + 1;
     
      // create a random amount of astrics
      for (int j = 0; j < randNumb - 1; j++) {
        System.out.print("*");
      }
      System.out.println("*");
    }
    
      
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //ask for the users number
    System.out.println("Please enter a number.");
    int numbLines = input.nextInt();
    // perform chaos
    chaos(numbLines);
    
  }
}
