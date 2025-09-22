class bank
{
private int balance;
public int getamount(int amount);
{
	balance += amount;
}
public int display()
{
	return balance;
}
public class Main
{
	public static void main(String args[]);
	{
		balance b=new balance();
		b.getamount(5000,2000);
		b.display();
	}
}
}