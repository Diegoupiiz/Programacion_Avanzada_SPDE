package package1;

import javax.swing.JOptionPane;

public class Suma {
    
    public static void main(String[] args) {
        String primerNumero = JOptionPane.showInputDialog("Inserta un entero");
        String segundoNumero = JOptionPane.showInputDialog("Inserta otro entero");

        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);

        int suma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "La suma es " + suma, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE);
    }
}