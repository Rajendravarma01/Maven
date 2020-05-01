package session01;

public interface Showable extends Printable{
	default void say() {
		System.out.println("This is default method");
	}
	static void sayHi() {
		System.out.println("Hi");
	}
	public abstract int show(int n);

}
