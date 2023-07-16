import java.util.Scanner;

public class palindrome_string {
    static boolean check(String s, int left, int right){
        if(left> right) return true;

        return (s.charAt(left)== s.charAt(right)  && check(s,left+1,right-1));
    }
    static String Check(String s,int idx){
        if(idx==s.length()) return "";
        String smallAns= Check( s,idx+1);
        return  smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String rev=Check(s,0);
        if(s.equals(rev)) System.out.printf("%s is Palindrome  " ,s);
        else System.out.printf("%s is not palindrome ",s);
        System.out.println();
        System.out.println(check(s,0,s.length()-1));
    }
}
