package practice;
class atm
{
	private int pin=12345;
	public int getpin()
	{
		return pin;
	}
	public void setpin(int pin)
	{
		this.pin=pin;
	}
}
public class encap {

	public static void main(String[] args) 
	{
      System.out.println("Hello ");
      atm a=new atm();
      System.out.println(a.getpin());
      System.out.println("---------------------------");
      a.setpin(54321);
      System.out.println(a.getpin());
	}

}
