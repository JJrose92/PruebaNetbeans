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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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

    public boolean mensajeEditarAnadirPelicula(JPanel jPanel1, ArrayList arrayList, ArrayList datosPelicula) {
        Object[] opciones = {"Aceptar", "Cancelar"};
        if (datosPelicula == null) {
        int eleccion = JOptionPane.showOptionDialog(jPanel1, "En realidad desea añadir la pelicula con estos datos:"
                + "\nNombre Pelicula: " + arrayList.get(0).toString()
                + "\nGenero: " + arrayList.get(1).toString()
                + "\nDirector: " + arrayList.get(2).toString()
                + "\nPaís: " + arrayList.get(3).toString()
                + "\nProductor: " + arrayList.get(4).toString()
                + "\nAño: " + arrayList.get(5).toString()
                + "\nNota: " + arrayList.get(6).toString(),
                "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
        } else {
            int eleccion = JOptionPane.showOptionDialog(jPanel1, "En realidad desea añadir la pelicula con estos datos:"
                    + "\nNombre Pelicula: " + datosPelicula.get(0).toString() + " por " + arrayList.get(0).toString()
                    + "\nGenero: " + datosPelicula.get(1).toString() + " por " + arrayList.get(1).toString()
                    + "\nDirector: " + datosPelicula.get(2).toString() + " por " + arrayList.get(2).toString()
                    + "\nPaís: " + datosPelicula.get(3).toString() + " por " + arrayList.get(3).toString()
                    + "\nProductor: " + datosPelicula.get(4).toString() + " por " + arrayList.get(4).toString()
                    + "\nAño: " + datosPelicula.get(5).toString() + " por " + arrayList.get(5).toString()
                    + "\nNota: " + datosPelicula.get(6).toString() + " por " + arrayList.get(6).toString(),
                    "Mensaje de Confirmacion",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
            if (eleccion == JOptionPane.YES_OPTION) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean mensajeAnadirEditarVariado(JPanel rootPane, String opcionHoja, String text, String palabraAntigua, boolean opc) {
        Object[] opciones = {"Aceptar", "Cancelar"};
        if (palabraAntigua == null) {
            int eleccion = JOptionPane.showOptionDialog(rootPane, "En realidad desea añadir lo siguiente:"
                    + "\n" + opcionHoja + ": " + text, "Mensaje de Confirmacion",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opciones,
                    "Aceptar");
            if (eleccion == JOptionPane.YES_OPTION) {
                return true;
            } else {
                return false;
            }
        } else {
            int eleccion = JOptionPane.showOptionDialog(rootPane, "En realidad desea editar en todas sus apariciones lo siguiente:"
                    + "\n" + opcionHoja + ": " + palabraAntigua + " por " + text, "Mensaje de Confirmacion",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opciones,
                    "Aceptar");
            if (eleccion == JOptionPane.YES_OPTION) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean mensajeEliminar(JPanel jPanel1, String variable, String decision) {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(jPanel1, "En realidad desea eliminar en todas sus apariciones lo siguiente:"
                + "\n" + variable + ": " + decision, "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }
    
        public boolean mensajeImportar(JPanel jPanel1, String ruta) {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(jPanel1, "En realidad desea importar el archivo que esta en la siguiente ruta:"
                + "\nRuta: " + ruta, "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }
}
