package javaDsa;

public class arrays {
    
    public static int linearSearch(String menu[],String key){
        for(int i=1;i<menu.length;i++){
          if(menu[i]==key){
            return i;
          }
        }
        return -1;
      }
      public static void main(String[] args) {
        String menu[]={"samosa","butter chicken","momos","prizza"};
        String key="pri";
        int index=linearSearch(menu, key);
        if(index==-1){
          System.out.println("not found");
        }else{
          System.out.println("index of key :"+index);
        }
      }
}
