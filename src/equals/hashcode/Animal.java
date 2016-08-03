package equals.hashcode;

/**
 * Created by ngondo on 8/2/16.
 */
public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return name.equals(animal.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public static void main(String... args){
        Animal a = new Animal("Robby");
        Animal b = new Animal("Robby");
        /*
        * The test for semantic equality here passes due to implementation of the equals object
        * generated to test the equality.
        *
        * Whenever you implement equals(), you must also implement hashCode().
        * */
        System.out.println(a.equals(b));
        /*
        * However, the object references are not the same even if they are semantically equal.
        * */
        System.out.print(a==b);
    }
}
