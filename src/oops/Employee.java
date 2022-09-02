package oops;

public class Employee 

{

int empid;
String empname;
int salary;
int deptno;	

//Employee(int id, String ename, int sal, int dno)
//{
//empid =id;
//empname=ename;
//salary=sal;
//deptno=dno;
//}

void setdata(int id, String name,int sal,int dno)
{
empid =id;
empname=name;
salary=sal;
deptno=dno;
}
void display()
{

	System.out.println(empid);
	System.out.println(empname);
	System.out.println(salary);
	System.out.println(deptno);
}
public static void main(String[] args) {
{
	// 2nd method : Assigning values to class variable using constructor
	
	/*Employee emp1 = new Employee(123,"Ranjit", 30000,40);
	emp1.display();
	
	Employee emp2 = new Employee(434,"Ranju", 30050,45);
	emp2.display();*/
	
	
	
	
	
	
	
//Assignning values to clqss variable using object - first method
	/*Employee emp1 = new Employee();// 1st Employee
	  
	emp1.empid=1234;
	emp1.empname="Rakesh Kumar";
	emp1.salary=10000;
	emp1.deptno=1231;
	emp1.display();

	
	System.out.println("This is 2nd Line of object");

	
	Employee emp2 = new Employee(); //2nd Employee
	emp2.empid=9089;
	emp2.empname="Raju Kumar";
	emp2.salary=10001;
	emp2.deptno=1111;
	emp2.display();*/
	
	Employee emp1 = new Employee();
	emp1.setdata(101,"Raj", 200000, 21);
	emp1.display();
}
}
}