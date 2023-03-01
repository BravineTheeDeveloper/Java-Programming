import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int retry = 0;
        do {
            System.out.println("Enter your choice of shape:\n1. Triangle\n2. Rectangle\n3. Circle");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the base and height of the triangle:");
                    double base = input.nextDouble();
                    double height = input.nextDouble();
                    double triangleArea = 0.5 * base * height;
                    System.out.println("The area of the triangle is: " + triangleArea);
                    break;
                case 2:
                    System.out.println("Enter the length and breadth of the rectangle:");
                    double length = input.nextDouble();
                    double breadth = input.nextDouble();
                    double rectangleArea = length * breadth;
                    System.out.println("The area of the rectangle is: " + rectangleArea);
                    break;
                case 3:
                    System.out.println("Enter the radius of the circle:");
                    double radius = input.nextDouble();
                    double circleArea = Math.PI * radius * radius;
                    System.out.println("The area of the circle is: " + circleArea);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    retry++;
            }
        } while (retry < 3 && (choice < 1 || choice > 3));
    }
}
