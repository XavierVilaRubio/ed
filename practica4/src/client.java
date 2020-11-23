public class client {
    public int tentrada;
    public int tsalida;

    public client(int _tentrada) {
        tentrada = _tentrada;
    }
    public int getTempsTotal(){
        return tsalida-tentrada;
    }
}
