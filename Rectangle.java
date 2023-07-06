import java.util.Scanner;
public class Rectangle
{
    int length,width;
    int area()
    {
    	return length*width;
    }
    int perimeter()
    {
    	return 2*(length+width);
    }
    public static void main(String[] args)
    {
    	Rectangle rec=new Rectangle();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle: ");
        int len= reader.nextInt();
        System.out.println("Enter the length of the Rectangle: ");
        int wid = reader.nextInt();

        rec.length=len;
        rec.width=wid;

    	System.out.println("The area of the Rectangle is: " + 	rec.area() + "and perimeter is: " + rec.perimeter());
    }
}
