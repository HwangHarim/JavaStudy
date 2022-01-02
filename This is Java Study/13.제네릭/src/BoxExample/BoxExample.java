package BoxExample;

public class BoxExample {
    public static void main(String[] args){
        Box box = new Box();
        box.setObject("황하림");
        String name = (String)box.getObject();

        box.setObject(new Apple());
        Apple apple = (Apple) box.getObject();

        Box2<String> box1 = new Box2<String>();
        box1.set("hello");
        String str = box1.get();

        Box2<Integer> box2 = new Box2<Integer>();
        box2.set(100);
        int value = box2.get();
    }
}
