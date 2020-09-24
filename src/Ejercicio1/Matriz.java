package Ejercicio1;

public class Matriz {

    public void armar() {

        int matriz[][] = new int[4][];
        matriz[0] = new int[4];
        matriz[1] = new int[3];
        matriz[2] = new int[5];
        matriz[3] = new int[2];
        int i = 3;

        for (int[] fila : matriz) {
            for (int c = 0; c < fila.length; c++) {
                fila[c] = i;
                i += 3;
            }
        }

        for (int[] fila : matriz) {
            for (int c = 0; c < fila.length; c++) {
                if (fila[c] % 2 == 0) {
                    System.out.print(" " + fila[c]);
                }
            }
            System.out.println("");
        }

    }

}
