package session01;

public class InterfaceDemo implements Showable
{
	@Override
	public void print()
	{
		System.out.println("Printing");
	}
	
	@Override
	public int show (int n)
	{
		System.out.println("Showing");
		return 10;
	}

	public static void main(String[] args) {
		InterfaceDemo d = new InterfaceDemo();
		d.print();
		int n= d.show(11);
		System.out.println("n= "+ n);
		d.say();
	}

}
