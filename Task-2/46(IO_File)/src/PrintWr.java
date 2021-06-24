import java.io.IOException;
import java.io.PrintWriter;

public class PrintWr {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter(System.out,true);
        String str = "Nandni Singh";
        pw.println(str);
        int i = 02230;
        pw.println(i);
        double d = 4.5;
        pw.println(d);

    }

}
