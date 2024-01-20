import java.util.*;
class Person
{
    private String name;
    private int age;
    private String gender;
    private String add;
    public Person(){
        name=new String();
        age=10;
        gender=new String();
        add=new String();
    }
    public Person(String  nm,int ag,String gn,String ad){
        name=new String(nm);
        age=ag;
        gender=new String(gn);
        add=new String(ad);
    }
    public void input(){
        System.out.println("---------------------------------------------------------------------------");
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the name: ");
        name= x.next();
        System.out.println("Enter the Age: ");
        age=x.nextInt();
        System.out.println("Enter the Gender: ");
        gender=x.next();
        System.out.println("Enter the Address: ");
        add=x.next();
    }
    public void show(){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+add);
    }
}

class Student extends Person
{
    private int roll;
    private String course;
    private float marks[];

    public Student(){
        roll=0;
        course=new String();
        marks=new float[5];
    }
    public Student(int rl,String nm,int ag,String gn,String cr,float []mk,String ad){
        super(nm,ag,gn,ad);
        roll=rl;
        course=new String(cr);
        marks=new float[mk.length];
        for (int i=0;i< marks.length;i++){
            marks[i]=mk[i];
        }

    }
    public void calculate(){
        float t=0.0f;
        for (int i = 0; i < marks.length; i++) {
            t=t+marks[i];
        }
        System.out.println("\nTotal Marks = "+t);
        float av=t/5;
        System.out.println("Average marks: "+av);
    }
    public void input1(){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter Roll no: ");
        roll=x.nextInt();
        System.out.println("Enter Course Name: ");
        course=x.next();
        System.out.println("Enter the Marks of five  subject: ");
        for(int i=0;i< marks.length;i++){
            marks[i]=x.nextInt();
        }

    }
    public void show1(){
        System.out.println("Roll No: "+roll);
        System.out.println("Course Name : "+course);
        System.out.println("Marks of five subjects is: ");
        for (int i = 0; i < marks.length ; i++) {
            System.out.print(marks[i]+"   ");
        }

    }
}

public class Student1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.input();
        s1.input1();
        s1.show();
        s1.show1();
        s1.calculate();

        float []mk= new float[5];
        Scanner x=new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("Enter the marks of five subject: ");
        for (int i = 0; i < mk.length; i++) {
            mk[i]= x.nextInt();
        }
        System.out.println("------------------------------------------------------------");
        Student s2=new Student(1,"Ram",20,"Male","BBA",mk,"Muz");
        s2.show();
        s2.show1();
        s2.calculate();
    }
}
