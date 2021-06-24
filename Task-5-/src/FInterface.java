import java.util.function.Function;
public class FInterface {
    public static void main(String[] args){

        Function<Integer,Integer> fact = (n) ->{
            int res = 1;
            for(int i=1 ; i<=n; i++){
                res = i*res;
            }
            return res;
        };
        System.out.println(fact.apply(7));
        System.out.println(fact.apply(4));
    }
}
