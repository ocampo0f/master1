 
public class ClasificarNumeros {

    public static void main(String[] args) {
        int[] arreglo = {-5, 3, 0, -1, 0, 9, 7, -3, 2};
        clasificarNumeros(arreglo);
    }

    public static void clasificarNumeros(int[] arreglo) {
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int numero : arreglo) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        int totalNumeros = arreglo.length;

        double porcentajePositivos = (totalNumeros > 0) ? (positivos / (double) totalNumeros) * 100 : 0;
        double porcentajeNegativos = (totalNumeros > 0) ? (negativos / (double) totalNumeros) * 100 : 0;
        double porcentajeCeros = (totalNumeros > 0) ? (ceros / (double) totalNumeros) * 100 : 0;

        System.out.printf("Positivos: %d (%.2f%%)%n", positivos, porcentajePositivos);
        System.out.printf("Negativos: %d (%.2f%%)%n", negativos, porcentajeNegativos);
        System.out.printf("Ceros: %d (%.2f%%)%n", ceros, porcentajeCeros);
    }
}
