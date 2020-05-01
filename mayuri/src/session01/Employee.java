package session01;

public class Employee
{
	private int EmpId;
	private String EmpNm;
	private float salary;
	
	
	public Employee()
	{
		System.out.println("Default Constructor");
		EmpId = 112;
		EmpNm = "Rajendra";
		salary = 12000.87f;
	}
	
	public Employee (int empId,String empNm,float salary )
	{
		this.EmpId = empId;
		this.EmpNm = empNm;
		this.salary = salary;
	}

	public void Display()
	{
		System.out.println("Emloyee Details="+EmpId+" "+EmpNm+" "+salary);
	}
	public static void main(String[] args) 
	{
		Employee e = new Employee(1,"Rajendra",12600.36f);
		e.Display();


	}

}
