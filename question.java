package Strings;
public class question {
    public static double shortestpath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            // east
            if(str.charAt(i)=='E'){
                x++;

            }
            // west
            else if(str.charAt(i)=='W'){
                x--;
            }
            // north
            else if(str.charAt(i)=='N'){
                y++;
            }
            // south
            else{
                y--;
            }
        }
        int X2= x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(shortestpath(str));
    }
}