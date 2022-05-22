/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pastry.project;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Yvette Rimas
 */
public class RiceItems extends javax.swing.JInternalFrame {

    /**
     * Creates new form CakesItems
     */
    public RiceItems() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RiceItems = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        RiceDrinks = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        RiceDrinks1 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        RiceItems.setBackground(new java.awt.Color(255, 204, 153));
        RiceItems.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("Tempura");
        RiceItems.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 160, 40));

        jButton10.setText("Fish Fillet");
        RiceItems.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 160, 40));

        jButton12.setText("Honey Garlic Chicken");
        RiceItems.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 160, 40));

        jButton24.setText("Plain Rice");
        RiceItems.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 160, 40));

        jLabel12.setBackground(new java.awt.Color(204, 102, 0));
        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setText("Combo Meal");
        RiceItems.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, 50));

        jButton27.setText("Chicken Fillet");
        RiceItems.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 160, 40));

        jButton28.setText("Beef Broccoli");
        RiceItems.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 160, 40));

        jButton29.setText("Lumpiang Shanghai");
        RiceItems.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 160, 40));

        jButton34.setText("Chicken Teriyaki");
        RiceItems.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, 160, 40));

        jButton35.setText("Pork Barbeque");
        RiceItems.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 160, 40));

        RiceDrinks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chicken Fillet", "Beef Broccoli", "Lumpiang Shanghai", "Tempura", "Fish Fillet", "Honey Garlic Chicken", "Chicken Teriyaki", "Pork Barbeque" }));
        RiceDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RiceDrinksActionPerformed(evt);
            }
        });
        RiceItems.add(RiceDrinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, 40));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("A la Carte");
        RiceItems.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        jLabel13.setBackground(new java.awt.Color(204, 102, 0));
        jLabel13.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel13.setText("Rice Meals with Beverage");
        RiceItems.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 50));

        jButton1.setText("Add");
        RiceItems.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        RiceDrinks1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chicken Fillet", "Beef Broccoli", "Lumpiang Shanghai", "Tempura", "Fish Fillet", "Honey Garlic Chicken", "Chicken Teriyaki", "Pork Barbeque" }));
        RiceDrinks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RiceDrinks1ActionPerformed(evt);
            }
        });
        RiceItems.add(RiceDrinks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 230, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chocolate Ganache Cake", "Chocolate Smores Cake", "Chocolate Caramel Cake", "Chocolate Oreo Cake", "Carrot Cake", "Red Velvet Cake" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        RiceItems.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 200, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lemon Iced Tea", "Cucumber", "Blue Lemonade", "Lychee" }));
        RiceItems.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 230, 40));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lemon Iced Tea", "Cucumber", "Blue Lemonade", "Lychee" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        RiceItems.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 200, 40));

        jButton2.setText("Add");
        RiceItems.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RiceItems, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RiceItems, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RiceDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RiceDrinksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RiceDrinksActionPerformed

    private void RiceDrinks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RiceDrinks1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RiceDrinks1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> RiceDrinks;
    private javax.swing.JComboBox<String> RiceDrinks1;
    private javax.swing.JPanel RiceItems;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    // End of variables declaration//GEN-END:variables
}