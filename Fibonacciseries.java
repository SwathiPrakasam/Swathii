package assignment1;

public class Fibonacciseries {

	public static void main(String[] args) {
		int num=8;
		int first=0;
		int sec=1;
		int sum=0;
		for(int i=1;i<num;i++)
		{
			sum=first+sec;
			
			first=sec;
			sec=sum;
	
			System.out.println(sum);System.out.println(sum);
			
		}
                                                                             
	

	}
}