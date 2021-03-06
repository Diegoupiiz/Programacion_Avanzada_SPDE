package gridlayout;

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoGrid extends JFrame implements ActionListener{
    private JButton botones[];
    private final String nombres[] =
        {"uno", "dos", "tres", "cuatro", "cinco", "seis"};
    private boolean alternar = true;
    private Container contenedor;
    private GridLayout cuadricula1;
    private GridLayout cuadricula2;

    public MarcoGrid()
    {
        super("Demo de GridLayout");
        cuadricula1 = new GridLayout(2, 3, 5, 5); // 2x3, espacios de 5
        cuadricula2 = new GridLayout(3,2); // 3x2, sin espacios
        contenedor = getContentPane();
        setLayout( cuadricula1);
        botones = new JButton[nombres.length ];

        for (int cuenta = 0; cuenta < nombres.length; cuenta++)
        {
            botones[cuenta] = new JButton( nombres[cuenta]);
            botones[cuenta].addActionListener( this);
            add( botones[ cuenta ]);
        }
    }

    public void actionPerformed( ActionEvent evento)
    {
        if (alternar)
        contenedor.setLayout(cuadricula2);
        else
        contenedor.setLayout(cuadricula1);

        alternar = !alternar; //establece alternar a su valor opuesto
        contenedor.validate();
    }
}