public class arr3
{
	public static void main(String args[])
	{
		int a=0;
		int arr3[]={1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr3.length; i=i+1)
		{
			a += arr3[i];
		}
		System.out.println("The sum is : "+a);
	}
}