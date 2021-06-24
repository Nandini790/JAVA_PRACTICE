import java.io.*;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fin = new FileInputStream("myfile.txt");
        Scanner s = new Scanner(fin);
        while (s.hasNext()){
            System.out.println(s.nextLine());
        }
    }
}

class UncheckedException{
    public static void main(String[] args ){
        int[] ar = new int[5];
//        System.out.println(ar[9]);
        // To handle this exception we use the try catch block
        try{
            System.out.println(ar[9]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
