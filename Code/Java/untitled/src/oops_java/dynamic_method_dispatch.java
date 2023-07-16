package oops_java;

// this is a supper class
class  phone{
    public void ShowTime(){
        System.out.println("Time is 3:55 AM ");
    }
    public void on(){
        System.out.println("Turning on  phone....");
    }

}

// This a subclass of supper class or this is a prent class of A
class smartPhone extends phone{

    public void music(){
        System.out.println("Playing music....");
    }

    @Override
    public void on(){
        System.out.println("Turning on smartPhone....");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {

        /*
        phone obj= new phone();                         // This is allowed
        smartPhone smobj= new smartPhone();             // This is allowed

        obj.greet();

         */

        phone obj= new smartPhone();             // This is allowed  because , this  object of subclass

//        smartPhone obj2= new phone();        // This is not allowed because there is reference of smartPhone and object are phone

        obj.ShowTime();
        obj.on();
//        obj.music                            // This is not allowed


    }
}
