public class MyPriorityQueue<T extends Comparable> {
    private static final int DEFAULT_CAPACITY = 20;
    private int currentSize;
    private T[] vector;

    public MyPriorityQueue(){
        this.currentSize = 0;
        this.vector = (T[]) new Object[DEFAULT_CAPACITY+1];
    }

    public boolean add(T x){
        if(isEmpty())
            return false;
        int hole = currentSize++;
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
       percolateDown(1);
       return minItem;
    }

    private void percolateDown(int hole){
        while(hole*2<currentSize){
            if((vector[hole].compareTo(vector[hole*2])>0)){
                vector[hole] = vector [hole*2];
            }
        }
    }

    public boolean isEmpty(){return currentSize==0;}

    public T element(){
        if (currentSize == 0)
            System.out.println("The heap is empty");
        return vector[1];
    }

    public static void main(String[] args) {
        MyPriorityQueue cua = new MyPriorityQueue();
        //System.out.println(cua.vector);
    }
}
