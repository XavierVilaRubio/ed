public class NodeCola<T> {
    public T element;
    public NodeCola<T> next;
    public NodeCola(){}
    public NodeCola(T _element, NodeCola<T> _next) {
        element = _element;
        next = _next;
    }
}
