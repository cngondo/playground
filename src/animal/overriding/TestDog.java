package animal.overriding;
/*
* Implements the animal class
* */
public class TestDog {
    public static void main(String... args){
       //Work with the objects to see the overriding effect
        Animal animal = new Animal();
        Animal dog = new Dog();
        Dog anotherDog = new Dog();

//        Output in the console
        animal.move();
        dog.move();
        /*
        * The following throws an error simply because one cannot refer to the method inside its children
        * It can only refer to methods in the class. However, referring to Dog.bark() will work
        * */
//        dog.bark();
        anotherDog.bark();// Works perfectly due to great object reference
    }
}
