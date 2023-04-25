package ThreadLocal.ex;

import java.util.Date;

public class A {
    public void a() {
        Context.contextLocal.set(new Date());
        Context.local.set(new UserInfo("test", 23));

        System.out.println("A: "+ Context.contextLocal.get());
        System.out.println("A: "+ Context.local.get());
        System.out.println("--------------");
        B b = new B();
        b.b();

        Context.contextLocal.remove();
        Context.local.remove();
    }
}
