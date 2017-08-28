package animal.overriding;
/*
* Implements the animal class
* */
public class TestDog {
    public static void main(String... args){
        /*
        * Make the Dog class static so that one can refer to it in the static contex of the main method
        *
        * */
        Animal animal = new Animal();
        Animal dog = new Dog();

//        Output in the console
        animal.move();
        dog.move();
        /*
        * The following throws an error simply because one cannot refer to the method inside its children
        * It can only refer to methods in the class. However, referring to Dog.bark() will work
        * */
//        dog.bark();
        new Dog().bark();// Works perfectly due to great object reference
    }
}
