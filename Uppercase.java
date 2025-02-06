import java.util.Scanner;
class Uppercase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		
		String a=(ch>=65 && ch<=97)?("Character is in uppercase"):("character is not in uppercase");
		System.out.println(a);
		
	}
}
