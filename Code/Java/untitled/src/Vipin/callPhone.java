package Vipin;

class phone{
    public void ringing()
    {
        System.out.println("Ringing......");
    }

    public void vibrate()
    {
        System.out.println("Vibrating......");
    }
    public void mute()
    {
        System.out.println("mute");
    }
}


public class callPhone {
    public static void main(String[] args) {
        phone  realme= new phone();
        realme.ringing();

    }
}
