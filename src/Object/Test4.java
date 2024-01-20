package Object;

import java.util.Scanner;

class Employee
{
    private int id;
    private String name;
    private String post;
    private String dept;
    private int sal;
    private String add;
    public Employee()
    {
        id=1;
        name=new String();
        post=new String();
        dept=new String();
        sal=50000;
        add=new String();
    }
    public Employee(int idd,String nm,String pst,String  dpt,int sl,String ad){
        id=idd;
        name=new String(nm);
        post=new String(pst);
        dept=new String(dpt);
        sal=sl;
        add=new String(ad);
    }
    public  Employee(Employee x){
        id=x.id;
        name=new String(x.name);
        post=new String(x.post);
        dept=new String(x.dept);
        sal=x.sal;
        add=new String(x.add);
    }
    public void input(){
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        Scanner x=new Scanner(System.in);
        System.out.println("Enter Employee Id: ");
        id=x.nextInt();
        System.out.println("Enter Employee Name: ");
        name=x.next();
        System.out.println("Enter Employee Post: ");
        post=x.next();
        System.out.println("Enter Employee Department: ");
        dept=x.next();
        System.out.println("Enter Employee  Basic Salary: ");
        sal=x.nextInt();
        System.out.println("Enter Employee Address: ");
        add=x.next();
    }
    public  void show(){
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("Employee Details: ");
        System.out.println("Employee Id: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Post: "+post);
        System.out.println("Employee Department: "+dept);
        System.out.println("Employee Basic Salary: "+sal);
        System.out.println("Employee Address: "+add);
    }
    public void grosssalary(){
        float gs=sal+(4*sal);
        System.out.println("Employee Gross salary: "+gs);
    }
}
public class Test4
{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.input();
        e1.show();
        e1.grosssalary();

        Employee e2=new Employee(11,"Rajiv","Coder","Testing",500000,"Muzaffarpur");
        e2.show();
        e2.grosssalary();

        Employee e3=new Employee(e1);
        e3.show();
        e3.grosssalary();
    }
}
