import java.util.HashSet;

public class SumarParHash {
    public static boolean existePar(int[] arr, int K) {
        HashSet<Integer> vistos = new HashSet<>();

        for (int num : arr) {
            int complemento = K - num;
            if (vistos.contains(complemento)) {
                System.out.println("Par encontrado: " + num + " + " + complemento + " = " + K);
                return true;
            }
            vistos.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 4, 7, 12, 6, 3, 11, 10, 14, 16};
        int K = 19;

        if (existePar(arreglo, K)) {
            System.out.println("Sí existe un par que suma " + K);
        } else {
            System.out.println("No existe tal par.");
        }
    }
}
