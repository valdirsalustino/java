/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valdir
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class RioGUI extends javax.swing.JFrame {

    /**
     * Creates new form RioGUI
     */
    public RioGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        runRioButton = new javax.swing.JButton();
        setFigurePathLabel = new javax.swing.JLabel();
        figurePath = new javax.swing.JTextField();
        myDalitzJPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        displayJPanelJToggleButton = new javax.swing.JToggleButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        runRioButton.setText("run Rio+");
        runRioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runRioButtonActionPerformed(evt);
            }
        });

        setFigurePathLabel.setText("Set figure path");

        figurePath.setText("/home/valdir/Documents/git/java/myProjects/javaText.png");
        figurePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                figurePathActionPerformed(evt);
            }
        });

        myDalitzJPanel.setBackground(new java.awt.Color(249, 246, 145));
        myDalitzJPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        myDalitzJPanel.setMaximumSize(new java.awt.Dimension(1000, 1000));

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/valdir/Documents/git/java/myProjects/javaText.png")); // NOI18N

        javax.swing.GroupLayout myDalitzJPanelLayout = new javax.swing.GroupLayout(myDalitzJPanel);
        myDalitzJPanel.setLayout(myDalitzJPanelLayout);
        myDalitzJPanelLayout.setHorizontalGroup(
            myDalitzJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myDalitzJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(434, 434, 434))
        );
        myDalitzJPanelLayout.setVerticalGroup(
            myDalitzJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myDalitzJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        displayJPanelJToggleButton.setText("Display");
        displayJPanelJToggleButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                displayJPanelJToggleButtonStateChanged(evt);
            }
        });
        displayJPanelJToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayJPanelJToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myDalitzJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(setFigurePathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(runRioButton))
                            .addComponent(displayJPanelJToggleButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(figurePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(setFigurePathLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(figurePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayJPanelJToggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(runRioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(myDalitzJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runRioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runRioButtonActionPerformed
        // TODO add your handling code here:
        RioGUI rioGuiObj = new RioGUI();
        
        rioGuiObj.executeRio();
    }//GEN-LAST:event_runRioButtonActionPerformed

    private void figurePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_figurePathActionPerformed
        // TODO add your handling code here:
       String address = figurePath.getText();
      
       ImageIcon icon = new ImageIcon(address); 
       JLabel label = new JLabel(icon);
       myDalitzJPanel.add(label);
       
       myDalitzJPanel.setVisible(true);
       label.setVisible(true);
       //JOptionPane.showMessageDialog(null, label);


        
      
    }//GEN-LAST:event_figurePathActionPerformed

    private void displayJPanelJToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayJPanelJToggleButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_displayJPanelJToggleButtonActionPerformed

    private void displayJPanelJToggleButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_displayJPanelJToggleButtonStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_displayJPanelJToggleButtonStateChanged

    
    private void executeRio(){
        StringBuffer buffer = new StringBuffer();
        Process p;
        
        String command = "root -l /home/valdir/Documents/tutorials/hist/hsum.C";
        try{
            p = Runtime.getRuntime().exec(command);
            p.waitFor();   
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        }catch (Exception e){
            e.printStackTrace(); 
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
            java.util.logging.Logger.getLogger(RioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RioGUI().setVisible(true);
            }
        });
        

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton displayJPanelJToggleButton;
    private javax.swing.JTextField figurePath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel myDalitzJPanel;
    private javax.swing.JButton runRioButton;
    private javax.swing.JLabel setFigurePathLabel;
    // End of variables declaration//GEN-END:variables

}