package Vipin;

class tommyVecetti{
    String hitting;
    String running;
    String firing;
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }

    public void fire(){
        System.out.println("firing on the enemy");
    }
}


public class obj_tom_game {
    public static void main(String[] args) {

        tommyVecetti g1=new tommyVecetti();
        g1.hit();
        g1.run();
        g1.fire();


    }
}
