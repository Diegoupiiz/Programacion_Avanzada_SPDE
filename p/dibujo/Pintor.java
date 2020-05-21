package dibujo;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pintor {
    public static void main(String[] args) {
        JFrame hola = new JFrame( "Paint chafa");

        PanelDibujo panelDibujo = new PanelDibujo();
        hola.add( panelDibujo, BorderLayout.CENTER);

        hola.add(new JLabel("Arrastre el raton para dibujar"), BorderLayout.SOUTH);

        hola.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hola.setSize(500, 250);
        hola.setVisible( true);
    }
}