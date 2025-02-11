public class butterflypattern{
    public static void butterfly(int rows){
        for(int i=1;i<=rows;i++){
            //starts -i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=2*(rows-i);j++){
                System.out.print(" ");
            }
            // stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
           
        }
        for(int i=rows;i>=1;i--){
            //starts -i
        for(int j=1;j<=i;j++){
         System.out.print("*");
         }
        // spaces
         for(int j=1;j<=2*(rows-i);j++){
         System.out.print(" ");
      }
      // stars-i
       for(int j=1;j<=i;j++){
       System.out.print("*");
     }
          System.out.println();
              }
       
    }

    public static void main(String[] args) {
        butterfly(4);
    }
}