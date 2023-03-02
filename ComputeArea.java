import java.util.Scanner;;
class Rectangle {
		private int length,width;
	void setLength(int l){
		length=l;
	}
	void setWidth(int w){
		width=w;
	}
	int  getLength(){
		return length;
	}
	int getWidth(){
		return width;
	}
		int findArea(){
			return length*width;
	}
}

public class ComputeArea{
	public static void main(String[] args) {
		Rectangle rec=new Rectangle();
		Scanner reader=new Scanner(System.in);
		int len, wid;
		System.out.println("Enter length and width of Rectangle");
		len=reader.nextInt();
		wid=reader.nextInt();
		rec.setLength(len);
		rec.setWidth(wid);
		System.out.println("Area of the Rectangle with length: " +
		rec.getLength() + " and "+rec.getWidth() +" is "+
		rec.findArea());
	  }

}
