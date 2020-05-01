/**
 * 
 */
package practicepgrms;

import java.util.Scanner;

/**
 * @author
 *
 */
public class Arithfunction {
	
	Scanner read = new Scanner(System.in);
	int a = read.nextInt();
	int b = read.nextInt();
	void arithmatic()
	{
		/**System.out.println("ENTER TWO NUMBER");
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int b = read.nextInt();*/
		System.out.println("Addition="+ (a+b));
		System.out.println("Sub="+ (a-b));
		System.out.println("Mul="+ (a*b));
		System.out.println("Div="+ (a/b));
		System.out.println("Mod="+ (a%b));
			
	}
	/**void add()
	{
		System.out.println("ENTER TWO NUMBER");
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int b = read.nextInt();
		System.out.println("Addition="+ (a+b));
			
	}
	void sub()
	{
		System.out.println("ENTER TWO NUMBER");
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int b = read.nextInt();
		System.out.println("Substraction="+ (a-b));
			
	}
	void mul()
	{
		System.out.println("ENTER TWO NUMBER");
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int b = read.nextInt();
		System.out.println("Multiplication="+ (a*b));
			
	}
	void div()
	{
		System.out.println("ENTER TWO NUMBER");
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int b = read.nextInt();
		System.out.println("Division="+ (a/b));
			
	}
	void mod()
	{
		System.out.println("ENTER TWO NUMBER");
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int b = read.nextInt();
		System.out.println("Division="+ (a%b));
			
	}*/
	public static void main(String[] args) {
		// objects created
		System.out.println("ENTER TWO NUMBER");
		Arithfunction a = new Arithfunction();
		/**Arithfunction a = new Arithfunction();
		Arithfunction b = new Arithfunction();
		Arithfunction c = new Arithfunction();
		Arithfunction d = new Arithfunction();
		Arithfunction e = new Arithfunction();
		//functions called
		a.add();
		b.sub();
		c.mul();
		d.div();
		e.mod();*/
		a.arithmatic();
		
		
	}

}
