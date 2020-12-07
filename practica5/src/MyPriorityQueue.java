public class MyPriorityQueue<T extends Comparable> {
    private static final int DEFAULT_CAPACITY = 20;
    private int currentSize;
    private T[] vector;

    public MyPriorityQueue(){
        this.currentSize = 0;
        this.vector = (T[]) new Comparable[DEFAULT_CAPACITY+1];
    }

    public boolean add(T x){
        if(isFull())
            return false;
        int hole = ++currentSize;
        vector[0] = x;
        while((x.compareTo(vector[hole/2])<0)){
            vector[hole] = vector[hole/2];
            hole = hole/2;
        }
        vector[hole] = x;
        return true;
    }

    public T remove(){
       T minItem = element();
       vector[1] = vector [currentSize--];
       // Afegit per nosaltres per a fer l'array una mica més neta i que a l'hora d'imprimir-la és mostri correctament.
       vector [currentSize+1] = null;
       percolateDown(1);
       return minItem;
    }

    private void percolateDown(int hole){
        int min;
        while(hole*2<=currentSize){
            min = (vector[hole*2].compareTo(vector[(hole*2)+1])<=0) ? hole*2 : (hole*2)+1;
            if(vector[hole].compareTo(vector[min])>0){
                T tmp = vector[hole];
                vector[hole] = vector[min];
                hole = min;
                vector[hole] = tmp;
            }else{
                break;
            }
        }
    }

    private boolean isFull(){return currentSize == vector.length;}

    private T element(){
        if (currentSize == 0)
            System.out.println("The heap is empty");
        return vector[1];
    }

    private void treePrinter(){
        for(int x=0;x<12;x++){System.out.print(" ");}
        System.out.print(this.vector[1]);

        System.out.println();
        for(int x=0;x<5;x++){System.out.print(" ");}
        System.out.print(this.vector[2]);
        for(int x=0;x<11;x++){System.out.print(" ");}
        System.out.print(this.vector[3]);

        System.out.println();
        for(int x=0;x<2;x++){System.out.print(" ");}
        System.out.print(this.vector[4]);
        for(int x=0;x<4;x++){System.out.print(" ");}
        System.out.print(this.vector[5]);
        for(int x=0;x<5;x++){System.out.print(" ");}
        System.out.print(this.vector[6]);
        for(int x=0;x<4;x++){System.out.print(" ");}
        System.out.print(this.vector[7]);

        System.out.println();
        System.out.print(this.vector[8] + " " + this.vector[9] + "  " + this.vector[10] + " " + this.vector[11] + "  " + this.vector[12] + " " + this.vector[13] + "  " +  this.vector[14] + " " + this.vector[15]);
    }

    public static void main(String[] args) {
        testInsercion();
        testEliminacion();
    }

    private static void testInsercion(){
        MyPriorityQueue cua = new MyPriorityQueue();
        cua.add("13");
        cua.add("21");
        cua.add("16");
        cua.add("24");
        cua.add("31");
        cua.add("19");
        cua.add("68");
        cua.add("65");
        cua.add("26");
        cua.add("32");
        System.out.println("INSERCION:");
        System.out.println("Before insertion:");
        cua.treePrinter();
        cua.add("14");
        System.out.println("\n\nAfter insertion:");
        cua.treePrinter();
    }

    private static void testEliminacion(){
        MyPriorityQueue cua = new MyPriorityQueue();
        cua.add("13");
        cua.add("14");
        cua.add("16");
        cua.add("19");
        cua.add("21");
        cua.add("19");
        cua.add("68");
        cua.add("65");
        cua.add("26");
        cua.add("32");
        cua.add("31");
        System.out.println("\n\nELIMINACION:");
        System.out.println("Before elimination:");
        cua.treePrinter();
        cua.remove();
        System.out.println("\n\nAfter elimination:");
        cua.treePrinter();
    }
}
