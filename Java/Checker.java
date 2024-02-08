import java.util.Scanner;
class Checker
{
	public static void main(String[] b)
	{
		int a;
		
		System.out.print("Enter the Number :");	
		
		Scanner s1=new Scanner(System.in);
		
		a=s1.nextInt();
		
		if(a>=0)
		{
			System.out.println("Number is Positive");
		}
		else
		{
			System.out.println("Number is Negative");
		}
	}
}