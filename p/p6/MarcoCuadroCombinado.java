package p6;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MarcoCuadroCombinado {
    private JComboBox imagenesJComboBox;
    private JLabel etiqueta;

    private String nombres[] = {
        "perro1.jpg", "perrro2.jpg", "porsche.jpg", "gato1.jpg"
    };
    private Icon iconos[] = {
        new ImageIcon(getClass().getResource(nombres[0])),
        new ImageIcon(getClass().getResource(nombres[1])),
        new ImageIcon(getClass().getResource(nombres[2])),
        new ImageIcon(getClass().getResource(nombres[3]))
    };
     public MarcoCuadroCombinado()
     {
        super( “Prueba de JComboBox” );
        setLayout( new FlowLayout() ); // establece el esquema del marco
        imagenesJComboBox = new JComboBox( nombres ); // establece JComboBox
        imagenesJComboBox.setMaximumRowCount( 3 ); // muestra tres filas
        imagenesJComboBox.addItemListener(
        new ItemListener() // clase interna anónima
        {
            // maneja evento de JComboBox
    public void itemStateChanged( ItemEvent evento )
    {
// determina si está seleccionada la casilla de verificación
        if ( evento.getStateChange() == ItemEvent.SELECTED )
        etiqueta.setIcon( iconos[
        imagenesJComboBox.getSelectedIndex() ] );
                } // fin del método itemStateChanged
            } // fin de la clase interna anónima
        ); // fin de la llamada a addItemListener
        add( imagenesJComboBox ); // agrega cuadro combinado a JFrame
        etiqueta = new JLabel( iconos[ 0 ] ); // muestra el primer icono
        add( etiqueta ); // agrega etiqueta a JFrame
    }
}