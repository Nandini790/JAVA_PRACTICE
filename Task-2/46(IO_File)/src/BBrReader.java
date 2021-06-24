import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BBrReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // read the character from console
        System.out.println("Enter characters,'q' for quit");
        char c;
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
class BBrReaderString{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // read the string from console
        String str ;
        System.out.println("Enter string , 'stop' to exit");
        do{
            str = (String) br.readLine();
            System.out.println(str);
        }while(!str.equals("stop"));
    }

}
