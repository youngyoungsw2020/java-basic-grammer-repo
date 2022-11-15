package lecture6.genericlecture;

public class GenericTest1<T> {

    public T data;

    // constructor
    public GenericTest1(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

}
