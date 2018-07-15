/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author juan-
 */
public class OptimizarCodigo {

    public void OptimizarBotones(JButton menu, JButton volver, JButton ok) {
        menu.setText("MENU");
        volver.setText("VOLVER");
        ok.setText("OK");
        menu.setToolTipText("");
        volver.setToolTipText("");
    }

    public void OptimizarJLabel(JLabel notajLabel, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6) {
        jLabel1.setText("Nombre Pelicula: ");

        jLabel2.setText("Director:");
        jLabel2.setToolTipText("");

        jLabel3.setText("Productor:");

        jLabel4.setText("Pais:");

        jLabel5.setText("Año:");

        jLabel6.setText("Genero: ");

        notajLabel.setText("Nota:");

    }
	

	

    
}
