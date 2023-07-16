package oops_java;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface  childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}


class  mySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("I am meth 01");
    }
    public void meth2(){
        System.out.println("I am meth 03");
    }
    public void meth3(){
        System.out.println("I am meth 03");
    }
    public void meth4(){
        System.out.println("I am meth 04");
    }
}
public class cwh_inhritance_in_interface {
    public static void main(String[] args) {
        mySampleClass obj= new mySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();

    }
}
