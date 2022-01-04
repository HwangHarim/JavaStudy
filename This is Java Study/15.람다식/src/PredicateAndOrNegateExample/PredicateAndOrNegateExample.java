package PredicateAndOrNegateExample;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
    public static void main(String[] args) {

        IntPredicate predicateA = a -> a % 2 == 0;
        IntPredicate predicateB = b -> b % 3 == 0;

        IntPredicate predicateAB;
        boolean result;

        //and
        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2와 3의 배수입니가? "+result);

        //or
        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2나 3의 배수입니가? "+result);

        //negate
        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println("9는 홀수입니까? "+result);
    }
}
