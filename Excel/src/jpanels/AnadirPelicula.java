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
public class AnadirPelicula extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public AnadirPelicula() {
        initComponents();
        Menu e1 = new Menu();
        Volver e2 = new Volver();
        Cero e3 = new Cero();
        Existente e4 = new Existente();
        MENUButton.addActionListener(e1);
        VOLVERButton.addActionListener(e2);
        ANADIRCero.addActionListener(e3);
        ANADIRExistente.addActionListener(e4);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ANADIRExistente = new javax.swing.JButton();
        ANADIRCero = new javax.swing.JButton();
        MENUButton = new javax.swing.JButton();
        VOLVERButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ANADIRExistente.setText("Añadir con datos existentes");
        ANADIRExistente.setToolTipText("");
        ANADIRExistente.setActionCommand("botonAnadirDirector");
        ANADIRExistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANADIRExistenteActionPerformed(evt);
            }
        });

        ANADIRCero.setText("Añadir de cero");
        ANADIRCero.setToolTipText("");
        ANADIRCero.setActionCommand("botonAnadirProductor");
        ANADIRCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANADIRCeroActionPerformed(evt);
            }
        });

        MENUButton.setText("MENU");

        VOLVERButton.setText("VOLVER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ANADIRExistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ANADIRCero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MENUButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VOLVERButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(ANADIRExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(ANADIRCero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MENUButton)
                    .addComponent(VOLVERButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ANADIRExistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANADIRExistenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANADIRExistenteActionPerformed

    private void ANADIRCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANADIRCeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANADIRCeroActionPerformed

        public class Menu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            MenuPrincipalFrame obj = new MenuPrincipalFrame();
            obj.setVisible(true);
            dispose();
        }

    }
        
        public class Volver implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e2) {
            MenuAnadirFrame obj = new MenuAnadirFrame();
            obj.setVisible(true);
            dispose();
        } 
}
        

        
        public class Existente implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e3) {
            AnadirVariado obj = new AnadirVariado();
            obj.setVisible(true);
            dispose();
        } 
}
                
        public class Cero implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e4) {
            AnadirPeliculaCero obj = new AnadirPeliculaCero();
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
            java.util.logging.Logger.getLogger(AnadirPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnadirPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnadirPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnadirPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new AnadirPelicula().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANADIRCero;
    private javax.swing.JButton ANADIRExistente;
    private javax.swing.JButton MENUButton;
    private javax.swing.JButton VOLVERButton;
    // End of variables declaration//GEN-END:variables
}
