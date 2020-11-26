public class client {
    public int tarribada;
    public int tsortida;

    public client(int tarribada) {
        this.tarribada = tarribada;
    }
    public int getTempsTotal(){
        return (tsortida - tarribada);
    }
}
