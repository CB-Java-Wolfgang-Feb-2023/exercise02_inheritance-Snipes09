package unit12.Homework.Shape;

public class Rectangle extends Shape {

    private double a;
    private double b;


    public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
    }

    @Override
    public double getGetPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double getGetArea() {
        return a * b;
    }
}



