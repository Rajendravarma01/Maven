package practicepgrms;

import java.util.Scanner;

public class Functionmarks {
	int[] input_marks()
	{
		int mark[]=new int[5];
		System.out.println("Enter 5 sub marks....!");
		for(int i=0;i<5;i++)
		{
			Scanner read = new Scanner(System.in);	
			mark[i]=read.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("mark: " +mark[i]);
		}
		return mark;
	}
	int caltotal()
	{
		int total=0;
		int m[]=input_marks();
		for(int i=0;i<5;i++)
			total=total+m[i];
		System.out.println("Total: " +total);
		return total;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionmarks m = new Functionmarks();
		m.input_marks();
		m.caltotal();

	}

}
