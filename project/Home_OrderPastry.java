/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pastry.project;

import AppPackage.AnimationClass;

/**
 *
 * @author Yvette Rimas
 */
public class Home_OrderPastry extends javax.swing.JFrame {
    
    AnimationClass ac = new AnimationClass();

    /**
     * Creates new form Home_OrderPastry
     */
    public Home_OrderPastry() {
        initComponents();
        Slideshow();
    }
    
    public void Slideshow(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                
                int nb = 0;
                try{
                    while(true){
                        switch(nb){
                            case 0:
                                Thread.sleep(2500);
                                ac.jLabelXLeft(0, -500, 12, 10, img1);
                                ac.jLabelXLeft(500, 0, 12, 10, img2);
                                ac.jLabelXLeft(1000, 500, 12, 10, img3);
                                ac.jLabelXLeft(1500, 1000, 12, 10, img4);
                                ac.jLabelXLeft(2000, 1500, 12, 10, img5);
                                nb++;
                            
                            case 1:
                                Thread.sleep(2500);
                                ac.jLabelXLeft(-500, -1000, 12, 10, img1);
                                ac.jLabelXLeft(0, -500, 12, 10, img2);
                                ac.jLabelXLeft(500, 0, 12, 10, img3);
                                ac.jLabelXLeft(1000, 500, 12, 10, img4);
                                ac.jLabelXLeft(1500, 1000, 12, 10, img5);
                                nb++;
                                
                            case 2:
                                Thread.sleep(2500);
                                ac.jLabelXLeft(-1000, -1500, 12, 10, img1);
                                ac.jLabelXLeft(-500, -1000, 12, 10, img2);
                                ac.jLabelXLeft(0, -500, 12, 10, img3);
                                ac.jLabelXLeft(500, 0, 12, 10, img4);
                                ac.jLabelXLeft(1000, 500, 12, 10, img5);
                                nb++;
                                
                            case 3:
                                Thread.sleep(2500);
                                ac.jLabelXLeft(-1500, -2000, 12, 10, img1);
                                ac.jLabelXLeft(-1000, -1500, 12, 10, img2);
                                ac.jLabelXLeft(-500, -1000, 12, 10, img3);
                                ac.jLabelXLeft(0, -500, 12, 10, img4);
                                ac.jLabelXLeft(500, 0, 12, 10, img5);
                                nb++;
                                
                            case 4:
                                Thread.sleep(2500);
                                ac.jLabelXRight(-2000, -1500, 12, 10, img1);
                                ac.jLabelXRight(-1500, -1000, 12, 10, img2);
                                ac.jLabelXRight(-1000, -500, 12, 10, img3);
                                ac.jLabelXRight(-500, 0, 12, 10, img4);
                                ac.jLabelXRight(0, 500, 12, 10, img5);
                                nb++;
                            
                            case 5:
                                Thread.sleep(2500);
                                ac.jLabelXRight(-1500, -1000, 12, 10, img1);
                                ac.jLabelXRight(-1000, -500, 12, 10, img2);
                                ac.jLabelXRight(-500, 0, 12, 10, img3);
                                ac.jLabelXRight(0, 500, 12, 10, img4);
                                ac.jLabelXRight(500, 1000, 12, 10, img5);
                                nb++;
                            
                            case 6:
                                Thread.sleep(2500);
                                ac.jLabelXRight(-1000, -500, 12, 10, img1);
                                ac.jLabelXRight(-500, 0, 12, 10, img2);
                                ac.jLabelXRight(0, 500, 12, 10, img3);
                                ac.jLabelXRight(500, 1000, 12, 10, img4);
                                ac.jLabelXRight(1000, 1500, 12, 10, img5);
                                nb++;
                                
                            case 7:
                                Thread.sleep(2500);
                                ac.jLabelXRight(-500, 0, 12, 10, img1);
                                ac.jLabelXRight(0, 500, 12, 10, img2);
                                ac.jLabelXRight(500, 1000, 12, 10, img3);
                                ac.jLabelXRight(1000, 1500, 12, 10, img4);
                                ac.jLabelXRight(500, 2000, 12, 10, img5);
                                nb = 0;
                        }
                    }
                }catch (Exception ex){
                    
                }
                
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        left = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        right.setBackground(new java.awt.Color(255, 255, 255));
        right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left.setBackground(new java.awt.Color(255, 204, 153));
        left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Slideshow 1.png"))); // NOI18N
        left.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Slideshow 2.png"))); // NOI18N
        left.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 600));

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Slideshow 3.png"))); // NOI18N
        left.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 500, 600));

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Slideshow 4.png"))); // NOI18N
        left.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 0, 500, 600));

        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Slideshow 5.png"))); // NOI18N
        left.add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 500, 600));

        right.add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 0, 500, 600));
        left.getAccessibleContext().setAccessibleParent(container);

        jLabel2.setBackground(new java.awt.Color(255, 204, 153));
        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Proceed to Menu >>");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        right.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 760, 260, 80));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        right.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 0, 20, 25));

        jLabel1.setBackground(new java.awt.Color(255, 204, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home BG.png"))); // NOI18N
        right.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        container.add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 865));

        getContentPane().add(container, "card2");

        setBounds(0, 0, 1540, 865);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Home_OrderPastry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_OrderPastry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_OrderPastry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_OrderPastry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_OrderPastry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel left;
    private javax.swing.JPanel right;
    // End of variables declaration//GEN-END:variables
}
