// public class javaBasics {
//   public static void printSubarrays(int nums[]){
//     int largest=Integer.MIN_VALUE;
//     int sum=0;
//     for(int i=0;i<nums.length;i++){
//         int start=i;
        
//         for(int j=i;j<nums.length;j++){
//             int end=j;
//             int k;
//             sum=0;
            
//             for( k=start;k<=end;k++){
//                 System.out.print(nums[k]+ " ");
                
//                 sum+=nums[k];
                
//             }
           
//             System.out.println();
            
//         }
//         System.out.println();
//         if(largest<sum){
//             largest=sum;
//         }
//         System.out.println(sum);
//     }
    
    
//     System.out.println(largest);
//   }
//   public static void main(String[] args) {
//     int nums[]={1,2,3,4,5,6,7,8};
//     printSubarrays(nums);
//   }
// }




// public class javaBasics{
//   public static int kadanes(int nums[]){
//     int ms=Integer.MIN_VALUE;
//     int cs=0;
//     for(int i=0;i<nums.length;i++){
//       cs=cs+nums[i];
//       if(cs<0){
//         cs=0;
//       }
//       ms=Math.max(cs, ms);
//     }
//     // how to return -1 when all nums are negative
//     if(ms==0){
//       return -1;
//     }


// return ms;
//   }
// public static void main(String[] args) {
//   int nums[]={1,-2,6,-1,3};
//  System.out.println(kadanes(nums)); 
// }
// }



// public class javaBasics{
//   public static int TrappedRainWater(int nums[]){
//     int n=nums.length;
//     int  leftMax[]=new int[n];
//     leftMax[0]=nums[0];
//     // calc left maximums
//     for(int i=1;i<n;i++){
//       leftMax[i]=Math.max(leftMax[i-1], nums[i]);
//     }
//     // cal right maxs
//     int rightMax[]=new int[n];
//    rightMax[n-1]=nums[n-1];
//     for(int i=n-2;i>=0;i--){
//       rightMax[i]=Math.max(rightMax[i+1], nums[i]);
//     }
//     int trappedwater=0;
//     for(int i=0;i<n;i++){
//       int waterlevel=Math.min(leftMax[i], rightMax[i]);
//       trappedwater+=waterlevel-nums[i];
//     }
//     return trappedwater;
//   }
//   public static void main(String[] args) {
//     int nums[]={4,2,0,6,3,2,5};
//     System.out.println(TrappedRainWater(nums));
//   }
// }

// public class javaBasics{
//   public static int buystock(int prices[]){
//   int maxprofit=0;
//   int buyprice=Integer.MAX_VALUE;
//   for(int i=0;i<prices.length;i++){
//     if(buyprice<prices[i]){
//       int profit=prices[i]-buyprice;
//       maxprofit=Math.max(maxprofit, profit);
//     }else {
//       buyprice=prices[i];
//     }
//   }
//   return maxprofit;
// }
// public static void main(String[] args) {
//   int  prices[]={7,1,5,3,6};
//  System.out.println(buystock(prices)); 
// }
// }
public class javaBasics{
  
  public static void bubblesort(int nums[]){
    int n=nums.length;
    for(int turns=0;turns<n-1;turns++){
      for(int j=0;j<n-turns-1;j++){
        if(nums[j]>nums[j+1]){
          int temp=nums[j];
          nums[j]=nums[j+1];
          nums[j+1]=temp;
  
        }
       
      }
      
    }
  }
  public static void printnums(int nums[]){
    for(int i=0;i<nums.length;i++){
System.out.println(nums[i]+" ");
    }
  }
  public static void main(String[] args) {
    int nums[]={5,3,6,2,1};
    bubblesort(nums);
    printnums(nums);

  }
}
  