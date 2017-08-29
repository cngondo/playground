package animal.overriding;

public class Dog extends Animal {

    // Overriden method from class Animal
    public void move(){
        System.out.println("Dogs can walk and run");
    }

    public void bark(){
        System.out.println("Dogs can bark");
    }

}
