package oops_java;

abstract  class pen{
    void write(){
        System.out.println("hello i am writing ");
    }
    void refill(){
        System.out.println("refilling the pen");

    }
}

class fountainPen extends pen{
    public void changeNib(){
        System.out.println("changing Nib...");
    }

}
public class Q55_01 {
    public static void main(String[] args) {
        fountainPen p1=new fountainPen();
        p1.write();
        p1.refill();
        p1.changeNib();

    }
}
