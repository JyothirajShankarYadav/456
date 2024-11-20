package practice;
class laptop
{
	void cost()
	{
		System.out.println("Depends on brand");
	}
}
class lenovo extends laptop
{
	void cost()
	{
		System.out.println("Basic model of Lenovo Thinkpad costs 45,000/-");
	}
}
class asus extends laptop
{
	void cost()
	{
		System.out.println("Basic model Asus costs 30,000/-");
	}
}
class spc
{
	public static void meet(laptop m)
	{
		m.cost();
	}
}
public class poly 
{
 public static void main(String[] args) 
 {
	laptop l=new lenovo();
	laptop a=new asus();
	spc.meet(a);
	spc.meet(l);
 }
}
