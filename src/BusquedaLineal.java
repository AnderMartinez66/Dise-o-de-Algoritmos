public class BusquedaLineal {
    static int busqueda(int[] arr, int valor) {
        int comp = 0;
        for (int i = 0; i < arr.length; i++) {
            comp++;
            if (arr[i] == valor) return comp;
        }
        return comp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 7, 2, 9, 1};
        System.out.println("Se contó:" + busqueda(arr, 9));
    }
}
