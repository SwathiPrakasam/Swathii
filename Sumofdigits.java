package assignment1;

public class Sumofdigits {

	public static void main(String[] args) {

		int a=123;
		int sum=0;
		int temp=0;
		
	while(a>0)
	{
		temp=a%10;
	
	sum=sum+temp;
	a=a/10;
	}	
System.out.println(sum);
		


	}

}
