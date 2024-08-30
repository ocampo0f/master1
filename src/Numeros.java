import javax.swing.JOptionPane;

public class Numeros {
    public static void main(String[] args) {
        String Numero1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String Numero2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        String Numero3 = JOptionPane.showInputDialog("Ingrese el tercer número:");

        int num1 = Integer.parseInt(Numero1);
        int num2 = Integer.parseInt(Numero2);
        int num3 = Integer.parseInt(Numero3);

        int mayor, menor, medio;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        if ((num1 > menor && num1 < mayor) || (num1 < menor && num1 > mayor)) {
            medio = num1;
        } else if ((num2 > menor && num2 < mayor) || (num2 < menor && num2 > mayor)) {
            medio = num2;
        } else {
            medio = num3;
        }

        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor + 
                                            "\nEl número menor es: " + menor + 
                                            "\nEl número del medio es: " + medio);
    }
}