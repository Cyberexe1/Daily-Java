// ShapeManager.java
import java.util.*;

public class ShapeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.println("Shape Manager");
        System.out.println("1. Add Circle");
        System.out.println("2. Add Rectangle");
        System.out.println("3. Add Triangle");
        System.out.println("4. Show All Shapes");
        System.out.println("5. Exit");

        while (true) {
            System.out.print("\nChoose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    shapes.add(new Circle(r));
                    System.out.println("Circle added!");
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double w = sc.nextDouble();
                    shapes.add(new Rectangle(l, w));
                    System.out.println("Rectangle added!");
                    break;
                case 3:
                    System.out.print("Enter side a: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter side b: ");
                    double b = sc.nextDouble();
                    System.out.print("Enter side c: ");
                    double c = sc.nextDouble();
                    shapes.add(new Triangle(a, b, c));
                    System.out.println("Triangle added!");
                    break;
                case 4:
                    int index = 1;
                    for (Shape shape : shapes) {
                        System.out.println("\nShape " + (index++) + ":");
                        System.out.println("Area: " + shape.getArea());
                        System.out.println("Perimeter: " + shape.getPerimeter());
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
