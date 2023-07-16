package Vipin;

public class min_element_array {
    public static void main(String[] args) {
        int [] arr={105,95,45,963,553,46,12};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<max)
            {
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
