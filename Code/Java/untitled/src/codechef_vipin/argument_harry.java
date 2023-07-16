package codechef_vipin;

public class argument_harry {
    static  int sum(int ...arr)
    {
        int result=0;
        for(int a:arr)
        {
            result=result+a;
        }
        return  result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 5 and 9 is:"+sum(5,9));
        System.out.println("The sum of Nothing is:"+sum());                 // The output is given this input is 0.
        System.out.println("The sum of 5,9 and 3 is:"+sum(5,9,3));
        System.out.println("The sum of 5,9,3 and 12 is:"+sum(5,9,3,12));
        System.out.println("The sum of 5,9,3,,12 and 35 is:"+sum(5,9,3,12,35));

    }
}
