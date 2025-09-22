// Single inheritance
class univercity
{
	String collageid;
	String collagename;
}
class collage extends univercity
{
	String branch;
}
public class SingleInheritance1ex
{
	public static void main(String args[])
	{
		collage clg=new collage();

clg.collageid="172";
clg.collagename="SVML";
clg.branch="BCS.SY";

System.out.println(clg.collageid);
System.out.println(clg.collagename);
System.out.println(clg.branch);
	}
}
