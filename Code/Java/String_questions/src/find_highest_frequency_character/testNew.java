package find_highest_frequency_character;

import java.util.Scanner;

public class testNew {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input = sc.nextLine();

        int maxCount = 0;
        char maxChar=' ';
        for (int i = 0; i < input.length(); i++)
        {
            int count =1;
            for(int j=i+1;j<input.length();j++){

                if(input.charAt(i)==input.charAt(j)){

                    count++;

                }


            }

            if(count>maxCount)
            {
                maxCount=count;
                maxChar=input.charAt(i);
            }

        }
        System.out.println("the mix char :"+ maxChar + " is " +maxCount);



    }
}
