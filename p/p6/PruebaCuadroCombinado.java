package p6;

import javax.swing.JFrame;

public class PruebaCuadroCombinado {
    public static void main(String[] args) {
        MarcoCuadroCombinado marcoCuadroCombinado = new MarcoCuadroCombinado();
        marcoCuadroCombinado.setDefaultCloserOperation(JFrame.EXIT_ON_CLOSE);
        marcoCuadroCombinado.setSizer(350,150);
        marcoCuadroCombinado.setVisible(true);
    }
}