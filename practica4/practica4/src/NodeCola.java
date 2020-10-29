public class NodeCola<T> {
    public T element;
    public NodeCola<T> next;

    @Override
    public String toString() {
        return "NodeCola{" +
                "element=" + element +
                ", next=" + next.element +
                '}';
    }

    public NodeCola(){}
    public NodeCola(T element, NodeCola<T> next) {
        this.element = element;
        this.next = next;
    }
}
