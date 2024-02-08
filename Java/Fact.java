import java.util.Scanner;
class Fact
{
	public static void main(String args[])
	{
		int a,i,fact=1;
		
		Scanner s1=new Scanner (System.in);
	
		System.out.print("Enter the Number to find its faactorial :");
		a=s1.nextInt();
		
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
}