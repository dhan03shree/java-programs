import java.util.Scanner;
class Temperature 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter degree in celsius:");
		double cel=sc.nextDouble();
		double Fah=(9.0/5) * cel + 32;
		System.out.println(cel+" celsius is "+Fah+" Fahrenheit");
	}
}
