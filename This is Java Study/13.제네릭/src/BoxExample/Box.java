package BoxExample;

public class Box {
    private Object object;
    public void setObject(Object object){this.object = object;}
    public Object getObject(){return object;}
}

class Box2<T> {
    private T t;
    public T get() {return t;}
    public void set(T t){this.t = t;}
}
