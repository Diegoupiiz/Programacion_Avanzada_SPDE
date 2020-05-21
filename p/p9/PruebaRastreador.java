package p9;

import javax.swing.JFrame;

public class PruebaRastreador {
    public static void main(String[] args) {
        RastreadorRaton rastreadorRaton = new RastreadorRaton();
        rastreadorRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rastreadorRaton.setSize( 300,100);
        rastreadorRaton.setVisible( true );
    }
}