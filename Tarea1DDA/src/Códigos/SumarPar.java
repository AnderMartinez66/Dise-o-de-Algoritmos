package Códigos;

public class SumarPar {
    public static boolean existePar(int[] arr, int K) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == K) {
                    System.out.println("Par encontrado: " + arr[i] + " + " + arr[j] + " = " + K);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 4, 7, 12, 5, 11, 8, 2};
        int K = 15;

        if (existePar(arreglo, K)) {
            System.out.println("Sí existe un par que suma " + K);
        } else {
            System.out.println("No existe tal par.");
        }
    }
}
