class square 
{
    void area() 
	{
        int side = 2;
        int area = side * side;
        System.out.println("The Area of Square is : " + area);
    }
}

class Main 
{
    public static void main(String args[])
	{
        square s = new square();
        s.area();
    }
}
