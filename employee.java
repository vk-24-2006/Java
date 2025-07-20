class employee
{
	int salary;
	String name;
	int empno;

	void disp()
	{
		System.out.println("Name : "+name);
		System.out.println("Employee no : "+empno);
	}

	void calcsal()
	{
		System.out.println("The salary of the employee is "+salary);
	}
}


class programmer extends employee
{
	int bonus;
	void get_bonus()
{
	bonus=salary+1000;
	System.out.println("The total salary is "+bonus);
}
}

class emp{
public static void main(String args[])
{
programmer emp1=new programmer();
emp1.name="Vivek";
emp1.empno=8;
emp1.salary=100000;
emp1.disp();
emp1.calcsal();
emp1.get_bonus();
}
}