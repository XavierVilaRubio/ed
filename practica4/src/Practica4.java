public class Practica4 {
    public static void Simulation(){
        int MAX_CASHIERS=100;
        int NUM_CLIENTS=10;
        clientCinema client;
        ListCola<clientCinema> cuaDeClients = new ListCola<clientCinema>();
        int[] caixerTime = new int[MAX_CASHIERS];
        int tempsTotal = 0, tempsMitja, tempsDeSortida;

        //aquest bucle és per fer la simulació amb tots els caixers
        for (int cashier = 0; cashier < MAX_CASHIERS; cashier++){
        /*incializar tcajero para cada simulación. Cargar la cola de Clientes
        en cada iteración. El tiempo total también se resetea a cada
        iteración*/
            while (!cuaDeClients.isEmpty()) {
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
            //imprimir resultados
        }
    }
}
