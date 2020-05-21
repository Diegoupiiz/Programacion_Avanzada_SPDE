package package2;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import sun.awt.geom.AreaOp.AddOp;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame {
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    
    public LabelFrame()
    {
        super ();
        setLayout(new FlowLayout());

        etiqueta1 = new JLabel ("Etiqueta con un texto");
        etiqueta1.setToolTipText("Etiqueta1");
        add(etiqueta1);

        Icon porsche = new ImageIcon( getClass().getResource("porsche.jpg"));
        etiqueta2 = new JLabel("Etiqueta con texto e icono", porsche, SwingConstants.LEFT);
        etiqueta2.setToolTipText("etiqueta2");
        add(etiqueta2);

        etiqueta3 = new JLabel();
        etiqueta3.setText("Etiqueta con icono y texto en la parte inferior");
        etiqueta3.setIcon(porsche);
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("etiqueta3");
        add(etiqueta3);
    }

    private void add(JLabel etiqueta12) {
    }

    private void setLayout(FlowLayout flowLayout) {
    }

	public void setDefaultCloseOperation(int exitOnClose) {
	}

	public void setSize(int i, int j) {
	}

	public void setVisible(boolean b) {
	}
}