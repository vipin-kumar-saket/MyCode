import java.util.Scanner;

public class Matrix_Add_Mul {
    static void printMatrix(int arr [][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    // this is used for tha add two matrix
    static void  add(int a[][],  int r1,int c1 ,int [][]b , int r2,int c2) {
        if(r1!= r2  || c1!= c2){
            System.out.println("Wrong input - Addition is not possible ");
            return;
        }
        int sum[][]= new int[r1][c1];
        for (int i = 0; i <r1 ; i++) {
           for(int j=0;j<c1;j++){
               sum[i][j] = a[i][j]+b[i][j];

           }
        }
        printMatrix(sum);
    }



//    this method is used to multiply to matrix

    static void  multiply(int a[][],  int r1,int c1 ,int [][]b , int r2,int c2) {
        if(c1!= r2){
            System.out.println("Wrong input - multiplication is not possible ");
            return;
        }
        int mul[][]= new int[r1][c2];
        for (int i=0; i<r1; i++){
            for (int j=0; j<c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k]* b[k][j];
                }
            }
        }
        printMatrix(mul);
    }


    // Program to display transpose of matrix


    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println("Enter number of rows and columns  matrix 1 :");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int arr1[][ ]= new int[r1][c1];
        System.out.println("Enter matrix 1 element");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1 ; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter number of rows and columns  matrix 2 :");
        int r2= sc.nextInt();
        int c2= sc.nextInt();
        int arr2[][ ]= new int[r2][c2];
        System.out.println("Enter matrix 1 element");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2 ; j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1 is");
        printMatrix(arr1);
        System.out.println("Matrix 2 is");
        printMatrix(arr2);

        System.out.println();
        System.out.println();
        System.out.println("The sum of matrix is : ");
//        add(arr1,r1,c1,arr2 ,r2,c2);
//        multiply(arr1,r1,c1,arr2 ,r2,c2);
//        transpose(arr1,r1,c1);

    }
}
