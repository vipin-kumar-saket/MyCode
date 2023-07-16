package Practice;
import  java.util.*;
public class add_2Array {
    public static void main(String[] args) {
        int []firstArray={10,12,56};
        int []secondArray={25,2,5,9};
        int n=firstArray.length+secondArray.length;
        int []mergedArray = new int[n];
        int pos = 0;
        for (int element : firstArray) //copying elements of secondArray using for-each loop
        {
            mergedArray[pos] = element;
            pos++;              //increases position by 1
        }
        for (int element : secondArray) //copying elements of firstArray using for-each loop
        {
            mergedArray[pos] = element;
            pos++;
        }
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));




    }
}
