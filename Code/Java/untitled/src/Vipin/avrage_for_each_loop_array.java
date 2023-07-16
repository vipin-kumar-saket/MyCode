package Vipin;

public class avrage_for_each_loop_array {
    public static void main(String[] args) {
        int [] arr={95,58,45,96,75};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
             sum=sum+arr[i];
        }
        System.out.println(sum/arr.length);
    }
}
