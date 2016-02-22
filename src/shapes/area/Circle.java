package shapes.area;

/**
 * Created by ngondo on 2/22/16.
 */
public class Circle {
    final double PI = 3.142; //constant PI

    double radius;
    double area;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
