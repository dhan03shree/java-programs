import java.util.Scanner;
class Percentage 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks obtain:");
		float m=sc.nextFloat();
		float per=(m*100)/600;
		System.out.println("Percentage:"+per);
		System.out.println((per>=80)?("A grade"):((per>=60)?("B grade"):((per>=35)?("C grade"):("fail"))));
	}
}