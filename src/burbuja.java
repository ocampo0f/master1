import javax.swing.JOptionPane;

public class burbuja {

    public static void main(String[] args) {
        try {
        	String input = JOptionPane.showInputDialog("Ingrese el tamaño del arreglo:");
            int n = Integer.parseInt(input);

            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "El tamaño del arreglo debe ser mayor que 0.");
                return;
            }

            int[] arreglo = new int[n];

            StringBuilder entrada = new StringBuilder();
            for (int i = 0; i < n; i++) {
                String valorStr = JOptionPane.showInputDialog("Ingrese el valor para la posición " + i + ":");
                arreglo[i] = Integer.parseInt(valorStr);
            }

            bubbleSort(arreglo);

            StringBuilder resultado = new StringBuilder();
            resultado.append("Arreglo ordenado:\n");
            for (int i = 0; i < n; i++) {
                resultado.append(arreglo[i]).append(" ");
            }
            JOptionPane.showMessageDialog(null, resultado.toString());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese números enteros válidos.");
        }
    }

    // Método para ordenar un arreglo usando el algoritmo de burbuja
    public static void bubbleSort(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambiado;
        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar arreglo[j] y arreglo[j + 1]
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true;
                }
            }
            if (!intercambiado) {
                break;
            }
        }
    }
}


