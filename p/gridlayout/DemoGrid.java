package gridlayout;

import javax.swing.JFrame;

public class DemoGrid {
    public static void main(String[] args) {
        MarcoGrid marcoGrid = new MarcoGrid();
        marcoGrid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoGrid.setSize(400,300);
        marcoGrid.setVisible( true);
    }
}