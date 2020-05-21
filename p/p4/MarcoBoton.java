package p4;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame{
    private JButton botonJButtonSimple;
    private JButton botonJButtonElegante;

    public MarcoBoton(){
        super("Prueba de botones");
        setLayout(new FlowLayout());

        botonJButtonSimple = new JButton("Simple");
        add(botonJButtonSimple);

        Icon perro1 = new ImageIcon(getClass().getResource("perro1.jpg"));
        Icon perro2 = new ImageIcon(getClass().getResource("perro2.jpg"));
        botonJButtonElegante = new JButton("Elegante", perro1);
        botonJButtonElegante.setRolloverIcon(perro2);
        add(botonJButtonElegante);

        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }

    private class ManejadorBoton implements ActionListener{
        public void actionPerformed(ActionEvent evento){
            JOptionPane.showMessageDialog(MarcoBoton.this, String.format("Usted oprimio: %s", evento.getActionCommand()));
        }
    }
}