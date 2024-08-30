import javax.swing.JOptionPane;

public class cicloCuadrilatero {
    public static void main(String[] args) {
        String baseStr = JOptionPane.showInputDialog("Ingrese la base (B):");
        String alturaStr = JOptionPane.showInputDialog("Ingrese la altura (H):");
        
        try {
            int base = Integer.parseInt(baseStr);
            int altura = Integer.parseInt(alturaStr);
            
            if (base < 2 || altura < 2) {
                JOptionPane.showMessageDialog(null, "La base y la altura deben ser mayores o iguales a 2.");
                return;
            }
            
            StringBuilder salida = new StringBuilder();
            
            for (int i = 0; i < base; i++) {
                salida.append('*');
            }
            salida.append('\n');
            
            for (int i = 0; i < altura - 2; i++) {
                salida.append('*');
                for (int j = 0; j < base - 2; j++) {
                    salida.append(' ');
                }
                salida.append('*');
                salida.append('\n');
            }
            
            for (int i = 0; i < base; i++) {
                salida.append('*');
            }
            
            JOptionPane.showMessageDialog(null, salida.toString());
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números enteros válidos.");
        }
    }
}
