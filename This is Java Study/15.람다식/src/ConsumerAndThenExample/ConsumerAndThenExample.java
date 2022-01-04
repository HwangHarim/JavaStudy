package ConsumerAndThenExample;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
    public static void main(String[] args){
        Consumer<Member> consumerA = (m)->{
            System.out.println("consumerA"+m);
        };

        Consumer<Member> consumerB = (m)->{
            System.out.println("consumerB"+m);
        };

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("홍길동", "hong", null));
    }
}
