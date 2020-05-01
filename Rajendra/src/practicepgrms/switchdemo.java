/**
 * 
 */
package practicepgrms;

import java.util.Scanner;

/**
 * @author Rajendra
 *
 */
public class switchdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ENTER CHOICE");
		  Scanner read = new Scanner(System.in);
		  int num = read.nextInt();
		  switch(num)
		  {
		  case 1:
	    	  System.out.println("ONE");
	    	  break;
		  case 2:
	    	  System.out.println("TWO");
	    	  break;
		  case 3:
	    	  System.out.println("THREE");
	    	  break;
	      default:
	    	   System.out.println("Wrong choice");
		  }

	}

}
