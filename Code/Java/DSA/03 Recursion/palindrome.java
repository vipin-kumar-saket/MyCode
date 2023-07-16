public class palindrome {
    static int pai(int n,int temp){
       if(n==0) return temp;
       temp=(temp*10)+(n%10);
       return pai(n/10,temp);


    }
    public static void main(String[] args) {
        int n=125121;
        if(n== pai(n,0)){
            System.out.println( n+ " Number is palindrome ");
        }
        else
        System.out.println(n+ " Number is not palindrome ");
    }
}
