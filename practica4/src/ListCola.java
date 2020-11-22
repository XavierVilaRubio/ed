public class ListCola<T> implements ColaInterfaz<T>{
        //atributos
        private NodeCola<T> cabeza;
        private NodeCola<T> cola;

        //constructora crea una cola
        public ListCola(){
                cabeza = new NodeCola<T>();
                cola = new NodeCola<T>();
        }

        // true si la cola está vacía.
        @Override
        public boolean isEmpty() {
                if(cabeza.element == null){
                        //System.out.println("cabeza null");
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
                }
                cola.next = tmp;
                cola = tmp;
        }

        //devuelve (la cabeza, o la cola?) de la lista, y elimina el nodo
        @Override
        public T treure() {
                if(isEmpty()){
                        return  null;
                }
                T element = cabeza.element;
                cabeza.element = null;
                cabeza = cabeza.next;
                if(isEmpty()){
                        cola = null;
                }
                return element;
        }
}