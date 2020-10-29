public class ListCola<T> implements ColaInterfaz<T>{
        //atributos
        private NodeCola<T> cabeza = new NodeCola<>();
        private NodeCola<T> cola = new NodeCola<>();

        //constructora crea una cola
        public ListCola(){
                cabeza.next = cola;
                cola.next = cabeza;
        }

        // true si la cola está vacía.
        @Override
        public boolean isEmpty() {
                if(cabeza.element == null){
                        return true;
                }else {
                        return false;
                }
        }

        //Añade un nodo a la cola
        @Override
        public void inserir(T x) {
                if (isEmpty()) {
                        cabeza.element = x;
                }else {
                        if(cola.element == null){
                                cola.element = x;
                        }else {
                                NodeCola<T> tmp = cabeza;
                                for (tmp = cabeza; tmp.next != cola; tmp = tmp.next) {
                                }
                                NodeCola<T> penultim = new NodeCola();
                                penultim.element = cola.element;
                                penultim.next = cola;
                                tmp.next = penultim;
                                cola.element = x;
                        }
                }
        }

        //devuelve (la cabeza, o la cola?) de la lista, y elimina el nodo
        @Override
        public T treure() {
                T element = cabeza.element;
                cabeza = cabeza.next;
                return element;
        }

        public static void main(String[] args) {
                ListCola<Integer> cua = new ListCola();

                cua.inserir(1);
                cua.inserir(2);
                cua.inserir(3);
                cua.inserir(4);

                System.out.println(cua.cabeza);
                System.out.println(cua.cabeza.next);
                System.out.println(cua.cabeza.next.next);
                System.out.println(cua.cabeza.next.next.next);
                System.out.println(cua.cabeza.next.next.next.next);
        }
}