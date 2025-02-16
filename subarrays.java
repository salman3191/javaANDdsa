package javaDsa;

public class subarrays {
   
    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;//ms=maximun sum
        int maxnegative=Integer.MIN_VALUE;
        int cs=0;//cs=current sum
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            ms=Math.max(cs,ms);
            maxnegative=Math.max(maxnegative, numbers[i]);
            if(cs<0){
                cs=0;
            }
            
        }
        ms=ms==Integer.MIN_VALUE?maxnegative:ms;
     System.out.println("maximun of subarrays sum :"+ms);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,-1,-2,-3};
        kadanes(numbers);
       
    }
}

