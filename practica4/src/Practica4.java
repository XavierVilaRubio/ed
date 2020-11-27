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
                //Anem caixer per caixer
                for(int i = 0; i <= cashier; i++){
                    //Si encara queden clients
                    if(!cuaDeClients.isEmpty()) {
                        //En treiem un
                        client current = cuaDeClients.treure();
                        //El processem
                        if(current.tarribada >= caixerTime[i]){
                            current.tsortida = current.tarribada + 120;
                        }else{
                            current.tsortida = caixerTime[i] + 120;
                        }
                        //Actualitzem els temps
                        caixerTime[i] = current.tsortida;
                        tempsTotal += current.getTempsTotal();
                    //Si la cua està buida fem un break per evitar iteracions innecessaries sobre el bucle for.
                    }else
                        break;
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