package assignment1;

public class Amstrongnumber {

	public static void main(String[] args) {
		int a=153;
		int temp=a;
		
		int c=0;
		int b=0;
		while(a>0)
		{
			c=a%10;
		b=b+c*c*c;
		a=a/10;}
	if(temp==b)
	{
		System.out.println("given number is amstrong");
			
	}	
	else
	{
		System.out.println("given number is not an amstrong number");
	}

	}

}
