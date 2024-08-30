import javax.swing.JOptionPane;

public class arregloCiclico {

    public static void main(String[] args) {
        try {
            String tamaño = JOptionPane.showInputDialog("Ingrese los elementos del arreglo separados por comas (por ejemplo, 1,2,3,4,5):");
            String[] inputArray = tamaño.split(",");
            int[] arreglo = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                arreglo[i] = Integer.parseInt(inputArray[i].trim());
            }

            String rotaciones = JOptionPane.showInputDialog("Ingrese el número de rotaciones (k):");
            int k = Integer.parseInt(rotaciones);

            rotarDerecha(arreglo, k);

            JOptionPane.showMessageDialog(null, "Arreglo rotado: " + arregloToString(arreglo));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese números enteros válidos.");
        }
    }

    // Método para rotar el arreglo a la derecha k veces
    public static void rotarDerecha(int[] arreglo, int k) {
        int n = arreglo.length;
        k = k % n;  
        if (k == 0) return;

        int[] temporal = new int[n];

        for (int i = 0; i < n; i++) {
            temporal[(i + k) % n] = arreglo[i];
        }

        for (int i = 0; i < n; i++) {
            arreglo[i] = temporal[i];
        }
    }

    // Método para convertir un arreglo de enteros a una cadena
    public static String arregloToString(int[] arreglo) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arreglo.length; i++) {
            sb.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

