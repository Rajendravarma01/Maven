package practicepgrms;

import java.util.Scanner;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /**String names[] = new String[3];
        names[0]="A";
        names[1]="B";
        names[2]="C";
        
        System.out.println("First:"+names[0]);
        System.out.println("Second:"+names[1]);
        System.out.println("Third:"+names[2]);*/
		int num[] = new int[10];
		int sum=0,sum1=0;
		System.out.println("Enter any 10 num....");
		for(int i=0;i<10;i++)
		{
			Scanner read = new Scanner(System.in);
			num[i]=read.nextInt();
		}
		System.out.println("Print Array value:");
		for(int i=0;i<10;i++)
		{
			System.out.println("num: " +num[i]);
			if(i%2==0)
			sum=sum+num[i];
			else
				sum1=sum1+num[i];	
				
		}
		System.out.println("even pos  Array Add^n="+ sum);
		System.out.println("odd pos Array Add^n="+ sum1);
	}

}
