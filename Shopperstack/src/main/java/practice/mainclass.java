package practice;
interface make
{
	void hi();
	void bye();
}
class makes implements make
{
	public void hi()
	{
		System.out.println("Hello Boyzzzz");
	}
	public void bye()
	{
		System.out.println("Hello Everyone");
	}
}
public class mainclass 
{
	public static void main(String[] args) 
	{
	  makes m=new makes();
	  m.hi();
	  m.bye();
	}
}
