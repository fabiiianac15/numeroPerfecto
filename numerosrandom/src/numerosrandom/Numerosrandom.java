package numerosrandom;



public class Numerosrandom {

    public static void main(String[] args) {
        int size = 100;
        long inicio = System.nanoTime();

        int[][] matriz = new int[size][size];
        System.out.println("Matriz de numeros aleatorios \n");
        String imprimir = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matriz[i][j] = (int) (Math.random() * 11);
                imprimir = imprimir + "| " + matriz[i][j];
            }
            imprimir = imprimir + "| \n";
        }

        System.out.println(imprimir);
        long fin = System.nanoTime();

        long tiempo = (fin - inicio);

        System.out.println("Tiempo de ejecución: " + tiempo + " nanosegundos");

    }

}
