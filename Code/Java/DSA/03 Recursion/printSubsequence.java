import java.util.Scanner;

public class printSubsequence {
    static  void  printSSQ(String s ,String currAns){
        // base case
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char ch=s.charAt(0);
        String remStr=s.substring(1);
        printSSQ(remStr, currAns+ch);// add with current
        printSSQ(remStr, currAns);  // do not add with current

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s= sc.next();

        printSSQ(s, "");
    }
}
