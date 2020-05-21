package p9;

import java.awt.color.*;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RastreadorRaton {
    private JPanel panelRaton;
    private JLabel barraEstado;

    public RastreadorRaton()
    {
        super("Demo");
        panelRaton = new JPanel();
        panelRaton.setBackground(Color.WHITE);
        add(panelRaton, BorderLayout.CENTER);

        barraEstado = new JLabel("Raton fuera de JPanel");
        add(barraEstado, BorderLayout.SOUTH);

        ManejadorRaton manejador = new ManejadorRaton();
        panelRaton.addMouseListener(manejador);
        panelRaton.addMouseMotionListener(manejador);
    }
    
        private class ManejadorRaton implements MouseListener, MouseMotionListener{
            public void mouseClicked(MouseEvent evento){
                barraEstado.setText(String.format("Se hizo clic en [%d, %d", evento.getX(), evento.getY()));
            }
            
            public void mousePressed(MouseEvent evento){
                barraEstado.setText(String.format( "Se clickeo en [%d, %d]", evento.getX(), evento.getY()));
            }

            public void mouseReleased(MouseEvent evento)
            {
                barraEstado.setText(String.format("Se solto en [%d, %d]", evento.getX(), evento.getY()));
            }
            public void mouseEntered( MouseEvent evento){
                barraEstado.setText( String.format("El raton entro en [%d, %d]", evento.getX(), evento.getY()));
                panelRaton.setBackground(Color.GREEN);
            }

            public void mouseExited (MouseEvent evento){
                barraEstado.setText( "Raton fuera de JPanel");
                panelRaton.setBackground( Color.WHITE);
            }

            public void MouseDragged ( MouseEvent evento){
                barraEstado.setText(String.format("Se arrastro en [%d, %d]", evento.getX(), evento.getY()));
            }
            public void mouseMoved( MouseEvent evento){
                barraEstado.setText( String.format("Se movio en [%d, %d]", evento.getX(), evento.getY()));
            }

        }
    
    

}