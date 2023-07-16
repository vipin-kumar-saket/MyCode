// There are we create interface of abstract class
package oops_java;

interface Bicycle{
    int num=40;
    void applyBreak(int decrement );
    void speedUp(int increment );
}
interface Blow_horn{
    int b_num=40;
    void blowHorn23();
    void blowHorn25();
}
class AvonCycle implements Bicycle ,Blow_horn{
    int speed =43;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBreak(int decrement){
        System.out.println("Appled  break ");
        speed=speed-decrement;
        System.out.println("The current speed is : " + speed);

    }
    public void speedUp(int increment) {
        System.out.println("Speed up");
        speed=speed+increment;
        System.out.println("The current speed is : " + speed);
    }

    public void blowHorn23(){
        System.out.println("Kabhi khushi kabhi gam pee pee peeee");
    }
   public void blowHorn25(){
       System.out.println("Ye Dil mage more poo poo pooooo");
   }

}

public class abstract_02_interface {
    public static void main(String[] args) {
        AvonCycle cycle1= new AvonCycle();
        cycle1.applyBreak(10);
        cycle1.speedUp(100);

        // You can create properties in interface
        System.out.println(cycle1.num);
        // You can not modify the properties in interface as they are final
//        cycle1.a=47;   // This is not allowed

        cycle1.blowHorn23();
        cycle1.blowHorn25();


    }
}
