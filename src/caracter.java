import javax.swing.JOptionPane;

public class caracter {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese una cadena de caracteres:");

        if (input == null || input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ingresó ninguna cadena.");
            return;
        }

        String StrLargo = EncontrarStringLargo(input);

        JOptionPane.showMessageDialog(null, "Subcadena más larga sin caracteres repetidos: " + StrLargo);
        JOptionPane.showMessageDialog(null, "Longitud de la subcadena: " + StrLargo.length());
    }

    private static String EncontrarStringLargo(String c) {
        int maxLength = 0;
        String CadenaLarga = "";

        for (int i = 0; i < c.length(); i++) {
            boolean[] Repetido = new boolean[256];
            StringBuilder SubString = new StringBuilder();
            
            for (int j = i; j < c.length(); j++) {
                char currentChar = c.charAt(j);

                if (Repetido[currentChar]) {
                    break;
                }

                Repetido[currentChar] = true;
                SubString.append(currentChar);

                if (SubString.length() > maxLength) {
                    maxLength = SubString.length();
                    CadenaLarga = SubString.toString();
                }
            }
        }

        return CadenaLarga;
    }
}


