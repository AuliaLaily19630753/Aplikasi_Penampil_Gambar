/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layout;

import java.awt.CardLayout;

/**
 *
 * @author ASUS
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarComboBox
     */
    public PilihGambarComboBox() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbpilihgambar = new javax.swing.JLabel();
        PILIHcb = new javax.swing.JComboBox<>();
        cardLayoutPanel = new javax.swing.JPanel();
        lbcamera = new javax.swing.JLabel();
        lbearphone = new javax.swing.JLabel();
        lblaptop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbpilihgambar.setText("Pilih Gambar");

        PILIHcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " \" PILIH \" ", "Camera", "Earphone", "Laptop" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(lbpilihgambar)
                .addGap(18, 18, 18)
                .addComponent(PILIHcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbpilihgambar)
                    .addComponent(PILIHcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        cardLayoutPanel.setLayout(new java.awt.CardLayout());

        lbcamera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Layout/Camera.jpg"))); // NOI18N
        cardLayoutPanel.add(lbcamera, "1");

        lbearphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Layout/Earphone.jpeg"))); // NOI18N
        cardLayoutPanel.add(lbearphone, "2");

        lblaptop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Layout/Laptop.jpg"))); // NOI18N
        cardLayoutPanel.add(lblaptop, "3");

        getContentPane().add(cardLayoutPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PILIHcbItemStateChanged(java.awt.event.ActionEvent evt){
        CardLayout cl = (CardLayout) (cardLayoutPanel.getLayout());
        cl.show(cardLayoutPanel,String.valueOf(PILIHcb.getSelectedIndex()));
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
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PILIHcb;
    private javax.swing.JPanel cardLayoutPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbcamera;
    private javax.swing.JLabel lbearphone;
    private javax.swing.JLabel lblaptop;
    private javax.swing.JLabel lbpilihgambar;
    // End of variables declaration//GEN-END:variables
}
