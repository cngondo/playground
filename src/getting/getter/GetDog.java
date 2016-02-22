package getting.getter;

/**
 * Created by ngondo on 2/2/16.
 */
public class GetDog {
    public static void main(String[]args){
        Dog dog = new Dog();
        dog.setSound("Woofwoof");
        String s = dog.getSound();
        System.out.print(dog.getSound());

        dog.setSound("Barfbarf");
        String b = dog.getSound();
        System.out.print("\n" + dog.getSound());
        dog.rawr("Woof woof");
    }
}
