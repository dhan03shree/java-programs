class Reverse 
{
	public static void main(String[] args) 
	{
		int num=123;
		int dup=num;
		int rev=0;
		int rem=num % 10; //fetch 3 by 123%10
		rev=rev*10+rem; //3
		
		num=num/10;
		rem=num % 10; //fetch 2
		rev=rev*10+rem; //32
		
		num=num/10;
		rem=num%10; //fetch 1
		rev=rev*10+rem; //321
		System.out.println(dup+":"+rev);
		
	}
}
