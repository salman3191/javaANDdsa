package javaDsa;

public class subarrays {
    public static void SubArrays(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        int sum=0;
        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                 sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
               
                if(largest<sum){
                    largest=sum;
                }
                
            }
            
        }
         System.out.println("max of subaarys is"+" "+largest);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        SubArrays(numbers);
    }
}

