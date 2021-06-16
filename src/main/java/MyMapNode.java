public class MyMapNode<T, V> implements INode<T> {
    T data;
    V value;
    MyMapNode<T, V> next;

    public MyMapNode(T data, V value) {
        this.data = data;
        this.value = value;
        next = null;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public T getData() {
        return data;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public void setNext(INode<T> next) {
        this.next = (MyMapNode<T, V>) next;
    }

    @Override
    public INode<T> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "MyMapNode{" +
                "data=" + data +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}