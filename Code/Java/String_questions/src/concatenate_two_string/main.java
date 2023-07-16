package concatenate_two_string;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first string ");
        String input1=sc.nextLine();
        System.out.println("Enter first string ");
        String input2=sc.nextLine();
        String con="";
        for(int i=0;i<input1.length();i++){

            if(input1.charAt(i)>='a' && input1.charAt(i)<='z' || input1.charAt(i)>='A' && input1.charAt(i)<='Z')
            {
                con=con + input1.charAt(i);
            }

/*            If there are we remove the

               else if (input1.charAt(i)==32)
            {
                con =con+input1.charAt(i);

            }

            then the output like
            ip1= my name is vipin kumar saket
            ip2= my name is saurbh saket

            op=mynameisvipinkumarsaketmynameissaurbhsaket


 */        else if (input1.charAt(i)==32)
            { con =con+input1.charAt(i);

            }

        }

        for(int i=0;i<input2.length();i++){

            if(input2.charAt(i)>='a' && input2.charAt(i)<='z' || input2.charAt(i)>='A' && input2.charAt(i)<='Z')
            {
                con=con + input2.charAt(i);
            }


            else if (input2.charAt(i)==32)
            {
                con =con+input2.charAt(i);

            }

        }

        System.out.println(con);
    }
}
