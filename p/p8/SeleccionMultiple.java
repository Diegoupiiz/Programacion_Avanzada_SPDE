package p8;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class SeleccionMultiple {
    private JList listaJListColores;
    private JList listaJListCopia;

    private JButton botonJButtonCopiar;
    private final String nombresColores[] = {
        "Negro", "Azul", "Cyan", "Gris Oscuro", "Gris", "Verde", "Gris claro",
        "Magenta", "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo"};

        public SeleccionMultiple()
            {
                super ( "Listas de seleccion multiple");
                setLayout( new FlowLayout());
                listaJListColores = new JList(nombresColores);
                listaJListColores.setVisibleRowCount(7);
                listaJListColores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                add(new JScrollPane(listaJListColores));

                botonJButtonCopiar = new JButton("Copiar >>>");
                botonJButtonCopiar.addActionListener(
                    
                    new ActionListener()
                    {
                        public void actionPerformed(ActionEvent evento)
                        {
                            listaJListCopia.setListData(listaJListColores.getSelectedValues());
                        }
                    }
                );
                add(botonJButtonCopiar);
                listaJListCopia = new JList();
                listaJListCopia.setVisibleRowCount(7);
                listaJListCopia.setFixedCellWidth(100);
                listaJListCopia.setFixedCellHeight(15);
                listaJListCopia.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                add(new JScrollPane(listaJListCopia));
            }
    }
