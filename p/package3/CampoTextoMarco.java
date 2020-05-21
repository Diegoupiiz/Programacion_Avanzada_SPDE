package package3;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class CampoTextoMarco {
    private JTextField campoTexto1;
    private JTextField campoTexto2;
    private JTextField campoTexto3;
    private JPasswordField campoContrasenia;
    
    public CampoTextoMarco()
    {
        super("Prueba de JTextField y JPasswordField");
        setLayout( new FlowLayout() );
        campoTexto1 = new JTextField(10);
        add (campoTexto1);

        campoTexto2 = new JTextField("Escribe aquí");
        add(campoTexto2);

        campoTexto3 = new JTextField("Campo de texto no editable", 21);
        campoTexto3.setEditable(false);
        add(campoContrasenia);

        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionLIstener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasenia.addActionListener(manejador);
    }

    private class ManejadorCampoTexto implements ActionLIstener
    {
        public void actionPerformed(ActionEvent evento)
        {
            if (evento.getSource() == campoTexto1)
            cadena = String.format("campoTexto1: %s", evento.getActionCommand());

            else if (evento.getSource() == campoTexto2)
            cadena = String.format("campoTexto2: %s", evento.getActionCommand());

            else if (evento.getSource() == campoTexto3)
            cadena = String.format("campoTexto3: %s", evento.getActionCommand());

            else if (evento.getSource() == campoContrasenia)
            cadena = String.format("campoContrasenia: %s", new String(campoContrasenia.getPassword()));

            JOptionPane.showMessageDialog(null, cadena);
        }
    }

	public void setVisible(boolean b) {
	}

	public void setDefaultCloseOperation(int exitOnClose) {
	}

	public void setSize(int i, int j) {
	}

	public void setDefaultCloseOperation(int exitOnClose) {
	}
}