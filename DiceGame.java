public class MainBranch {
  public static void main(Strings[] a) {
    run();
  }
  
  public void run() {
     int a,b;

     a=dice();
     b=dice();
     System.out.println("dice1: "+a+"\ndice2: "+b+"\ntotal"+(a+b));
  }
  
  public int dice() {
    return (int)(Math.random()*6+1);
  }
}
