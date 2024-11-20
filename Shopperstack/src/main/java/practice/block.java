package practice;
class demo
{
	int m=17;
}
class sample extends demo
{
	void hi()
	{
		System.out.println("HIIIIIII");
	}
}
public class block 
{
  public static void main(String [] args) 
  {
	demo s=new sample();
	System.out.println(s.m);
	sample m=(sample)s;
	m.hi();
  }
}
