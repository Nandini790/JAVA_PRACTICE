import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {
    public static void main(String[] args){
        //  An operation upon two operands of the same type,
        //  producing a result of the same type as the operands.
        //  This is a specialization of BiFunction for the case where
        //  the operands and the result are all of the same type.

        BinaryOperator<Integer> func = Integer::sum;
        int t = func.apply(50,70);
        System.out.println(t);

        // BiFunction Interface
        // Wehave to passed 3 arguments
        BiFunction<Integer,Integer,Integer> func1 = (x1 , x2) -> x1+x2;
        int u = func1.apply(60,80);
        System.out.println(u);
    }
}
