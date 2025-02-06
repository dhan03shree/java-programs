class Smallest 
{
	public static void main(String[] args) 
	{
		int a=21;
		int b=23;
		int c=11;
		
		int small=(a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		System.out.println("smallest:"+small);
	}
}
