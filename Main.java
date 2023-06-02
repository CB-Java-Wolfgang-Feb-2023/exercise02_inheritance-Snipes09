package unit12.Homework.Shape;

public class Main {
    public static void main(String[] args) {

        System.out.println("Die Einheit ist in cm");
        System.out.println();

        Rectangle r1 = new Rectangle(3, 2);
        System.out.println("RECTANGLE");
        System.out.println("Perimeter: " + r1.getGetPerimeter());
        System.out.println("Area: " + r1.getGetArea());
        System.out.println();

        Triangle t1 = new Triangle(5, 5, 5);
        System.out.println("TRIANGLE");
        System.out.println("Perimeter: " + t1.getGetPerimeter());
        System.out.println("Area: " +t1.getGetArea());
        System.out.println();

        Circle c1 = new Circle(3);
        System.out.println("CIRCLE");
        System.out.println("Perimeter: " + c1.getGetPerimeter());
        System.out.println("Area: " +c1.getGetArea());
    }


}
