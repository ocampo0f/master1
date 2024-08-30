import javax.swing.JOptionPane;

public class PorcentajeNumero {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de números:");
        int tamaño;
        
        try {
            tamaño = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número entero.");
            return;
        }
        
        int[] arreglo = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            String numeroStr = JOptionPane.showInputDialog(null, "Ingrese el número " + (i + 1) + ":");
            try {
                arreglo[i] = Integer.parseInt(numeroStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número entero.");
            }
        }
        
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

        String mensaje = String.format("Positivos: %d (%.2f%%)%nNegativos: %d (%.2f%%)%nCeros: %d (%.2f%%)",
                                       positivos, porcentajePositivos,
                                       negativos, porcentajeNegativos,
                                       ceros, porcentajeCeros);

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
