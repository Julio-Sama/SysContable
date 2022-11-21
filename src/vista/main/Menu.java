package vista.main;

import controlador.Controlador;
import java.awt.Color;
import javax.swing.JFrame;
import utilidades.CambiaPanel;
import vista.modulos.VistaHabitacion;


public class Menu extends javax.swing.JFrame {

    boolean menuActived = true;
    boolean despleg = true;
    
    public Menu() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    public void setControlador(Controlador control){

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
        java.awt.GridBagConstraints gridBagConstraints;

        aside = new javax.swing.JPanel();
        modulos = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnInicio = new newscomponents.RSButtonIcon_new();
        btnLibDiario = new newscomponents.RSButtonIcon_new();
        btnBalanceComprobacion = new newscomponents.RSButtonIcon_new();
        btnCatalogo = new newscomponents.RSButtonIcon_new();
        btnLibMayor = new newscomponents.RSButtonIcon_new();
        btbHabitacion = new newscomponents.RSButtonIcon_new();
        btnEstadoResultados = new newscomponents.RSButtonIcon_new();
        btnBalanceGeneral = new newscomponents.RSButtonIcon_new();
        btnCierre = new newscomponents.RSButtonIcon_new();
        header = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnMenu = new RSMaterialComponent.RSButtonIconOne();
        btnSalir = new RSMaterialComponent.RSButtonIconOne();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        aside.setBackground(new java.awt.Color(42, 53, 66));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 2);
        flowLayout1.setAlignOnBaseline(true);
        aside.setLayout(flowLayout1);

        modulos.setOpaque(false);
        modulos.setLayout(new java.awt.GridBagLayout());

        jLabel13.setBackground(new java.awt.Color(37, 46, 57));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MENÚ");
        jLabel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jLabel13.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 202;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 0);
        modulos.add(jLabel13, gridBagConstraints);

        btnInicio.setBackground(new java.awt.Color(241, 123, 55));
        btnInicio.setText("Inicio");
        btnInicio.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInicio.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        btnInicio.setSizeIcon(25.0F);
        btnInicio.setVerifyInputWhenFocusTarget(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        modulos.add(btnInicio, gridBagConstraints);

        btnLibDiario.setBackground(new java.awt.Color(51, 65, 80));
        btnLibDiario.setText("Libro diario");
        btnLibDiario.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnLibDiario.setFocusPainted(false);
        btnLibDiario.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnLibDiario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLibDiario.setIconTextGap(20);
        btnLibDiario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CHEVRON_RIGHT);
        btnLibDiario.setOpaque(true);
        btnLibDiario.setRequestFocusEnabled(false);
        btnLibDiario.setSizeIcon(18.0F);
        btnLibDiario.setVerifyInputWhenFocusTarget(false);
        btnLibDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibDiarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        modulos.add(btnLibDiario, gridBagConstraints);

        btnBalanceComprobacion.setBackground(new java.awt.Color(42, 53, 66));
        btnBalanceComprobacion.setText("Balance de comprobación");
        btnBalanceComprobacion.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnBalanceComprobacion.setFocusPainted(false);
        btnBalanceComprobacion.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnBalanceComprobacion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnBalanceComprobacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBalanceComprobacion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.TRENDING_UP);
        btnBalanceComprobacion.setSizeIcon(25.0F);
        btnBalanceComprobacion.setVerifyInputWhenFocusTarget(false);
        btnBalanceComprobacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceComprobacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        modulos.add(btnBalanceComprobacion, gridBagConstraints);

        btnCatalogo.setBackground(new java.awt.Color(42, 53, 66));
        btnCatalogo.setText("Catálogo");
        btnCatalogo.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnCatalogo.setFocusPainted(false);
        btnCatalogo.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnCatalogo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCatalogo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCatalogo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DESCRIPTION);
        btnCatalogo.setSizeIcon(25.0F);
        btnCatalogo.setVerifyInputWhenFocusTarget(false);
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        modulos.add(btnCatalogo, gridBagConstraints);

        btnLibMayor.setBackground(new java.awt.Color(51, 65, 80));
        btnLibMayor.setText("Libro mayor");
        btnLibMayor.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnLibMayor.setFocusPainted(false);
        btnLibMayor.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnLibMayor.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnLibMayor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLibMayor.setIconTextGap(20);
        btnLibMayor.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CHEVRON_RIGHT);
        btnLibMayor.setOpaque(true);
        btnLibMayor.setSizeIcon(18.0F);
        btnLibMayor.setVerifyInputWhenFocusTarget(false);
        btnLibMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibMayorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        modulos.add(btnLibMayor, gridBagConstraints);

        btbHabitacion.setBackground(new java.awt.Color(42, 53, 66));
        btbHabitacion.setText("Libros");
        btbHabitacion.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btbHabitacion.setFocusPainted(false);
        btbHabitacion.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btbHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btbHabitacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btbHabitacion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.BOOK);
        btbHabitacion.setOpaque(true);
        btbHabitacion.setSizeIcon(25.0F);
        btbHabitacion.setVerifyInputWhenFocusTarget(false);
        btbHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbHabitacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        modulos.add(btbHabitacion, gridBagConstraints);

        btnEstadoResultados.setBackground(new java.awt.Color(42, 53, 66));
        btnEstadoResultados.setText("Estado de resultados");
        btnEstadoResultados.setActionCommand("Kardex");
        btnEstadoResultados.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnEstadoResultados.setFocusPainted(false);
        btnEstadoResultados.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnEstadoResultados.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnEstadoResultados.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEstadoResultados.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DONUT_LARGE);
        btnEstadoResultados.setSizeIcon(25.0F);
        btnEstadoResultados.setVerifyInputWhenFocusTarget(false);
        btnEstadoResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoResultadosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        modulos.add(btnEstadoResultados, gridBagConstraints);

        btnBalanceGeneral.setBackground(new java.awt.Color(42, 53, 66));
        btnBalanceGeneral.setText("Balance general");
        btnBalanceGeneral.setActionCommand("Kardex");
        btnBalanceGeneral.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnBalanceGeneral.setFocusPainted(false);
        btnBalanceGeneral.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnBalanceGeneral.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnBalanceGeneral.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBalanceGeneral.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LINEAR_SCALE);
        btnBalanceGeneral.setSizeIcon(25.0F);
        btnBalanceGeneral.setVerifyInputWhenFocusTarget(false);
        btnBalanceGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceGeneralActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        modulos.add(btnBalanceGeneral, gridBagConstraints);

        btnCierre.setBackground(new java.awt.Color(42, 53, 66));
        btnCierre.setText("Cierre contable");
        btnCierre.setActionCommand("Kardex");
        btnCierre.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnCierre.setFocusPainted(false);
        btnCierre.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnCierre.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCierre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCierre.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR_ALL);
        btnCierre.setSizeIcon(25.0F);
        btnCierre.setVerifyInputWhenFocusTarget(false);
        btnCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        modulos.add(btnCierre, gridBagConstraints);

        aside.add(modulos);

        getContentPane().add(aside, java.awt.BorderLayout.LINE_START);

        header.setBackground(new java.awt.Color(61, 137, 248));
        header.setLayout(new java.awt.GridBagLayout());

        jLabel10.setBackground(new java.awt.Color(61, 137, 248));
        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sistema de Contabilidad | Panel de Control");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.weightx = 10.0;
        header.add(jLabel10, gridBagConstraints);

        btnMenu.setBackground(new java.awt.Color(61, 137, 248));
        btnMenu.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnMenu.setFocusPainted(false);
        btnMenu.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MENU);
        btnMenu.setSizeIcon(25.0F);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        header.add(btnMenu, gridBagConstraints);

        btnSalir.setBackground(new java.awt.Color(255, 67, 67));
        btnSalir.setBackgroundHover(new java.awt.Color(255, 67, 67));
        btnSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        btnSalir.setSizeIcon(30.0F);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        header.add(btnSalir, gridBagConstraints);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        body.setBackground(new java.awt.Color(236, 240, 245));
        body.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        body.setForeground(new java.awt.Color(204, 204, 204));
        body.setLayout(new javax.swing.BoxLayout(body, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(body, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        if(menuActived == true){
            menuActived = false;
            this.aside.setVisible(false);
        }else{
            menuActived = true;
            this.aside.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnLibDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibDiarioActionPerformed
        resetMenu();
        this.btnLibDiario.setBackground(new Color(241,123,55));
        new CambiaPanel(this.body, new VistaHabitacion());
    }//GEN-LAST:event_btnLibDiarioActionPerformed

    public void resetMenu(){
        this.btnInicio.setBackground(new Color(42,53,66));
        this.btnBalanceComprobacion.setBackground(new Color(42,53,66));
        
        /* Desplegables */
        this.btnLibMayor.setBackground(new Color(51,65,80));
        this.btnLibDiario.setBackground(new Color(51,65,80));
        
        this.btnCatalogo.setBackground(new Color(42,53,66));
        this.btnEstadoResultados.setBackground(new Color(42,53,66));
        this.btnBalanceGeneral.setBackground(new Color(42,53,66));
        this.btnCierre.setBackground(new Color(42,53,66));
    }
    
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        resetMenu();
        this.btnInicio.setBackground(new Color(241,123,55));
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnBalanceComprobacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceComprobacionActionPerformed
        resetMenu();
        this.btnBalanceComprobacion.setBackground(new Color(241,123,55));
    }//GEN-LAST:event_btnBalanceComprobacionActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        resetMenu();
        this.btnCatalogo.setBackground(new Color(241,123,55));
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void btnLibMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibMayorActionPerformed
        resetMenu();
        this.btnLibMayor.setBackground(new Color(241,123,55));
    }//GEN-LAST:event_btnLibMayorActionPerformed

    private void btbHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbHabitacionActionPerformed
        if(despleg != true){
            this.btnLibMayor.setVisible(true);
            this.btnLibDiario.setVisible(true);
            despleg = true;
        }else{
            this.btnLibMayor.setVisible(false);
            this.btnLibDiario.setVisible(false);
            despleg = false;
        }
        
    }//GEN-LAST:event_btbHabitacionActionPerformed

    private void btnEstadoResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoResultadosActionPerformed
        resetMenu();
        this.btnEstadoResultados.setBackground(new Color(241,123,55));
    }//GEN-LAST:event_btnEstadoResultadosActionPerformed

    private void btnBalanceGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceGeneralActionPerformed
        resetMenu();
        this.btnBalanceGeneral.setBackground(new Color(241,123,55));
    }//GEN-LAST:event_btnBalanceGeneralActionPerformed

    private void btnCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierreActionPerformed
        resetMenu();
        this.btnCierre.setBackground(new Color(241,123,55));
    }//GEN-LAST:event_btnCierreActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel aside;
    public javax.swing.JPanel body;
    public newscomponents.RSButtonIcon_new btbHabitacion;
    public newscomponents.RSButtonIcon_new btnBalanceComprobacion;
    public newscomponents.RSButtonIcon_new btnBalanceGeneral;
    public newscomponents.RSButtonIcon_new btnCatalogo;
    public newscomponents.RSButtonIcon_new btnCierre;
    public newscomponents.RSButtonIcon_new btnEstadoResultados;
    public newscomponents.RSButtonIcon_new btnInicio;
    private newscomponents.RSButtonIcon_new btnLibDiario;
    private newscomponents.RSButtonIcon_new btnLibMayor;
    private RSMaterialComponent.RSButtonIconOne btnMenu;
    public RSMaterialComponent.RSButtonIconOne btnSalir;
    public javax.swing.JPanel header;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    public javax.swing.JPanel modulos;
    // End of variables declaration//GEN-END:variables
}