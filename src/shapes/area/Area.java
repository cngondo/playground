package shapes.area;

import java.util.Scanner;

/**
 * Created by ngondo on 2/22/16.
 */
public class Area {
    public static void main(String[]args){
        //Create a new object of the class Circle that has the necessary methods
        Circle circle = new Circle();
        //prompt user for input
        System.out.println("Enter radius of a circle: ");
        //capture the input
//        double r = new Scanner(System.in).nextDouble();
        //use the circle object to set the radius as the input
        circle.setRadius(67);
        //Finally capture the radius and capture the area in the output
        System.out.print("A circle with radius " + circle.getRadius() + " has an area of " + circle.getArea());
    }
}
