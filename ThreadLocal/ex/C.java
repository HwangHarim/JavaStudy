package ThreadLocal.ex;

import java.util.Date;

public class C {
    public void c() {
        Date date = Context.contextLocal.get();
        UserInfo userInfo = Context.local.get();
        System.out.println("C: "+date);
        System.out.println("C: "+userInfo);
    }
}
