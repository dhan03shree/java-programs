//by using third variable temp
class SwapNumbers 
{
	public static void main(String[] args) 
	{
		int a=4;
		int b=2;
		System.out.println("Before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
