package borderlayout;

import javax.swing.JFrame;

public class DemoBorder {
    public static void main(String[] args) {
        MarcoBorder marcoBorder = new MarcoBorder();
        marcoBorder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBorder.setSize(375,200);
        marcoBorder.setVisible( true);
    }
}