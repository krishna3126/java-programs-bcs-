class square1
 {
    void area()
	{
        int s = 2;
        int area = s * s;
        System.out.println("The area of Square is : " + area);
    }
}

 class Main
{
   public static void Main(String[] args) 
	{
        square1 a = new square1();
        a.area();
    }
}
