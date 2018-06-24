/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Juan
 */
public class MenuAnadirFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public MenuAnadirFrame() {
        initComponents();
        Menu e1 = new Menu();
        Productor e2 = new Productor();
        Pelicula e3 = new Pelicula();
        Director e4 = new Director();
        Productor e5 = new Productor();
        MENUButton.addActionListener(e1);
        ANADIRProductor.addActionListener(e2);
        ANADIRPelicula.addActionListener(e3);
        ANADIRDirector.addActionListener(e4);
        ANADIRPais.addActionListener(e5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ANADIRPelicula = new javax.swing.JButton();
        ANADIRDirector = new javax.swing.JButton();
        ANADIRProductor = new javax.swing.JButton();
        ANADIRPais = new javax.swing.JButton();
        MENUButton = new javax.swing.JButton();
        ANADIRGenero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ANADIRPelicula.setText("Añadir Pelicula");
        ANADIRPelicula.setToolTipText("");
        ANADIRPelicula.setActionCommand("botonAnadirPelicula");
        ANADIRPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANADIRPeliculaActionPerformed(evt);
            }
        });

        ANADIRDirector.setText("Añadir Director");
        ANADIRDirector.setToolTipText("");
        ANADIRDirector.setActionCommand("botonAnadirDirector");
        ANADIRDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANADIRDirectorActionPerformed(evt);
            }
        });

        ANADIRProductor.setText("Añadir Productor");
        ANADIRProductor.setToolTipText("");
        ANADIRProductor.setActionCommand("botonAnadirProductor");
        ANADIRProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANADIRProductorActionPerformed(evt);
            }
        });

        ANADIRPais.setText("Añadir Pais");
        ANADIRPais.setToolTipText("");
        ANADIRPais.setActionCommand("botonAnadirProductor");
        ANADIRPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANADIRPaisActionPerformed(evt);
            }
        });

        MENUButton.setText("MENU");

        ANADIRGenero.setText("Añadir Género");
        ANADIRGenero.setToolTipText("");
        ANADIRGenero.setActionCommand("botonAnadirPelicula");
        ANADIRGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANADIRGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ANADIRPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ANADIRDirector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ANADIRProductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ANADIRPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ANADIRGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MENUButton)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(ANADIRPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ANADIRDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ANADIRProductor)
                .addGap(18, 18, 18)
                .addComponent(ANADIRPais)
                .addGap(18, 18, 18)
                .addComponent(ANADIRGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(MENUButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ANADIRPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANADIRPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANADIRPeliculaActionPerformed

    private void ANADIRDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANADIRDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANADIRDirectorActionPerformed

    private void ANADIRProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANADIRProductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANADIRProductorActionPerformed

    private void ANADIRPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANADIRPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANADIRPaisActionPerformed

    private void ANADIRGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANADIRGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANADIRGeneroActionPerformed

        public class Menu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            MenuPrincipalFrame obj = new MenuPrincipalFrame();
            obj.setVisible(true);
            dispose();
        }

    }
        
        public class Productor implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e2) {
            AnadirVariado obj = new AnadirVariado();
            opcion = "Productor";
            obj.AnadirVariado(opcion);
            obj.setVisible(true);
            dispose();
        } 
}
        
        public class Pelicula implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e3) {
            AnadirPelicula obj = new AnadirPelicula();
            obj.setVisible(true);
            dispose();
        } 
}
        
        public class Director implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e4) {
            AnadirVariado obj = new AnadirVariado();
            opcion = "Director";
            obj.AnadirVariado(opcion);
            obj.setVisible(true);
            dispose();
        } 
}
                
        public class Pais implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e5) {
            AnadirVariado obj = new AnadirVariado();
            opcion = "Pais";
            obj.AnadirVariado(opcion);
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
            java.util.logging.Logger.getLogger(MenuAnadirFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAnadirFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAnadirFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAnadirFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAnadirFrame().setVisible(true);
            }
        });
    }
    private String opcion;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANADIRDirector;
    private javax.swing.JButton ANADIRGenero;
    private javax.swing.JButton ANADIRPais;
    private javax.swing.JButton ANADIRPelicula;
    private javax.swing.JButton ANADIRProductor;
    private javax.swing.JButton MENUButton;
    // End of variables declaration//GEN-END:variables
}
