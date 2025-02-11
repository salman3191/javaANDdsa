public class javaBasics{
  public static void floydsTrg(int rows){
    int count=1;
    for(int i=1;i<=rows;i++){
      for(int j=1;j<=i;j++){
        System.out.print(count+" ");
        count++;
      }
    
      
      System.out.println();
     
    }
   
  }
  public static void main(String[] args) {
    floydsTrg(5);
  }
}
