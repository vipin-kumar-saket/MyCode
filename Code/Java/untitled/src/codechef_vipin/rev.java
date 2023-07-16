package codechef_vipin;
import java.util.*;
public class rev {
    public static void main(String[] args) {
        int [] arr={20,30,96,4,6};
        Arrays.sort(arr);
        for(int i= (args.length)-1;i>arr[i];i++)
        {
            System.out.println(i);
        }


    }
}
