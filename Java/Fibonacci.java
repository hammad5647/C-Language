import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		int a=0,b=1,c=0,i;
		
		for(i=0;i<=10;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}		
	}
}