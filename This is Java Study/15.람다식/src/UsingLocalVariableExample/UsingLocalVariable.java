package UsingLocalVariableExample;

public class UsingLocalVariable {
    void method(int age){
        int localVal = 40;

        MyFunctionalInterface fi = () ->{
            System.out.println("age"+age);
            System.out.println("localVal"+ localVal);
        };
        fi.method();
    }
}
