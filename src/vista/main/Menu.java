/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.main;

import controlador.Controlador;
import rojeru_san.complementos.RSEffectFade;
import rojeru_san.complementos.RSMoveWindow;
import rojeru_san.complementos.RSUtilities;

/**
 *
 * @author Adonay
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Menu() {
        initComponents();
        setTitle("Sistema de contabilidad | Universidad de El Salvador");
        RSEffectFade.setFadeWindowIn(this, 20, 0.1f);
        RSUtilities.setCenterWindow(this);
        RSUtilities.setOpaqueWindow(this, false);
        new RSMoveWindow().setMoveWindow(this);
        
        /* Setteamos el identificador de los botones */
        this.btnInicio.setActionCommand("btnInicio");
        this.btnLibros.setActionCommand("btnLibros");
    }
    
    public void setControlador(Controlador control){
        this.btnInicio.addActionListener(control);
        this.btnLibros.addActionListener(control);
    }
    
    public void iniciar(){
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelMaterial1 = new RSMaterialComponent.RSPanelMaterial();
        jLabel4 = new javax.swing.JLabel();
        rSPanelBorder1 = new RSMaterialComponent.RSPanelBorder();
        pnlCambia = new newscomponents.RSPanelEffect();
        btnInicio = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnLibros = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnCopia = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnBaul = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnAbout = new RSMaterialComponent.RSButtonMaterialIconOne();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rSPanelMaterial1.setBackground(new java.awt.Color(0, 102, 255));
        rSPanelMaterial1.setIntensity(10);
        rSPanelMaterial1.setRound(10);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SysContable");

        rSPanelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelBorder1.setBgBorder(new java.awt.Color(37, 45, 223));
        rSPanelBorder1.setBorderBottom(false);
        rSPanelBorder1.setBorderLeft(false);
        rSPanelBorder1.setBorderRight(false);
        rSPanelBorder1.setBorderTop(false);
        rSPanelBorder1.setRound(10);

        pnlCambia.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout rSPanelBorder1Layout = new javax.swing.GroupLayout(rSPanelBorder1);
        rSPanelBorder1.setLayout(rSPanelBorder1Layout);
        rSPanelBorder1Layout.setHorizontalGroup(
            rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCambia, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                .addContainerGap())
        );
        rSPanelBorder1Layout.setVerticalGroup(
            rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCambia, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnInicio.setBackground(new java.awt.Color(0, 102, 255));
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setText("  Inicio");
        btnInicio.setBackgroundHover(new java.awt.Color(248, 248, 248));
        btnInicio.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnInicio.setForegroundHover(new java.awt.Color(0, 0, 0));
        btnInicio.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        btnInicio.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        btnInicio.setPaddingLeft(10);
        btnInicio.setRippleColor(new java.awt.Color(26, 117, 255));
        btnInicio.setSelected(true);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnLibros.setBackground(new java.awt.Color(0, 102, 255));
        btnLibros.setForeground(new java.awt.Color(0, 0, 0));
        btnLibros.setText("  Libros");
        btnLibros.setToolTipText("");
        btnLibros.setBackgroundHover(new java.awt.Color(248, 248, 248));
        btnLibros.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnLibros.setForegroundHover(new java.awt.Color(0, 0, 0));
        btnLibros.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        btnLibros.setIconTextGap(5);
        btnLibros.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.BOOK);
        btnLibros.setName("scan"); // NOI18N
        btnLibros.setPaddingLeft(10);
        btnLibros.setRippleColor(new java.awt.Color(26, 117, 255));
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });

        btnCopia.setBackground(new java.awt.Color(0, 102, 255));
        btnCopia.setForeground(new java.awt.Color(0, 0, 0));
        btnCopia.setText("  Estado de resultados");
        btnCopia.setBackgroundHover(new java.awt.Color(248, 248, 248));
        btnCopia.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnCopia.setForegroundHover(new java.awt.Color(0, 0, 0));
        btnCopia.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        btnCopia.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MONETIZATION_ON);
        btnCopia.setName("copia"); // NOI18N
        btnCopia.setPaddingLeft(10);
        btnCopia.setRippleColor(new java.awt.Color(26, 117, 255));
        btnCopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiaActionPerformed(evt);
            }
        });

        btnBaul.setBackground(new java.awt.Color(0, 102, 255));
        btnBaul.setForeground(new java.awt.Color(0, 0, 0));
        btnBaul.setText("  Balance general");
        btnBaul.setBackgroundHover(new java.awt.Color(248, 248, 248));
        btnBaul.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnBaul.setForegroundHover(new java.awt.Color(0, 0, 0));
        btnBaul.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        btnBaul.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_BALANCE);
        btnBaul.setPaddingLeft(10);
        btnBaul.setRippleColor(new java.awt.Color(26, 117, 255));
        btnBaul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaulActionPerformed(evt);
            }
        });

        btnAbout.setBackground(new java.awt.Color(0, 102, 255));
        btnAbout.setForeground(new java.awt.Color(0, 0, 0));
        btnAbout.setText("  Cierre del período");
        btnAbout.setBackgroundHover(new java.awt.Color(248, 248, 248));
        btnAbout.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnAbout.setForegroundHover(new java.awt.Color(0, 0, 0));
        btnAbout.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        btnAbout.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.OFFLINE_PIN);
        btnAbout.setPaddingLeft(10);
        btnAbout.setRippleColor(new java.awt.Color(26, 117, 255));
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("© Universidad de El Salvador 2022");

        javax.swing.GroupLayout rSPanelMaterial1Layout = new javax.swing.GroupLayout(rSPanelMaterial1);
        rSPanelMaterial1.setLayout(rSPanelMaterial1Layout);
        rSPanelMaterial1Layout.setHorizontalGroup(
            rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBaul, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(rSPanelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        rSPanelMaterial1Layout.setVerticalGroup(
            rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelMaterial1Layout.createSequentialGroup()
                .addGroup(rSPanelMaterial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)
                        .addGap(55, 55, 55)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBaul, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14))
                    .addGroup(rSPanelMaterial1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rSPanelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelMaterial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelMaterial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        if (!btnAbout.isSelected()) {
            btnInicio.setSelected(false);
            btnLibros.setSelected(false);
            btnCopia.setSelected(false);
            btnBaul.setSelected(false);
            btnAbout.setSelected(true);
        }
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnBaulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaulActionPerformed
        if (!btnBaul.isSelected()) {
            btnInicio.setSelected(false);
            btnLibros.setSelected(false);
            btnCopia.setSelected(false);
            btnBaul.setSelected(true);
            btnAbout.setSelected(false);
        }
    }//GEN-LAST:event_btnBaulActionPerformed

    private void btnCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiaActionPerformed
        if (!btnCopia.isSelected()) {
            btnInicio.setSelected(false);
            btnLibros.setSelected(false);
            btnCopia.setSelected(true);
            btnBaul.setSelected(false);
            btnAbout.setSelected(false);
        }
    }//GEN-LAST:event_btnCopiaActionPerformed

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        if (!btnLibros.isSelected()) {
            btnInicio.setSelected(false);
            btnLibros.setSelected(true);
            btnCopia.setSelected(false);
            btnBaul.setSelected(false);
            btnAbout.setSelected(false);
        }
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        if (!btnInicio.isSelected()) {
            btnInicio.setSelected(true);
            btnLibros.setSelected(false);
            btnCopia.setSelected(false);
            btnBaul.setSelected(false);
            btnAbout.setSelected(false);
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne btnAbout;
    public static RSMaterialComponent.RSButtonMaterialIconOne btnBaul;
    private RSMaterialComponent.RSButtonMaterialIconOne btnCopia;
    public RSMaterialComponent.RSButtonMaterialIconOne btnInicio;
    public RSMaterialComponent.RSButtonMaterialIconOne btnLibros;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public newscomponents.RSPanelEffect pnlCambia;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder1;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial1;
    // End of variables declaration//GEN-END:variables
}
