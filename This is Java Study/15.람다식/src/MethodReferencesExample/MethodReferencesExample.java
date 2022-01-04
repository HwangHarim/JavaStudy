package MethodReferencesExample;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
    public static void main(String[] args){
        IntBinaryOperator operator;


        operator = (x,y) ->Calculator.staticMethod(x,y);
        System.out.println("결과1 " + operator.applyAsInt(1,2));

        operator = Calculator::staticMethod;
        System.out.println("결과1 " + operator.applyAsInt(3,4));

        Calculator calculator = new Calculator();
        operator = (x,y) ->calculator.instanceMethod(x,y);
        System.out.println("결과1 " + operator.applyAsInt(5,6));

        operator = calculator::instanceMethod;
        System.out.println("결과1 " + operator.applyAsInt(7,8));
    }
}
