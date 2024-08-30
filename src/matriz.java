import javax.swing.JOptionPane;

public class matriz {

    public static void main(String[] args) {
        try {
            String tamaño = JOptionPane.showInputDialog("Ingrese el tamaño de las matrices (n x n):");
            int n = Integer.parseInt(tamaño);

            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "El tamaño de la matriz debe ser mayor que 0.");
                return;
            }

            int[][] matriz1 = new int[n][n];
            int[][] matriz2 = new int[n][n];

            JOptionPane.showMessageDialog(null, "Ingrese los elementos de la primera matriz:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    String valorStr = JOptionPane.showInputDialog("Matriz 1 - Ingrese el valor para la posición (" + i + "," + j + "):");
                    matriz1[i][j] = Integer.parseInt(valorStr);
                }
            }

            JOptionPane.showMessageDialog(null, "Ingrese los elementos de la segunda matriz:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    String valorStr = JOptionPane.showInputDialog("Matriz 2 - Ingrese el valor para la posición (" + i + "," + j + "):");
                    matriz2[i][j] = Integer.parseInt(valorStr);
                }
            }

            int[][] matrizFinal = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int iEspejo = n - 1 - i;
                    int jEspejo = n - 1 - j;
                    matrizFinal[i][j] = matriz1[i][j] + matriz2[iEspejo][jEspejo];
                }
            }

            StringBuilder resultado = new StringBuilder();
            resultado.append("Matriz Resultante:\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    resultado.append(matrizFinal[i][j]).append(" ");
                }
                resultado.append("\n");
            }

            JOptionPane.showMessageDialog(null, resultado.toString());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese números enteros válidos.");
        }
    }
}
