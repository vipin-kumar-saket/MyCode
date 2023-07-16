package Vipin;

class base01{
    base01(){
        System.out.println("I am a constructor");
    }
    base01(int x){
        System.out.println("I am overloaded constructor with value x :" + x);
    }

}

class derived01 extends base01{
    derived01(){
//        super(10);                        // This is used for constructor with argument
        System.out.println("I am a derived class constructor");
          }

    derived01(int x,int y){
        super(x);
        System.out.println("I am overloaded constructor of derived with value y :" + y );
    }
}

class chileDerived extends derived01{
    chileDerived(){
        System.out.println("I am a child of derived constructor ");
    }

    chileDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am overloaded constructor of derived with value z :" + z );
    }
}

public class constructors_inhrtitance {
    public static void main(String[] args) {
//       base01 b=new base01(10);
//        derived01 d=new derived01();
//        derived01 d=new derived01(15,10);
//        chileDerived c=new chileDerived();
        chileDerived cd=new chileDerived(10,12,15);
    }
}
