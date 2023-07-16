import java.util.Scanner;

public class pr01 {
    static  void str(String s){
        int p=0;
        String d=s;

            if(s.equals(d)){
                 p=Integer.parseInt(s);
                System.out.println(p);
                d="";
            }



    }
    public static void count_same(int s, int e) {

        for (int i = s; i <= e; i++) {
            if (Integer.toString(i).equals(new StringBuilder(Integer.toString(i)).reverse().toString())) {

                System.out.println(i);
            }
        }

}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            String s=""+i;
             str(s);
            s="";

        }
//        count_same(a,b);

    }
}
