import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        Persona_ person1 = new Persona_("Sergio", "99999999X");
        Persona_ person2 = new Persona_("Josep", "88888888P");
//mas personas
        ArrayList<Persona_> arr_per = new ArrayList<Persona_>();
        arr_per.add(person1);
        arr_per.add(person2);
// añadir mas personas
        sort(arr_per);
//imprimir lista de Personas ordenades (opcional)
        printList(arr_per);

        Coche coche1 = new Coche("L-1234");
        Coche coche2 = new Coche("Z-1234");
//mas coches
        LinkedList<Coche> arr_ctx = new LinkedList<Coche>();
        arr_ctx.add(coche1);
        arr_ctx.add(coche2);
//añadir mas coches
        sort(arr_ctx);
//imprimir lista de coches ordenados (opcional)
        printList(arr_ctx);
    }
    public static <T extends Comparable> void sort (List<T> list){
        boolean ordenat = true;
        T temp;
        while (ordenat){
            ordenat = false;
            for(int i = 0; i < list.size()-1; i++){
               if(list.get(i).compareTo(list.get(i+1)) > 0){
                   temp = list.get(i);
                   list.set(i, list.get(i+1));
                   list.set(i+1, temp);
                   ordenat = true;
               }
            }
        }
    }
    public static <T> void printList(List<T> llista){
        Iterator<T> iterator = llista.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}