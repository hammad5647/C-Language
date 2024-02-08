import java.util.Scanner;
class Salary
{
	public static void main(String args[])
	{
		int y;
		
		Scanner s1=new Scanner (System.in);
		
		System.out.print("Enter the Total year of Experience :");
		y=s1.nextInt();
		
		if(y==1)
		{
			System.out.print("Your Salary will be 15k per month");
		}
		else if(y==2)
		{
			System.out.print("Your Salary will be 20k per month");
		}
		else if(y==3)
		{
			System.out.print("Your Salary will be 30k per month");
		}
		else if(y==4)
		{
			System.out.print("Your Salary will be 40k per month");
		}
		else if(y>=5)
		{
			System.out.print("Your Salary will be 55k per month");
		}
	}
}