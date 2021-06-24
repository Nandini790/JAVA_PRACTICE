import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIS {
    public static void main(String[] args) throws FileNotFoundException{
        FileInputStream fin = new FileInputStream("myfile.txt");
//        PrintWriter pw = new PrintWriter(fos);
//        pw.println("Hey it is the new file created through FileOutput Stream");
//        pw.close();
        Scanner s = new Scanner(fin);
        while (s.hasNext()){
            System.out.println(s.nextLine());
        }
    }
}
