import java.io.Console;

public class ConsoleClass {
    public static void main(String[] args){
        Console c = System.console();
        if(c == null){
            System.out.println("There is no console available");
            return;
        }
        String name = c.readLine("Enter your name: ");
        c.printf(name);
    }
}

