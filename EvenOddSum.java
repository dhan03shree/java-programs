class EvenOddSum 
{
	public static void main(String[] args) 
	{
		int num=7627;
		int evenSum=0;
		int oddSum=0;
		int temp=0;
		
		int rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		
		num=num/10;
		rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		
		num=num/10;
		rem=num%10;
		temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		
		num=num/10;
		rem=num%10;
        temp=(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);

		System.out.println("Even sum:"+evenSum);
		System.out.println("odd sum:"+oddSum);
	}
}
