import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {
    public static void main(String[] args){

        // Represents a predicate (boolean-valued function) of one argument.
        // This is a functional interface whose functional method is test(Object).

        Predicate<Integer> func = x -> x > 5;
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> collect = l.stream().filter(func).collect(Collectors.toList());
        System.out.println(collect);

        // Predaicate with &&

        List<Integer> clist = l.stream().filter(x -> x >5 && x<8).collect(Collectors.toList());
        System.out.println(clist);

    }
}
