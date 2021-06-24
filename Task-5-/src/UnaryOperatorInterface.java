import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

    public static void main(String[] args){

        // Represents an operation on a single operand that produces a result of the same type as its operand.
        // This is a specialization of Function for the case where the operand and result are of the same type.
        // Unary operator exyends finction interface.

        UnaryOperator<Integer> func = x-> x*7;
        int n = func.apply(70);
        System.out.println(n);
    }

    }
