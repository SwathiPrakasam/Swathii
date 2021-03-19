package assignment1;

public class Changeoddindextouppercase {

	public static void main(String[] args) {
		String str= "changeme";
		String str1=str.toUpperCase();
	
		char[]chrarr=str.toCharArray();
		char[]chrarr1=str1.toCharArray();
		
		
		
		for(int i=0;i<chrarr.length;i++)
		{
		
			
			if(i%2==0)
			{
			System.out.println(chrarr1[i]);
			}
			else
			{
				System.out.println(chrarr[i]);
			}
		}

	}

}
