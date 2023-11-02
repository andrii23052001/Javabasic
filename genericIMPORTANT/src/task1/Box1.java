package task1;

public class Box1<T> {
    T value;

    public Box1(T value) {
        this.value = value;
    }

    public T getContent() {
        return value;
    }
}
