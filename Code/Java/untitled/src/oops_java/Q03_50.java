package oops_java;
import java.util.*;


class Game{
    public  int number;
    public  int input;
    public  int numberOfGuesses;

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

     Game(){
        Random ran= new Random();
        this.number= ran.nextInt(100);
    }

    void takeInput(){
       Scanner sc= new Scanner(System.in);
        System.out.print("Guess the number :");
         input=sc.nextInt();

    }
    boolean isCorrectNumber(){
        if(input==number){
            return true;
        }
        else if (input<number) {
            System.out.println("Too low...");

        }
        else if (input>number) {
            System.out.println("Too high...");

        }
         return false;
    }
}

public class Q03_50 {
    public static void main(String[] args) {

        Game g= new Game();
        int count=0;
        boolean b=false ;
        while(!b) {
            count++;
            g.takeInput();
           b= g.isCorrectNumber();
            System.out.println(b);


        }
        System.out.println("Total no of guesses: " +count);
    }
}
