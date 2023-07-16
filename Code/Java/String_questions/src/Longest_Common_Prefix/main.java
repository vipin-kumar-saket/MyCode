package Longest_Common_Prefix;
import java.util.*;

public class main {
    public String common(String[] arr)
    {
        int n = arr.length;
        // take temp_prefix string and assign first element of arr : a.
        String result = arr[0];

        // Iterate for rest of element in string.
        for(int i = 1; i < n; i++){
            // .indexOf() return index of that substring from string.
            while(arr[i].indexOf(result) != 0){

                // update matched substring prefix
                result = result.substring(0, result.length()-1);

                // check for empty case. direct return if true...
                if(result.isEmpty()){
                    return "-1";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        main m= new main();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number for you want to create an string array :");
        int a= sc.nextInt();
               sc.nextLine();
        String []input= new String[a];
        for(int i=0;i<input.length;i++){
            input[i]=sc.nextLine();

        }

        System.out.println("the common word are :"+ m.common(input));

    }
}
