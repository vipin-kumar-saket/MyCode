package oops_java;


abstract class parent2 {
    public parent2(){
        System.out.println("I am constructors of base 2 class .");
    }
    public  void SayHello(){
        System.out.println("Hello good morning dosto.");

    }
     abstract public  void Greet();

}

class  child2 extends  parent2{
    @Override
    public  void Greet(){
        System.out.println("Good morning !");

    }

}

abstract class child3 extends parent2{
    public  void ch(){
        System.out.println("This class of ch");
    }
}

public class Abstract {
    public static void main(String[] args) {
        child2 c= new child2();


    }
}
