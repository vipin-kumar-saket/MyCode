public class pr01 {
    public static void main(String[] args) {
        int n=121;
        int p=0;
        for (int i = 0; i <n ;n= n/10) {
            int rem= n%10;
            p=(p*10)+rem;

        }
        System.out.println(p);
    }
}
