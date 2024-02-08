import java.util.Scanner;
class Evenodd
{
	public static void main(String[] b)
	{
		int a;
		
		System.out.print("Enter the Number :");	
		
		Scanner s1=new Scanner(System.in);
		
		a=s1.nextInt();
		
		if(a%2==0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}
	}
}