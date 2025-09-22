import java.util.*;
public class arr1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		
		int[] arr=new int[3];
		
		
		System.out.println("Enter First Number : ");
		arr[0] =sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		arr[1] =sc.nextInt();
		
		System.out.println("Enter Third Number : ");
		arr[2] =sc.nextInt();
		
		System.out.println("The Numbers are : ");
		for(int i=0; i<arr.length; i=i+1)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}
}