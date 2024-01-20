package Object;
import java.util.Scanner;
class Student
{
    private int roll;
    private String name;
    private String  course;
    private float []mark;
    private String add;
    public Student(){
        roll=1;
        name=new String();
        course=new String();
        mark=new float[5];
        for (int i = 0;i<mark.length;i++)
        {
            mark[i]=1.0f;
        }
        add=new String();
    }
    public Student(int rol,String nm,String cor,float []mak ,String ad){
        roll=rol;
        name=new String(nm);
        course=new String(cor);
        mark=new float[5];
        for (int i = 0; i < mak.length; i++) {
            mark[i]=mak[i];
        }
        add=new String(ad);
    }
    public Student(Student x){
        roll=x.roll;
        name=new String(x.name);
        course=new String(x.course);
        mark=new float[5];
        for (int i = 0; i <mark.length ; i++) {
           this.mark [i]=x.mark[i];
        }
        add=new String(x.add);
    }
    public void input(){
        System.out.println("--------------------------------------------------------------------------------------------");
        Scanner x=new Scanner(System.in);
        System.out.println("Enter Student Roll No: ");
        roll=x.nextInt();
        System.out.println("Enter Student Name: ");
        name=x.next();
        System.out.println("Enter Student Course: ");
        course=x.next();
        System.out.println("Enter the marks of five subject of student: ");
        for (int i = 0; i <5 ; i++) {
            mark[i]=x.nextFloat();
        }
        System.out.println("\nEnter Student Address: ");
        add= x.next();
    }
    public  void show(){
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Student details: ");
        System.out.println("Student Roll No: "+roll);
        System.out.println("Student Name: "+name);
        System.out.println("Student course: "+course);
        System.out.println("Student Marks of five subjects is: ");
        for (int i = 0; i < mark.length; i++) {
            System.out.print(mark[i]+"    ");
        }
        System.out.println("\nStudent Address: "+add);
    }
    public void total(){
        float tol=0.0f;
    for (int i = 0; i < mark.length; i++) {
        tol=tol+mark[i];
    }
    System.out.println("Total Marks of five subjects is: "+tol);
    float avg=tol/5;
    System.out.println("Average marks of five subjects is: "+avg);
  }
}
public class Test5 {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
       Student s1=new Student();
        s1.input();
        s1.show();
        s1.total();

        float mk[]=new float[5];
        for(int i=0;i<mk.length;i++)
        {
            System.out.println("Enter the marks");
            mk[i]=sc.nextFloat();
        }

        Student s2=new Student(101,"Shyam","bca",mk,"patna");
        s2.show();
        s2.total();

        Student s3=new Student( s1);
      s3.show();
      s3.total();
    }
}
