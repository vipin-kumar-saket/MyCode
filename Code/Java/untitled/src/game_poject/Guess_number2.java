package game_poject;

import java.util.*;

class game2{
    int guess=1,r,input;
    Scanner sc=new Scanner(System.in);

    game2(){
        Random ran = new Random();
           r = ran.nextInt(1,10);
        System.out.println("Enter a number betweem 1 to 10:");
    }

    public void takeUserInput(){
        input= sc.nextInt();
    }

    public void setGuess(){  guess++;}
    public int getGuess(){  return guess;}

    public void isCorrectNumber(){
        if(r==input){
            System.out.println("Congratulation ! Your number is correct");
        }
    }
}



public class Guess_number2 {
    public static void main(String[] args) {

        /*
               Create a class Game, Which allows a user to play "Guess the number "
               game once.

               Game should have the following method:

               1. constructor to generate a random numbers .
               2. takeUserInput() to take user input number .
               3. isCorrectNumber() to detect whether the number entered by the user is true
               4. getter and setter for noOfGuesses.

               user properties such as noOfGuesses (int), etc to get this task dome!.

         */


        Scanner sc=new Scanner(System.in);

        game2 g1=new game2();
        g1.takeUserInput();

        while(g1.r!=g1.input){
            if(g1.input < g1.r){
                System.out.println("Oops ! :)Give bigger number than this.");
            }
            else {
                System.out.println("Oops ! :)Give smaller number than this.");
            }
            System.out.println("Try Again the number is not matched .");
            g1.setGuess();                                                // it is used for the guess number increment
            g1.takeUserInput();
        }
        g1.isCorrectNumber();
        System.out.println("Number of GUESS : " + g1.getGuess());



    }
}
