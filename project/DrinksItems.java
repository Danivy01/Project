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
public class DrinksItems extends javax.swing.JInternalFrame {

    /**
     * Creates new form CakesItems
     */
    public DrinksItems() {
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

        DrinksItems = new javax.swing.JPanel();
        LemonIcedTea = new javax.swing.JButton();
        Cucumber = new javax.swing.JButton();
        BlueLemonade = new javax.swing.JButton();
        Lychee = new javax.swing.JButton();
        Sola = new javax.swing.JButton();
        RootBeer = new javax.swing.JButton();
        CanadaDry = new javax.swing.JButton();
        BottledWater = new javax.swing.JButton();
        Soda = new javax.swing.JButton();
        FreshMilk = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        DrinksItems.setBackground(new java.awt.Color(255, 204, 153));
        DrinksItems.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LemonIcedTea.setText("Lemon Iced Tea");
        LemonIcedTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LemonIcedTeaActionPerformed(evt);
            }
        });
        DrinksItems.add(LemonIcedTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 160, 40));

        Cucumber.setText("Cucumber");
        Cucumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CucumberActionPerformed(evt);
            }
        });
        DrinksItems.add(Cucumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 160, 40));

        BlueLemonade.setText("Blue Lemonade");
        BlueLemonade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueLemonadeActionPerformed(evt);
            }
        });
        DrinksItems.add(BlueLemonade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 160, 40));

        Lychee.setText("Lychee");
        Lychee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LycheeActionPerformed(evt);
            }
        });
        DrinksItems.add(Lychee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 160, 40));

        Sola.setText("Sola");
        Sola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolaActionPerformed(evt);
            }
        });
        DrinksItems.add(Sola, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 160, 40));

        RootBeer.setText("Root Beer");
        RootBeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RootBeerActionPerformed(evt);
            }
        });
        DrinksItems.add(RootBeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 160, 40));

        CanadaDry.setText("Canada Dry");
        CanadaDry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanadaDryActionPerformed(evt);
            }
        });
        DrinksItems.add(CanadaDry, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 160, 40));

        BottledWater.setText("Bottled Water");
        BottledWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottledWaterActionPerformed(evt);
            }
        });
        DrinksItems.add(BottledWater, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 160, 40));

        Soda.setText("Soda");
        Soda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SodaActionPerformed(evt);
            }
        });
        DrinksItems.add(Soda, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 160, 40));

        FreshMilk.setText("Fresh Milk");
        FreshMilk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FreshMilkActionPerformed(evt);
            }
        });
        DrinksItems.add(FreshMilk, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DrinksItems, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DrinksItems, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LemonIcedTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LemonIcedTeaActionPerformed
        double PriceofItem = 35.00;
        String NameofItem = "Lemon Iced Tea";
        
        Menu.OrderName.setText(NameofItem);
        Menu.Price.setText(Double.toString(PriceofItem));
    }//GEN-LAST:event_LemonIcedTeaActionPerformed

    private void CucumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CucumberActionPerformed
        double PriceofItem = 35.00;
        String NameofItem = "Cucumber";
        
        Menu.OrderName.setText(NameofItem);
        Menu.Price.setText(Double.toString(PriceofItem));
    }//GEN-LAST:event_CucumberActionPerformed

    private void BlueLemonadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueLemonadeActionPerformed
        double PriceofItem = 35.00;
        String NameofItem = "Blue Lemonade";
        
        Menu.OrderName.setText(NameofItem);
        Menu.Price.setText(Double.toString(PriceofItem));
    }//GEN-LAST:event_BlueLemonadeActionPerformed

    private void LycheeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LycheeActionPerformed
        double PriceofItem = 35.00;
        String NameofItem = "Lychee";
        
        Menu.OrderName.setText(NameofItem);
        Menu.Price.setText(Double.toString(PriceofItem));
    }//GEN-LAST:event_LycheeActionPerformed

    private void SolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolaActionPerformed
        double PriceofItem = 60.00;
        String NameofItem = "Sola";
        
        Menu.OrderName.setText(NameofItem);
        Menu.Price.setText(Double.toString(PriceofItem));
    }//GEN-LAST:event_SolaActionPerformed

    private void RootBeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RootBeerActionPerformed
        double PriceofItem = 50.00;
        String NameofItem = "Root Beer";
        
        Menu.OrderName.setText(NameofItem);
        Menu.Price.setText(Double.toString(PriceofItem));
    }//GEN-LAST:event_RootBeerActionPerformed

    private void CanadaDryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanadaDryActionPerformed
        double PriceofItem = 50.00;
        String NameofItem = "Canada Dry";
        
        Menu.OrderName.setText(NameofItem);
        Menu.Price.setText(Double.toString(PriceofItem));
    }//GEN-LAST:event_CanadaDryActionPerformed

    private void FreshMilkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FreshMilkActionPerformed
        double PriceofItem = 45.00;
        String NameofItem = "Fresh Milk";
        
        Menu.OrderName.setText(NameofItem);
        Menu.Price.setText(Double.toString(PriceofItem));
    }//GEN-LAST:event_FreshMilkActionPerformed

    private void SodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SodaActionPerformed
        double PriceofItem = 50.00;
        String NameofItem = "Soda";
        
        Menu.OrderName.setText(NameofItem);
        Menu.Price.setText(Double.toString(PriceofItem));
    }//GEN-LAST:event_SodaActionPerformed

    private void BottledWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottledWaterActionPerformed
        double PriceofItem = 30.00;
        String NameofItem = "Bottled Water";
        
        Menu.OrderName.setText(NameofItem);
        Menu.Price.setText(Double.toString(PriceofItem));
    }//GEN-LAST:event_BottledWaterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BlueLemonade;
    private javax.swing.JButton BottledWater;
    private javax.swing.JButton CanadaDry;
    private javax.swing.JButton Cucumber;
    private javax.swing.JPanel DrinksItems;
    private javax.swing.JButton FreshMilk;
    private javax.swing.JButton LemonIcedTea;
    private javax.swing.JButton Lychee;
    private javax.swing.JButton RootBeer;
    private javax.swing.JButton Soda;
    private javax.swing.JButton Sola;
    // End of variables declaration//GEN-END:variables
}
