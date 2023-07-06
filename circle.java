class Circle
{
    double radius;
    double findArea()
    {
          return Math.PI*Math.pow(radius,2);
    }
    double findCircumference()
    {
        return 2*Math.PI*radius;
    }
       public static void main(String[] args)
    {
          Circle myCircle = new Circle();
          myCircle.radius=7;
          System.out.println("The area of theCircle is: " + myCircle.findArea());
          System.out.println("The circumference of theCircle is: " + myCircle.findCircumference());
    }
  }
