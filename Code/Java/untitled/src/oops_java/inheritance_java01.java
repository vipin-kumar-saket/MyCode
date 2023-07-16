package oops_java;


 class base{
    int x;

     public int getX() {
         return x;
     }

     public void setX(int x) {
         System.out.println("i am in base and setting x now");
         this.x = x;
     }

     public void printme(){
        System.out.println("I am a constructor .");
    }

}

        // This derived class are used to based on the base class
            // The base class is child class
            // And derived class is parent class


                    //There are extends used for extends the base class in the derived class.


class derived extends base{
     int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("i am in base and setting y now");
        this.y = y;
    }
}



public class inheritance_java01 {
    public static void main(String[] args) {
        // Creating an objet of base class

        base b=new base();
        b.setX(4);
        System.out.println(b.getX());


        //Creating an object of derived class

        derived d=new derived();
        d.setY(48);
        System.out.println(d.getY());

    }
}
