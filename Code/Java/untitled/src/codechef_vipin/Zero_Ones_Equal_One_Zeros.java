package codechef_vipin;
import java.util.*;

public class Zero_Ones_Equal_One_Zeros {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        while(a-- >0)
        {

            int x = sc.nextInt();
            String v = "1",p = "0";
            for(int i=0;i<x-2;i++)
                v = v+"0";
            System.out.println(v+""+"1");
        }
    }
}
