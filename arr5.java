public class arr5
{
	public static void main(String args[])
	
	{
		int arr5[]={1,2,3,4,5};
		
		System.out.println("Before : ");
		for(int i = 0; i < arr5.length; i=i+1)
		{
			System.out.println(arr5[i]);
		}
		
		System.out.println("After : ");
		for(int i = 4; i < arr5.length; i=i-1)
		{
			System.out.println(arr5[i]);
		}
	}
}