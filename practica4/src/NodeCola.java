public class NodeCola<T> {
    public T element;
    public NodeCola<T> next;
    public NodeCola(){}
    public NodeCola(T element, NodeCola<T> next) {
        this.element = element;
        this.next = next;
    }
}
