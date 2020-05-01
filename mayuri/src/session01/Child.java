package session01;

public class Child extends Parent {
	public Child()
	{
		System.out.println("Child class Default constructor");
	}

	public Child(int no)
	{
		super(15);
		System.out.println("Child class parameterized constructor");
	}
	public static void main(String[] args) {
		Child c = new Child(10);

	}

}
