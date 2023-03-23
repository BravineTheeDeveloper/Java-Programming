package Interface;

interface Shape {
    double area();
    double perimeter();
   }
   // Represents circles.
   class Circle implements Shape {
        private double radius;
        // Constructs a new circle with the given radius.
        public Circle(double radius) {
        this.radius = radius;
        }
        // Returns the area of this circle.
        public double area() {
        return Math.PI * radius * radius;
        }
        // Returns the perimeter of this circle.
        public double perimeter() {
        return 2.0 * Math.PI * radius;
        }
    }
   // Represents rectangles.
   class Rectangle implements Shape {
        private double width, height;
        // Constructs a new rectangle with the given dimensions.
        public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // Returns the area of this rectangle.I
        public double area() {
        return width * height;
    }
    // Returns the perimeter of this rectangle.
        public double perimeter() {
        return 2.0 * (width + height);
    }
   }
   // Represents triangles.
   class Triangle implements Shape {
        private double a, b, c;
        // Constructs a new Triangle given side lengths.
        public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // Returns this triangle's area using Heron's formula.
        public double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    // Returns the perimeter of this triangle.
        public double perimeter() {
        return a + b + c;
        }
    }
   public class Interface{
   public static void printInfo(Shape s) {
        System.out.println("The shape: " + s);
        System.out.println("area : " + s.area());
        System.out.println("perim: " + s.perimeter());
        System.out.println();
   }
        public static void main(String[] args){
        Shape[] shapes = {new Circle(12.0), new Rectangle(4, 7), new
        Triangle(5, 12, 13)};
        for (int i = 0; i < shapes.length; i++) {
            printInfo(shapes[i]);
        }
   }
}