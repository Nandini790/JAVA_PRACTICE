import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileOS {
    public static void main(String[] args) throws FileNotFoundException{
        FileOutputStream fos = new FileOutputStream("myfile2.txt",true);
        PrintWriter pw = new PrintWriter(fos);
        pw.println("Hey it is the second file created through FileOutput Stream");
        pw.close();
    }
}