/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanels;

import excel.ProgramasExcel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

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

    public boolean OptimizarIF(ProgramasExcel programasExcel, ArrayList arrayList) throws IOException, InvalidFormatException {
        boolean name = !programasExcel.PerteneceNombreAHoja("Nombre Pelicula", arrayList.get(0).toString());
        if (!programasExcel.PerteneceNombreAHoja("Nombre Pelicula", arrayList.get(0).toString())) {
            programasExcel.comprobarColumna("Nombre Pelicula", arrayList.get(0).toString());
            if (!programasExcel.PerteneceNombreAHoja("Genero", arrayList.get(1).toString())) {
                programasExcel.comprobarColumna("Genero", arrayList.get(1).toString());
            }
            if (!programasExcel.PerteneceNombreAHoja("Director", arrayList.get(2).toString())) {
                programasExcel.comprobarColumna("Director", arrayList.get(2).toString());
            }
            if (!programasExcel.PerteneceNombreAHoja("Pais", arrayList.get(3).toString())) {
                programasExcel.comprobarColumna("Pais", arrayList.get(3).toString());
            }
            if (!programasExcel.PerteneceNombreAHoja("Productor", arrayList.get(4).toString())) {
                programasExcel.comprobarColumna("Productor", arrayList.get(4).toString());
            }
        }
        return name;

    }
}
