package game_poject;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                   *****  Hello Friends lets play Game  *****");
        System.out.println();
        System.out.println();
        System.out.println("Enter 0 for Rock , 1 for paper , 2 for scissor");
        int userInput= sc.nextByte();

        Random random= new Random();
        int compInput=random.nextInt(3);

        if(userInput==compInput)
        {
            System.out.println("Draw !");
        } else if (userInput==0 && compInput==1 || userInput==1 && compInput==0 || userInput==2 && compInput==1)
        {
            System.out.println("You Won !");
        }

        else
        {
            System.out.println("Computer Won");
        }

        System.out.println();
        if(compInput==0){
            System.out.println("Computer choice rock");
        }
        else if(compInput==1){
            System.out.println("Computer choice paper");
        }
        else if(compInput==2){
            System.out.println("Computer choice scissor");
        }

    }
}
