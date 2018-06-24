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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author Juan
 */
public class AnadirPeliculaCero extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public AnadirPeliculaCero() {
        initComponents();
        Menu e1 = new Menu();
        Volver e2 = new Volver();
        Ok e3 = new Ok();
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
        NombrePelijTextField = new javax.swing.JTextField();
        DirectorjTextField = new javax.swing.JTextField();
        ProductorjTextField = new javax.swing.JTextField();
        PaisjTextField = new javax.swing.JTextField();
        AnojTextField = new javax.swing.JTextField();
        GenerojTextField = new javax.swing.JTextField();

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
                                .addComponent(AnojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 30, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProductorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GenerojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(DirectorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombrePelijTextField)))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PaisjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombrePelijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaisjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 99, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ProductorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(GenerojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MENUButton)
                            .addComponent(VOLVERButton)
                            .addComponent(OKButton))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(DirectorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(AnojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    public class Volver implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            AnadirPelicula obj = new AnadirPelicula();
            obj.setVisible(true);
            dispose();
        }

    }

    public class Ok implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            ano = AnojTextField.getText();
            director = DirectorjTextField.getText();
            genero = GenerojTextField.getText();
            productor = ProductorjTextField.getText();
            nombrePelicula = NombrePelijTextField.getText();
            pais = PaisjTextField.getText();
            AnadirPeliculaCero obj = new AnadirPeliculaCero();
            ProgramasExcel programasExcel = new ProgramasExcel();
            try {
                if (!programasExcel.PerteneceNombreAHoja("Nombre Pelicula", nombrePelicula)) {
                    programasExcel.comprobarColumna("Nombre Pelicula", nombrePelicula);
                    if (!programasExcel.PerteneceNombreAHoja("Productor", productor)) {
                        programasExcel.comprobarColumna("Productor", productor);
                    }
                    if (!programasExcel.PerteneceNombreAHoja("Director", director)) {
                        programasExcel.comprobarColumna("Director", director);
                    }
                    if (!programasExcel.PerteneceNombreAHoja("Pais", pais)) {
                        programasExcel.comprobarColumna("Pais", pais);
                    }
                    if (!programasExcel.PerteneceNombreAHoja("Genero", genero)) {
                        programasExcel.comprobarColumna("Genero", genero);
                    }
                } else {
                    obj.setVisible(false);
                    //dialog.setVisible(true);
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
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnadirPeliculaCero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnadirPeliculaCero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnadirPeliculaCero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnadirPeliculaCero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnadirPeliculaCero().setVisible(true);
            }
        });
    }
    private String ano;
    private String director;
    private String genero;
    private String nombrePelicula;
    private String productor;
    private String pais;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnojTextField;
    private javax.swing.JTextField DirectorjTextField;
    private javax.swing.JTextField GenerojTextField;
    private javax.swing.JButton MENUButton;
    private javax.swing.JTextField NombrePelijTextField;
    private javax.swing.JButton OKButton;
    private javax.swing.JTextField PaisjTextField;
    private javax.swing.JTextField ProductorjTextField;
    private javax.swing.JButton VOLVERButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
