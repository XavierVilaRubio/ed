public class Practica4 {
    public static void Simulation(){
        int MAX_CASHIERS=10;
        int NUM_CLIENTS=100;
        ListCola<client> cuaDeClients = new ListCola<>();
        int[] caixerTime = new int[MAX_CASHIERS];
        int tempsTotal, tempsMitja;

        for (int cashier = 0; cashier < MAX_CASHIERS; cashier++){
            //Resetejem temps dels caixers a utilitzar
            for(int i = 0; i <= cashier; i++)
                caixerTime[i] = 0;

            //Carreguem la cua de clients
            for(int i = 0; i < NUM_CLIENTS; i++)
                cuaDeClients.inserir(new client(i*15));
            tempsTotal = 0;

            while (!cuaDeClients.isEmpty()) {
                int tempsTranscorregut = 0;
                boolean atendido = false;
                client current = cuaDeClients.treure();
                while (!atendido){
                    for(int i = 0; i <= cashier; i++){
                        if(current.tarribada+tempsTranscorregut >= caixerTime[i]){
                            current.tsortida = current.tarribada + tempsTranscorregut + 120;
                            caixerTime[i] = current.tsortida;
                            tempsTotal += current.getTempsTotal();
                            atendido = true;
                            break;
                        }
                    }
                    tempsTranscorregut++;
                }
            }
            tempsMitja = tempsTotal / NUM_CLIENTS;
            System.out.println("Nombre de caixers: " + (cashier+1) + " Temps mitjà en ser atesos(en segons): " + tempsMitja);
        }
    }

    public static void main(String[] args) {
        Simulation();
    }
}
