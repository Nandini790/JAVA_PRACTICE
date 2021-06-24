import java.util.Arrays;
import java.util.Scanner;

public class ArraysInJava {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Declaring 1-D array
        int[] arr;
        int arr2[];

        // Instantiate , Initialise 1-D array
        arr = new int[4];

        double[] arr3 = new double[10];

        boolean[] arr4 = new boolean[4];

        int[] arr5 = {3, 2, 1};

        // Take elements of array from users

        for(int i = 0 ; i< arr.length  ; i++){
            arr[i] = s.nextInt();
        }

        // Print 1-D array
        for (int x:arr5) {
            System.out.println(x);

        }

        // Use of Arrays package

        Arrays.sort(arr5);   // sort an array
        Arrays.fill(arr4,true);  // filling a boolean array with all true;
        String d = Arrays.toString(arr5); // converting array to srting

        System.out.println("==tostring==");
        System.out.println(d);


        // Declaring , Instantiate , Initialise 2-D array

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrix2 = new int[3][2];

        // Take elements of array from users

        System.out.println("====2d======");
        for(int i = 0 ; i< matrix2.length ; i++){
            for(int j = 0 ; j< matrix2[0].length; j++){
                matrix2[i][j] = s.nextInt();
            }
        }


        // Print 2-D array

        for(int i = 0 ; i< matrix2.length ; i++){
            for(int j = 0 ; j< matrix2[0].length; j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }



    }
}
