package car_game;

import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s;
        boolean b=false;
        while (true){
            s=sc.next();
            if(s.equals("start"))
            {
                if(b)
                System.out.println("car already is started");
                else {
                    b=true;
                    System.out.println("car is started");
                }
            }
             else if(s.equals("stop"))
            {
                if(!b)
                System.out.println("car already stopped ");
                else{
                    b=false;
                    System.out.println("car is stop");
            }
            }
           else if(s.equals("help"))
           {
                System.out.println(" Start -> Type start ");
                System.out.println(" stop -> Type stop ");
                System.out.println(" Exit -> Type exit ");
            }
            else if(s.equals("exit"))
            {
                    System.out.println("Quited");
                    break;
            }
            else
            {
                System.out.println("wrong input");
            }

        }
    }
}
