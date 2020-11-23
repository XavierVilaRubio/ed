public class Practica4 {
    public static void Simulation(){
        int comptador;
        int MAX_CASHIERS=10;
        int NUM_CLIENTS=100;
        ListCola<client> cuaDeClients = new ListCola<client>();
        int[] caixerTime = new int[MAX_CASHIERS];
        int tempsTotal, tempsMitja, tempsDeSortida;

        //aquest bucle és per fer la simulació amb tots els caixers
        for (int cashier = 0; cashier < MAX_CASHIERS; cashier++){
            comptador = 0;
            for(int i = 0; i < cashier; i++)
                caixerTime[i] = 0;
            /*incializar tcajero para cada simulación. Cargar la cola de Clientes
            en cada iteración. El tiempo total también se resetea a cada
            iteración*/
            for(int i = 0; i < NUM_CLIENTS; i++)
                cuaDeClients.inserir(new client(i*15));
            tempsDeSortida = 0;
            tempsMitja = 0;
            tempsTotal = 0;
            client current = cuaDeClients.treure();
            while (!cuaDeClients.isEmpty()) {
                for(int i = 0; i <= cashier; i++){
                   if(caixerTime[i] <= comptador && comptador>=current.tentrada){
                       current.tsalida = comptador + 120;
                       caixerTime[i] = comptador + 120;
                       tempsTotal += current.getTempsTotal();
                       current = cuaDeClients.treure();
                   }
                }
                comptador++;
                /*procesamos todos los clientes de la cola con los cajeros de
                aquella simulación (1, 2, etc.) */
                /*procesar los clientes significa sacar el cliente de la cola y
                comprobar el tiempo de llegada. Si el tllegada > tcajero, el cliente se
                puede procesar directamente, y el tiempo de salida será el tiempo de
                entrada más lo que tarde en comprar la entrada. Si tllegada < tcajero, se
                tendrá que esperar, y su tiempo de salida será lo que tarde en
                comprar la entrada, más el tiempo del cajero / ventanilla – que es un
                acumulado de procesar anteriores clientes. El tiempo de proceso de
                cada cliente es constante.*/
                /*Actualizar el tcajero con el tiempo de salida del cliente. Y
                guardarse un contador de tiempo total para poder hacer la media*/
            }
            tempsMitja = tempsTotal / NUM_CLIENTS; //constante = 100;
            System.out.println("Nombre de caixers: " + (cashier+1) + " Temps mitjà en ser atesos(en segons): " + tempsMitja);
            //imprimir resultados
        }
    }

    public static void main(String[] args) {
        Simulation();
    }
}
