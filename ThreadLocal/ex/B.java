package ThreadLocal.ex;

import java.util.Date;

public class B {
    public void b() {
        Date date = Context.contextLocal.get();
        UserInfo userInfo = Context.local.get();
        System.out.println("B: "+date);
        System.out.println("B: "+userInfo);
        System.out.println("--------------");
        C c = new C();
        c.c();
    }
}
