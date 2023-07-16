package Vipin;

public class method3 {
    static void change (int []arr)
    {
        arr[0]=90;
    }static void change1(int x)
    {
        x=56;
    }
    public static void main(String[] args) {
        int [ ] marks={95,66,96,83,79,99};
        change(marks);                        // There are go to reference in the functions / method . so there are the number is changed.
        System.out.println("The change of after changing in the array is:"+marks[0]);



        /*
        in  there are no change in the element in tha function / method .because there not going the reference in the function.
        there are going a number in the function and the function is not return value in this function .
        and void are also use to not return the value in any program.
         */

        // Rule number 2


         int a=95;
         change1(a);
        System.out.println("There are no change:"+a);    //there are no change in this program



    }
}
