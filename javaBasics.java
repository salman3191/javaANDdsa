public class javaBasics {
  public static void trg(int rows, int columns) {
    for (int i = 1; i <= rows; i++) {
    for(int j=1;j<=rows-i;j++){
      System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }

    System.out.println();
    }
    
  }

  public static void main(String[] args) {
   trg(4, 5);
  }
}
