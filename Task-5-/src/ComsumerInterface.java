import java.util.function.Consumer;

public class ComsumerInterface {

    public static void main(String[] args){

        //Represents an operation that accepts a single input argument and returns no result.
        // Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
        // This is a functional interface whose functional method is accept(Object).

        Consumer<Integer> func = x-> System.out.println(x+1);
        func.accept(8);

        Consumer<String> func1 = System.out::println;
        func1.accept("Hey this is the Consumer Interface");



    }
}
