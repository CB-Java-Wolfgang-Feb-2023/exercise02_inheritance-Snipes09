package unit12.Homework.Shape;

public class Circle extends Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getGetPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getGetArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
