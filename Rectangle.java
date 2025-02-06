import java.util.Scanner;
class Rectangle
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the height:");
	  int height=sc.nextInt();
	  System.out.println("enter the width:");
	  int width=sc.nextInt();
	  int area=height*width;
	  System.out.println("Area:"+area);
	  int peri=2*(height+width);
	  System.out.println("Perimeter:"+peri);
	}
}

