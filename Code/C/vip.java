import java.util.*;

class vip{
   public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter a  String");
    String input=Sc.nextLine();

    for(int i=0;i<input.length();i++)
    {
        char ch=input.charAt(i);
        System.out.print(ch);
        if(input.charAt(i)==32)
        {
           
            System.out.println();
        }
    }
    

        
    }
}