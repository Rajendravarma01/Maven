package practicepgrms;

public class Funcion_Demo {
	//member of class funcion_Demo
	static int n=1;
	static void display()     // using static in main no need to create object to call function
	//int n=1;
	//void display()
	{
		n++;
		System.out.println(n + "Testing");
		
	}

	public static void main(String[] args) {
		Funcion_Demo f = new Funcion_Demo();
		//function call
		//f.display();
		//f.display();
		display();
		display();

	}

}
