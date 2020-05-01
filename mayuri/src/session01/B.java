package session01;

public class B extends A{
	int b=11;
	
	public void getMsg()
	{
		System.out.println("In getMsg() of class B");
	}

	public static void main(String[] args)
	{
		A b = new B();
		b.get();
		System.out.println("no ="+b.no);
		((B)b).getMsg();
	}

	

}
