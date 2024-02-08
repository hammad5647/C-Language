import java.util.Scanner;
class Week
{
	public static void main (String[] z)
	{
		int no;
		
		System.out.print("Enter the Day Number :");
		
		Scanner s1=new Scanner (System.in);
		
		no=s1.nextInt();
		
		switch(no)
		{
			case 1:
				System.out.println("Monday");
				break;
			
			case 2:
				System.out.println("Tuesday");
				break;
			
			case 3:
				System.out.println("Wednesday");		
				break;
			
			case 4:
				System.out.println("Thursday");	
				break;
				
			case 5:
				System.out.println("Friday");			
				break;
			
			case 6:
				System.out.println("Saturday");		
				break;
			
			case 7:
				System.out.println("Sunday");
				break;
				
				default:
					System.out.println("Invalid Number Of week days");
		}	
	}
}