package unit12.Homework.Shape;

public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getGetPerimeter() {
        return a + b + c;

    }

    @Override
    public double getGetArea() {
        double s = (a + b + c) / 2;
        System.out.println("Zwischenergebnis für Area: " + s);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}


