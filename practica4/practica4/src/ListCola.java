public class ListCola<T> implements ColaInterfaz<T>{
        //atributos
        private NodeCola<T> cabeza;
        private NodeCola<T> cola;

        //constructora crea una cola
        public ListCola(NodeCola _cabeza, NodeCola _cola){
                cabeza = _cabeza;
                cola = _cola;
        }

        // true si la cola está vacía.
        @Override
        public boolean isEmpty() {
                if(cabeza.equals(cola)){
                        return true;
                }else {
                        return false;
                }
        }

        //Añade un nodo a la cola
        @Override
        public void inserir(T x) {
                cola.element;
        }

        //devuelve (la cabeza, o la cola?) de la lista, y elimina el nodo
        @Override
        public T treure() {
                return null;
        }
}