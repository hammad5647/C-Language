import java.util.*;
class Sum
{
	public static void main(String args[])
	{
		int a,i,sum=0;
		
		Scanner s1=new Scanner (System.in);
		System.out.print("Enter the Number :");
		a=s1.nextInt();
		
		for(i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);				
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}