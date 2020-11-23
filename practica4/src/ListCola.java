public class ListCola<T> implements ColaInterfaz<T>{
        //atributos
        private NodeCola<T> cabeza;
        private NodeCola<T> cola;

        //constructora crea una cola
        public ListCola(){
                cabeza = null;
                cola = null;
        }

        // true si la cola está vacía.
        @Override
        public boolean isEmpty() {
                if(cabeza == null){
                        return true;
                }else {
                        return false;
                }
        }

        //Añade un nodo a la cola
        @Override
        public void inserir(T x) {
                NodeCola<T> tmp = new NodeCola<T>(x, null);
                if(isEmpty()){
                        cabeza = cola = tmp;
                }else {
                        cola.next = tmp;
                        cola = cola.next;
                }
        }

        //devuelve (la cabeza, o la cola?) de la lista, y elimina el nodo
        @Override
        public T treure() {
                if(isEmpty()){
                        return null;
                }
                T element = cabeza.element;
                cabeza = cabeza.next;
                if(isEmpty()){
                        cola = null;
                }
                return element;
        }
}