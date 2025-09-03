package oops;

public class inter {
     public static void main(String[] args) {
        queen q=new queen();
        q.moves();
        //  for multiple inheritance
        Bear b = new Bear();

        Herbivore h = b;
        Carnivore c = b;

        h.eat(); // calls Bear's eat()
        c.eat(); // same method, but from Carnivore reference

        b.eatPlants(); // specific to herbivore behavior
        b.eatMeat();   // specific to carnivore behavior


     }
    
}
interface Chessplayer {
        void moves();
    }
    interface Herbivore{
        void eat();
    }
      interface Carnivore{
        void eat();
    }
    class Bear implements Herbivore,Carnivore{
        public void eat() {
        System.out.println("eats plants and meat");
    }

    public void eatPlants() {
        System.out.println("Bear eats berries and grass");
    }

    public void eatMeat() {
        System.out.println("Bear hunts fish and small animals");
    }

    }

   class queen implements Chessplayer{
    public void moves(){
        System.out.println("up , down , right , left ,down(in all 4 directions)");
    }
   }
   class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up ,down , left , right");
    }
    
   }
   class king implements Chessplayer{
        public void moves(){
            System.out.println("up , down ,left , right,diagonal(by 1 step)");
        }
    }
    

