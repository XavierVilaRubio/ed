import java.util.Scanner;

public class practica1 {
    public static void showMenu(){
        int[] a={-2, 11, -4, 13, -5, 2};

        int opcio = 0;
        Scanner scan = new Scanner(System.in);
        while(opcio != 4){
            System.out.println("1. Algoritmo orden cúbico: O(N³)");
            System.out.println("2. Algoritmo orden cuadrado: O(N²)");
            System.out.println("3. Algoritmo orden lineal: O(N)");
            System.out.println("4. Sortir");
            System.out.println("La teva opció:");
            opcio = scan.nextInt();
            switch (opcio) {
                case 1 -> maxSubsequenceSum_cubic(a);
                case 2 -> maxSubsequenceSum_quadratic(a);
                case 3 -> maxSubsequenceSum_lineal(a);
                case 5 -> maxSubsequenceSum_lineal_1(a);
                case 6 -> maxSubsequenceSum_lineal_2(a);
            }
        }
    }

    public static void maxSubsequenceSum_cubic (int []a){
        int maxSum = 0;
        int thisSum;
        int seqStart = 0;
        int seqEnd = 0;
        int numIte = 0;
        for (int i = 0; i < a.length; i++){
            numIte += 1;
            for (int j = i; j < a.length; j++){
                numIte += 1;
                thisSum = 0;
                for(int k = i; k <= j; k++){
                    numIte += 1;
                    thisSum += a[k];
                }
                if(thisSum > maxSum){
                    maxSum = thisSum;
                    seqStart = i;
                    seqEnd = j;
                }
            }
        }
        System.out.println("Solucion de orden cubico");
        System.out.println("Maximo: " + maxSum);
        System.out.println("Inicio: " + seqStart + " Final: " + seqEnd);
        System.out.println("Numero de iteraciones: " + numIte);
    }

    public static void maxSubsequenceSum_quadratic (int []a){
        int maxSum = 0;
        int thisSum;
        int seqStart = 0;
        int seqEnd = 0;
        int numIte = 0;
        for (int i = 0; i < a.length; i++){
            numIte += 1;
            thisSum = 0;
            for (int j = i; j < a.length; j++){
                numIte += 1;
                thisSum += a[j];
                if(thisSum > maxSum){
                    maxSum = thisSum;
                    seqStart = i;
                    seqEnd = j;
                }
            }
        }
        System.out.println("Solucion de orden cuadratico");
        System.out.println("Maximo: " + maxSum);
        System.out.println("Inicio: " + seqStart + " Final: " + seqEnd);
        System.out.println("Numero de iteraciones: " + numIte);
    }

    public static void maxSubsequenceSum_lineal_1 (int []a){
        int maxSum = 0;
        int thisSum = 0;
        int seqStart = 0;
        int seqEnd = 0;
        int numIte = 0;
        int i = 0;
        int k = 0;
        for(int j = 0; j < a.length; j++ ){
            numIte += 1;
            thisSum += a[j];
            if(thisSum > maxSum){
                maxSum = thisSum;
                seqStart = i;
                seqEnd = j;
            }
            if(j == a.length-1){
                j = i;
                i++;
                thisSum = 0;
                k++;
            }
            if(k == a.length){
                break;
            }
        }
        System.out.println("Solucion de orden lineal(1)");
        System.out.println("Maximo: " + maxSum);
        System.out.println("Inicio: " + seqStart + " Final: " + seqEnd);
        System.out.println("Numero de iteraciones: " + numIte);
    }

    public static void maxSubsequenceSum_lineal_2 (int []a){
        int maxSum = 0;
        int thisSum = 0;
        int seqStart = 0;
        int seqEnd = 0;
        int numIte = 0;
        int i = 0;
        for(int j = 0; j < a.length; j++){
            numIte += 1;
            thisSum += a[j];
            if(maxSum < thisSum){
                maxSum = thisSum;
                seqStart = i;
                seqEnd = j;
            }
            if(thisSum < 0){
                thisSum = 0;
                i = j+1;
            }
        }
        System.out.println("Solucion de orden lineal(2)");
        System.out.println("Maximo: " + maxSum);
        System.out.println("Inicio: " + seqStart + " Final: " + seqEnd);
        System.out.println("Numero de iteraciones: " + numIte);
    }

    public static void maxSubsequenceSum_lineal(int []a){
        int thisSum = a[0];
        int maxSum = a[0];
        int seqStart = 0;
        int seqEnd = 0;
        int numIte = 0;
        for(int i = 1; i < a.length; i++){
            numIte += 1;
            if(a[i] > a[i]+thisSum){
                thisSum = a[i];
                seqStart = i;
            }else{
                thisSum += a[i];
            }
            if(thisSum > maxSum){
                maxSum = thisSum;
                seqEnd = i;
            }
        }
        System.out.println("Solucion de orden lineal");
        System.out.println("Maximo: " + maxSum);
        System.out.println("Inicio: " + seqStart + " Final: " + seqEnd);
        System.out.println("Numero de iteraciones: " + numIte);
    }

    public static void main(String[] args) {
        showMenu();
    }
}
