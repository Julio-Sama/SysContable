package vista.modulos;

import controlador.Controlador;
import java.sql.SQLException;

public class ModalDiarioAgregarCuenta extends javax.swing.JDialog {
    
    public ModalDiarioAgregarCuenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void setControlador(Controlador control){
        this.tablaCuentas.addMouseListener(control);
    }
    
    public void iniciar(){
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        inputBusquedaCuenta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCuentas = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        form.setBackground(new java.awt.Color(255, 255, 255));

        header.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        header.setForeground(new java.awt.Color(51, 51, 51));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Listado de cuentas");
        header.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        body.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Buscar:");

        inputBusquedaCuenta.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        inputBusquedaCuenta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        inputBusquedaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBusquedaCuentaActionPerformed(evt);
            }
        });
        inputBusquedaCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputBusquedaCuentaKeyTyped(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setOpaque(false);

        tablaCuentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        tablaCuentas.setForeground(new java.awt.Color(255, 255, 255));
        tablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Agregar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCuentas.setAltoHead(30);
        tablaCuentas.setColorBackgoundHead(new java.awt.Color(249, 249, 249));
        tablaCuentas.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tablaCuentas.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablaCuentas.setColorFilasBackgound2(new java.awt.Color(249, 249, 249));
        tablaCuentas.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablaCuentas.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tablaCuentas.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        tablaCuentas.setColorSelBackgound(new java.awt.Color(240, 240, 240));
        tablaCuentas.setColorSelForeground(new java.awt.Color(51, 51, 51));
        tablaCuentas.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaCuentas.setFuenteFilas(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaCuentas.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaCuentas.setFuenteHead(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tablaCuentas.setGridColor(new java.awt.Color(255, 255, 255));
        tablaCuentas.setGrosorBordeFilas(0);
        tablaCuentas.setGrosorBordeHead(0);
        tablaCuentas.setMultipleSeleccion(false);
        tablaCuentas.setRowHeight(40);
        tablaCuentas.getTableHeader().setResizingAllowed(false);
        tablaCuentas.getTableHeader().setReorderingAllowed(false);
        tablaCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaCuentasMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCuentas);
        if (tablaCuentas.getColumnModel().getColumnCount() > 0) {
            tablaCuentas.getColumnModel().getColumn(1).setResizable(false);
            tablaCuentas.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputBusquedaCuenta)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBusquedaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(584, 584, 584))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputBusquedaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBusquedaCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBusquedaCuentaActionPerformed

    private void inputBusquedaCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBusquedaCuentaKeyTyped

    }//GEN-LAST:event_inputBusquedaCuentaKeyTyped

    private void tablaCuentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCuentasMousePressed
       
    }//GEN-LAST:event_tablaCuentasMousePressed

    
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
//            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ModalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        
//        
//        
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ModalUsuario dialog = new ModalUsuario(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel body;
    public javax.swing.JPanel form;
    public javax.swing.JLabel header;
    public javax.swing.JTextField inputBusquedaCuenta;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    public rojerusan.RSTableMetro tablaCuentas;
    // End of variables declaration//GEN-END:variables
}
