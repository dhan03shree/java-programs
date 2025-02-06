import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter operand 1: ");
		float a=sc.nextFloat();
		System.out.println("Enter operand 2: ");
		float b=sc.nextFloat();
		System.out.println("Enter operator: ");
		char ch=sc.next().charAt(0);
		System.out.println(ch== '+' ? a+b:
			      ch=='-'  ? a-b:
			      ch=='*'  ? a*b:
			      ch=='/'  ? a/b:
			      ch=='%'  ? a%b:
			      "invalid operator");
	}
}
