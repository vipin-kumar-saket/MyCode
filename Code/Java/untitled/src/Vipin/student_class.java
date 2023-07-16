package Vipin;
import java.util.*;

class Student{
    String name;

    int age;
    int rollnumber;

    public void prints()
    {
        System.out.println("Your name is : "+this.name);
        System.out.println("Your age is : "+this.age);
        System.out.println("Your roll number is : "+this.rollnumber);
    }

}


public class student_class {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number you want to perfrom a operation:");
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            Student s=new Student();
            System.out.print("Enter your name :");

            s.name=sc.nextLine();

            System.out.print("Enter your age :");
            s.age=sc.nextInt();
            System.out.print("Enter your roll number :");
            s.rollnumber=sc.nextInt();
            s.prints();
        }


    }
}
