package String;

import java.util.Scanner;

class  Person
{
    private String name;
    private int age;
    private String gender;
    private String address;

    public Person(){
        name=new String();
        age=10;
        gender=new String();
        address=new String();
    }

    public Person(String nm,int ag,String gn,String ad){
        name=new String(nm);
        age=ag;
        gender=new String(gn);
        address=new String(ad);
    }

    public Person(Person x){
        name=new  String(x.name);
        age= x.age;
        gender=new String(x.gender);
        address=new String(x.address);
    }

    public void input(){
        Scanner x=new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Enter the name: ");
        name=x.nextLine();
        System.out.println("Enter the age: ");
        age=x.nextInt();
        System.out.println("Enter the gender: ");
        gender=x.next();
        System.out.println("Enter the address: ");
        address=x.next();
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    public void show(){
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Person Details: ");
        System.out.println("Person Name = "+name);
        System.out.println("Person Age = "+age);
        System.out.println("Person Gender = "+gender);
        System.out.println("Person Address = "+address);
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
}
public class StringPerson {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.input();
        p1.show();

        Person p2=new Person("Ram",24,"male","Patna");
        p2.show();

        Person p3=new Person(p1);
        p3.show();
    }
}
