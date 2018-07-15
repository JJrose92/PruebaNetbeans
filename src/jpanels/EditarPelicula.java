/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanels;

import excel.ProgramasExcel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author Juan
 */
public class EditarPelicula extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public EditarPelicula(String pelicula) {
        initComponents();
        Menu e1 = new Menu();
        Volver e2 = new Volver();
        Ok e3 = new Ok();
        rellenar(pelicula);
        peliculaAntigua = pelicula;
        MENUButton.addActionListener(e1);
        VOLVERButton.addActionListener(e2);
        OKButton.addActionListener(e3);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MENUButton = new javax.swing.JButton();
        VOLVERButton = new javax.swing.JButton();
        OKButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombrePeli = new javax.swing.JTextField();
        jTextFieldDirector = new javax.swing.JTextField();
        jTextFieldProductor = new javax.swing.JTextField();
        jTextFieldPais = new javax.swing.JTextField();
        jTextFieldAno = new javax.swing.JTextField();
        jTextFieldGenero = new javax.swing.JTextField();
        notajLabel = new javax.swing.JLabel();
        jTextnota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MENUButton.setText("MENU");

        VOLVERButton.setText("VOLVER");

        OKButton.setText("OK");

        jLabel1.setText("Nombre Pelicula: ");

        jLabel2.setText("Director:");
        jLabel2.setToolTipText("");

        jLabel3.setText("Productor:");

        jLabel4.setText("Pais:");

        jLabel5.setText("Año:");

        jLabel6.setText("Genero: ");

        notajLabel.setText("Nota:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MENUButton)
                                .addGap(129, 129, 129)
                                .addComponent(VOLVERButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OKButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(234, 234, 234)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 30, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextFieldDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNombrePeli)))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(notajLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextnota, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombrePeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 96, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldProductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notajLabel)
                    .addComponent(jTextnota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MENUButton)
                    .addComponent(VOLVERButton)
                    .addComponent(OKButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class Menu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            MenuPrincipalFrame obj = new MenuPrincipalFrame();
            obj.setVisible(true);
            dispose();
        }

    }
    
    private void rellenar(String pelicula){
        ProgramasExcel programasExcel = new ProgramasExcel();
        ArrayList datosPelicula;
        try {
            datosPelicula = programasExcel.datosPelicula(pelicula);
            jTextFieldNombrePeli.setText(datosPelicula.get(0).toString());
            jTextFieldGenero.setText(datosPelicula.get(1).toString());
            jTextFieldDirector.setText(datosPelicula.get(2).toString());
            jTextFieldPais.setText(datosPelicula.get(3).toString());
            jTextFieldProductor.setText(datosPelicula.get(4).toString());
            jTextFieldAno.setText(datosPelicula.get(5).toString());
            jTextnota.setText(datosPelicula.get(6).toString());
        } catch (IOException ex) {
            Logger.getLogger(EditarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidFormatException ex) {
            Logger.getLogger(EditarPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        
        
    }

    public class Volver implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            MenuEliminar obj = new MenuEliminar(false);
            obj.setVisible(true);
            dispose();
        }

    }

    public class Ok implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(jTextFieldNombrePeli.getText());
            arrayList.add(jTextFieldGenero.getText());
            arrayList.add(jTextFieldDirector.getText());
            arrayList.add(jTextFieldPais.getText());
            arrayList.add(jTextFieldProductor.getText());
            arrayList.add(jTextFieldAno.getText());
            arrayList.add(jTextnota.getText());

            MenuEliminar obj = new MenuEliminar(false);
            ProgramasExcel programasExcel = new ProgramasExcel();
            try {
                OptimizarCodigo optimizarCodigo = new OptimizarCodigo();
                if (optimizarCodigo.OptimizarIF(programasExcel, arrayList)) {
                    programasExcel.EditarPelicula(arrayList, peliculaAntigua);
                } else {
                    obj.setVisible(false);
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(AnadirVariado.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidFormatException ex) {
                Logger.getLogger(AnadirVariado.class.getName()).log(Level.SEVERE, null, ex);
            }
            obj.setVisible(true);
            dispose();
        }

    }

    /**
     * @param args the command line arguments
     */
   private String peliculaAntigua;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MENUButton;
    private javax.swing.JButton OKButton;
    private javax.swing.JButton VOLVERButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldDirector;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldNombrePeli;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JTextField jTextFieldProductor;
    private javax.swing.JTextField jTextnota;
    private javax.swing.JLabel notajLabel;
    // End of variables declaration//GEN-END:variables
}
