import java.util.Scanner;
public class DiceGame {
  public static void main(Strings[] a) {
    run();
  }
  
  public void run() {
     int a,b;

    System.out.println("What is your name? ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("Hello, John!");
    
     a=dice();
     b=dice();
     System.out.println("dice1: "+a+"\ndice2: "+b+"\ntotal　"+(a+b));
  }
  
  public int dice() {
    return (int)(Math.random()*6+1);
  }
}
