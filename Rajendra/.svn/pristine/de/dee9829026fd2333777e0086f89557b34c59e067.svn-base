package practicepgrms;

import java.util.Scanner;

public class marksfunvtion {
	int[] getMarks()
	{
	Scanner read = new Scanner(System.in);
	int marks[] = new int[5];

	System.out.println("Enter the marks of five subjects : ");
	for(int i=0;i<5;i++)
	{
	marks[i] = read.nextInt();

	}
	return marks;
	}

	int calcTotal()
	{
	int total = 0;
	int m[] = getMarks();
	for(int i=0;i<5;i++)
	total+=m[i];
	System.out.println("Total=" + total);
	return total;
	}

	float calcPercentage()
	{
	float per = (float)calcTotal() * 100 / 500;
	System.out.println("Percentage" + per);
	return per;
	}

	void passOrFail()
	{
	float per =calcPercentage();
	if(per < 40)
	System.out.println("Failed");
	else if(per < 60)
	System.out.println("Second class");
	else if(per < 75)
	System.out.println("First class");
	else
	System.out.println("Distinction");
	}

	public static void main(String[] args) {
		marksfunvtion m = new marksfunvtion();
		m.passOrFail();


	}

}
