package Vipin;

public class method_overloading {
    static  void fo()
    {
        System.out.println("Hello V.I.P !");
    }static  void fo(int  a)       //In this code we are using a parameters in tha functions.
    {
        System.out.println("Hello V.I.P !  "  +a +  "  How are you?");
    }

    public static void main(String[] args) {
        int m=3;
        fo();   //There are automatically catch the without argument.
        fo(m); //There are automatically catch the with argument (given the integer m=3).

    }
}
