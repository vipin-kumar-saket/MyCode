package Vipin;

import java.util.Scanner;

public class cyclic_order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int input=sc.nextInt();
      String s=""+input;
      int arr[]=new int [s.length()];
      int sum=0,i,j;
      for(i=0;i<s.length();i++){
          arr[i]=Character.getNumericValue(s.charAt(i));
      }
      for(i=0;i<arr.length;i++){
          for(j=i; j<arr.length; j++){
              sum+=arr[j];
          }
      }
        System.out.println(sum);
    }
}
