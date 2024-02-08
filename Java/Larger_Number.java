import java.util.Scanner;
class Larger_Number
{
	public static void main (String[] z)
	{
		int no1,no2,no3;
		
		Scanner s1=new Scanner(System.in);
		
		System.out.print("Enter the value Of no.1 :");		
		no1=s1.nextInt();
		System.out.print("Enter the value Of no.2 :");
		no2=s1.nextInt();
		System.out.print("Enter the value Of no.3 :");
		no3=s1.nextInt();
		
		if(no1>no2)
		{
			if(no1>no3)
			{
				System.out.print("No1 is Big !");
			}
			else
			{
				System.out.print("No3 is Big !");
			}
		}
		else
		{
			if(no2>no3)
			{
				System.out.print("No2 is Big !");
			}
			else
			{
				System.out.print("No3 is Big !");
			}
		}	
	}
}