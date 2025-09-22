import java.util.*;
public class ex6
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Your Marks : ");
	int m=sc.nextInt();
	
	if(m >= 80)
	{
		System.out.println("You Eligible for All Feilds");
	}
	else
	{
		if(m <= 80 && m >= 60)
		{
			System.out.println("You Eligible for Comerse");
		}
		else
		{
			System.out.println("You Not Eligible");
		}
	}
}
}