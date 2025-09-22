// Multilevel Inheritance
class a
{
	int length=2;
}
class b extends a
{
	int breadth=4;
	void calculate1()
	{
		int cal=length*breadth;
	}
	class a extends breadth
	{
		int height=3;
		void calculate2()
		{
			int cube=cal*height;
		}
		void display()
		{
			system.out.println(+length+breadth+cal+cube)
		}
	}
}