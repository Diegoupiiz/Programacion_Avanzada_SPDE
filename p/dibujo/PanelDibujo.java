package dibujo;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel{
    private int cuentaPuntos = 0; //contador

    private Point puntos[] = new Point[100000]; //Arreglo de x referencias

    public PanelDibujo()
    {
        addMouseMotionListener(
            new MouseMotionAdapter()
            {
                public void mouseDragged( MouseEvent evento)
                {
                    if ( cuentaPuntos < puntos.length)
                    {
                        puntos[ cuentaPuntos] = evento.getPoint();
                        cuentaPuntos++; //incrementa los puntos en el arreglo
                        repaint();
                    }
                }
            }
        );
    }

    // dibuja un óvalo
    public void paintComponent( Graphics g)
    {
        super.paintComponent( g);
        for (int i = 0; i < cuentaPuntos; i++)
            g.fillOval( puntos[i].x, puntos[i].y, 4, 4);
    }
}