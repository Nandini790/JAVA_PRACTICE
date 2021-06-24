import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        // Represents a supplier of results.
        //There is no requirement that a new or distinct result be returned each time the supplier is invoked.
        //This is a functional interface whose functional method is get().
        
        getText(() -> "Nandini");

    }

    public static void getText(Supplier<String> text){
        System.out.println(text.get());
    }
}
