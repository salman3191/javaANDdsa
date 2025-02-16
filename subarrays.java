package javaDsa;

public class subarrays {
    public static void SubArrays(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++ ){ 
                    System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];
                }
                if(largest<sum){
                    largest=sum;
                }
                System.out.print(" sum is : "+sum);
                System.out.println(); 
            }
            System.out.println();
        }
         System.out.println("largest of subaarys is"+largest);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        SubArrays(numbers);
    }
}

