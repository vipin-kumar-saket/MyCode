package Vipin;

public class check_arrayISsorted {
    public static void main(String[] args) {
        int [] arr={10,22,45,78,96};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=max)
            {
                System.out.println("The array is sorted in this array");
                break;
            }
            else
            {
                System.out.println("The array is not sorted in this array");

            }

        }

    }
}
