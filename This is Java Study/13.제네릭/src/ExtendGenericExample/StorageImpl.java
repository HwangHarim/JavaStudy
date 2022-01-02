package ExtendGenericExample;

public class StorageImpl<T> implements Storage<T> {
    private T[] array;

    public StorageImpl(int capacity){
        this.array = (T[])(new Object[capacity]);//타입 파라메이터로 배열을 생성하는 법
    }
    @Override
    public void add(T item, int index) {
        array[index] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}
