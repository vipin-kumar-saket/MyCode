package Practice;

public class recursion_01 {
    public static void printNum(int n){   // 1,2,3,........n-1,n
        if(n==1){

            System.out.println(n);
            return;
        }
        System.out.println("first "+n);
        printNum(n-1);      //1,2,3,.......n-1
//        System.out.println("hello my name is vipin kumar saket");
        System.out.println(n);

    }
    public static void main(String[] args) {
     printNum(5);
    }
}
