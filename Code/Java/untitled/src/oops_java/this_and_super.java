package oops_java;

class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a){
                 this.a=a;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am constructor of DoClsass");

    }
}


public class this_and_super  {
    public static void main(String[] args) {
//        EkClass e=new EkClass(20);
//        System.out.println(e.getA());

        DoClass d=new DoClass(30);

    }
}
