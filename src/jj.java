import javax.swing.JOptionPane;

public class jj {

    public static void main(String[] args) {
        String cantidadStr = JOptionPane.showInputDialog("¿Cuántos números va a ingresar?");
        int cantidad = Integer.parseInt(cantidadStr);

        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            String entrada = JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(entrada);
        }

        int positivos = 0, negativos = 0, ceros = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        double porcentajePositivos = (positivos * 100.0) / cantidad;
        double porcentajeNegativos = (negativos * 100.0) / cantidad;
        double porcentajeCeros = (ceros * 100.0) / cantidad;

        String resultado = String.format(
            "Positivos: %d (%.2f%%)\nNegativos: %d (%.2f%%)\nCeros: %d (%.2f%%)",
            positivos, porcentajePositivos,
            negativos, porcentajeNegativos,
            ceros, porcentajeCeros
        );

        JOptionPane.showMessageDialog(null, resultado);
    }
}
