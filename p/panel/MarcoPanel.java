package panel;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MarcoPanel extends JFrame{
    private JPanel panelBotones;
    private JButton botones[];

    public MarcoPanel()
    {
        super("Demo de Panel");
        botones = new JButton[8];
        panelBotones = new JPanel();
        panelBotones.setLayout( new GridLayout(1, botones.length));

        //crea y agrega botones
        for (int cuenta = 0; cuenta < botones.length; cuenta++ )
        {
            botones[ cuenta] = new JButton("Boton" + (cuenta + 1));
            panelBotones.add(botones[cuenta]);
        }
        add(panelBotones, BorderLayout.SOUTH);
    }
}