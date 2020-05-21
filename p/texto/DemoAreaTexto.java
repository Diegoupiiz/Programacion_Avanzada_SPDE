package texto;

import javax.swing.JFrame;

public class DemoAreaTexto {
    public static void main(String[] args) {
        AreaTexto areaTexto = new AreaTexto();
        areaTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        areaTexto.setSize(450, 230);
        areaTexto.setVisible( true);
    }
}