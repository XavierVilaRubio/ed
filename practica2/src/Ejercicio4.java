import java.util.*;
public class Ejercicio4{
    public static void main (String [] args){
        Professor pf1 = new Professor ("Professor_Sergio", "1234-D", "3.14");
        Professor pf2 = new Professor ("Professor_Xavi", "1235-D", "3.15");
        ArrayList<Professor> list_prof = new ArrayList<Professor>();
        list_prof.add(pf1);
        list_prof.add(pf2);
        Lector l1 = new Lector ("Lector_Sergio", "1234-D", "GRIHO");
        Lector l2 = new Lector ("Lector_Josep", "1234-E", "GTI");
        LinkedList<Lector> list_lec = new LinkedList<Lector>();
        list_lec.add(l1);
        list_lec.add(l2);
        printList(list_prof);
        printList(list_lec);
    }

    public static <T> void printList(List<T> llista){
        Iterator<T> iterator = llista.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}