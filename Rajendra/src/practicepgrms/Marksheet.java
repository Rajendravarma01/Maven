/**
 * 
 */
package practicepgrms;

import java.util.Scanner;

/**
 * @author Rajendra
 *
 */
public class Marksheet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		int m1,m2,m3,m4,m5,total;
		System.out.println("Enter Five Subject Marks");
		m1 = read.nextInt();
		m2 = read.nextInt();
		m3 = read.nextInt();
		m4 = read.nextInt();
		m5 = read.nextInt();
		if(m1 < 40 || m2 <40 || m3 <40 || m4 <40 ||m5 <40)
			System.out.println("Failed");
			else
			{
		total=m1+m2+m3+m4+m5;
		float per = (float)total*100 /500;
		System.out.println(per);
		if(per<35)
			System.out.println("FAILED");
		else if(per<=35)
			System.out.println("PASS");
		else if(per<60)
			System.out.println("2nd CLASS");
		else if(per<75)
			System.out.println("1ST CLASS");
		else
			System.out.println("Distinction");
			}

	}

}
