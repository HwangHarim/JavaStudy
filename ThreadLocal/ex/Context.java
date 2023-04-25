package ThreadLocal.ex;

import java.util.Date;

public class Context {
    public static ThreadLocal<Date> contextLocal = new ThreadLocal<>();
    public static ThreadLocal<UserInfo> local = new ThreadLocal<>();
}
