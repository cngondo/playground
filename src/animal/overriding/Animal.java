package animal.overriding;


/*
* Testing on overriding methods. Observe how the objects behave*
* */
public class Animal {
    public void move(){
        System.out.println("Animals can move");
    }

    class Dog extends Animal{
        public void move(){
            System.out.println("Dogs can walk and run");
        }

        public void bark(){
            System.out.println("Dogs can bark");
        }
    }
}
