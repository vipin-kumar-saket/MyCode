package oops_java;
import java.util.*;

class A{

    int a;

    public int vip(){
        return 5;

    }

    public void meth2(){

        System.out.println("I am a method 2 of class A");
    }
}
class B extends A{
           @Override
    public void meth2(){
        System.out.println("I am a method 2 of class B");       //this is method overriding because same method in tha A class and B class
    }
    public void meth3(){
        System.out.println("I am a method 3 of class B");
    }

}
public class method_overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();

        B b=new B();
        b.meth2();

    }
}
