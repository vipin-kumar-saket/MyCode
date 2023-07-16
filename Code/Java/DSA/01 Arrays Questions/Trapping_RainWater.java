import java.util.Scanner;

public class Trapping_RainWater {
    public static int rainWater(int []height){
        int n=height.length;

        //Calculate left max boundary -array
        int leftMax []= new int [n];
        leftMax[0]=height[0];
        for (int i = 1; i <n ; i++) {
            leftMax[i]= Math.max(height[i],leftMax[i-1]);
        }

        //Calculate right max boundary -array
        int rightMax []=new int [n];
        rightMax[n-1]=height[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightMax[i]=Math.max(height[i],rightMax[i+1] );
        }

        int trappedWater=0;
        for (int i = 0; i <n ; i++) {
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

            trappedWater += waterLevel-height[i];

        }
        return trappedWater;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a size of array : ");
        int input=sc.nextInt();
        int arr[]=new int[input];
        for (int i = 0; i <input ; i++) {
           arr[i]=sc.nextInt();
        }

        System.out.println(rainWater(arr));
    }
}
