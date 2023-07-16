public class frog_jump {
    static int jump(int h [ ], int n, int idx ){
        if(idx==n-1) return 0;
        int op1= Math.abs(h[idx]-h[idx+1]) + jump(h,n,idx+1);
        if(idx ==n-2) return op1;
        int op2= Math.abs(h[idx]-h[idx+2]) + jump(h,n,idx+2);
        return Math.min(op1,op2);
    }
    public static void main(String[] args) {
        int arr[]={0,2,5,6,7};
        System.out.println(jump(arr, arr.length,0));
    }
}
