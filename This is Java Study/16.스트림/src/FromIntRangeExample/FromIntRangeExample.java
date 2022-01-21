package FromIntRangeExample;

import java.util.stream.IntStream;

public class FromIntRangeExample {
    public static int sum;

    public static void main(String[] args){
        IntStream intStream = IntStream.range(1,100);
        intStream.forEach(a->sum+=a);
        System.out.println("총합 "+ sum);
    }
}
