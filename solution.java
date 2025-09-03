// class Solution {
// public static int substring(String s){
//     int length=s.length();
//     int max=0;
   
// for (int i = 0; i < length-1; i++) {
//             for (int j = i + 1; j <= length; j++) {
//                 String ch=s.substring(i, j);
//                 int currentmax=0;
//                 int max=chkstring(ch);
                
                
               
                
//             }
             
       
    
//         }
//     public static int chkstring(String s){
        
//     for(int i=0;i<s.length()-1;i++){
//         for(int j=i+1;j<s.length();j++){
//             if(s.charAt(i)==s.charAt(j)){
//                 current++;
//                  if(currentmax>1){
//                 break;
//                 }
//             }else{
//                 max=s.lenth();
//             }
//         }
//     }
//     }

 
// }
    
// public static void  main(String[] args){
//   String s="pwwkew";
//   System.out.println(substring(s));
  
// }
   

// }


class Solution {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int width = right - left;
            System.out.println(width);
            System.out.println("left height" + height[left]);
            System.out.println("right height is"+height[right]);
            int minHeight = Math.min(height[left], height[right]);
            System.out.println("mini height is"+ minHeight);
            int area = width * minHeight;
            max = Math.max(max, area);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
    
      public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
      }
 
}
              
        
       

    




    

   
