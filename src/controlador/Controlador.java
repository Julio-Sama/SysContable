/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.dao.CuentaDao;
import modelo.entidades.Cuenta;
import utilidades.CambiaPanel;
import utilidades.ImgTabla;
import vista.main.Menu;
import vista.modulos.ModalDiarioAgregarCuenta;
import vista.modulos.VistaLibroDiario;

/**
 *
 * @author Adonay
 */
public class Controlador implements ActionListener, MouseListener{
    private Menu menu;
    
    /* Libro diario */
    private VistaLibroDiario moduloLibroDiario;
    private ModalDiarioAgregarCuenta modalDiarioAgregarCuenta;
    private CuentaDao daoCuenta;
    
    public Controlador(Menu menu) {
        this.menu = menu;
        this.menu.setControlador(this);
        this.menu.iniciar();
    }
    
    public void mostrarCuentasDiario() throws SQLException{
        this.daoCuenta = new CuentaDao();
        DefaultTableCellRenderer diseñoTabla = (DefaultTableCellRenderer) this.modalDiarioAgregarCuenta.tablaCuentas.getCellRenderer(0, 0);
        DefaultTableModel modelo = (DefaultTableModel) this.modalDiarioAgregarCuenta.tablaCuentas.getModel();
        modelo.setRowCount(0);
        
        this.modalDiarioAgregarCuenta.tablaCuentas.setDefaultRenderer(Object.class, new ImgTabla());
        
        this.modalDiarioAgregarCuenta.tablaCuentas.getColumnModel().getColumn(0).setCellRenderer(diseñoTabla); /* Mantener diseño de la tabla por columnas */
        this.modalDiarioAgregarCuenta.tablaCuentas.getColumnModel().getColumn(1).setCellRenderer(diseñoTabla);
        
        for(Cuenta x : this.daoCuenta.selectAll()){
            ImageIcon img_agregar = new ImageIcon(getClass().getResource("/img/add.png"));
            JLabel lbImg_agregar = new JLabel(new ImageIcon(img_agregar.getImage()));
            
            modelo.addRow(new Object[]{x.getCod_cuenta(), x.getNom_cuenta(), lbImg_agregar});
        }
        
        this.modalDiarioAgregarCuenta.tablaCuentas.setModel(modelo);
    }

    @Override
    public void actionPerformed(ActionEvent modulo) {
        /* Cambiar de módulo */        
        if(modulo.getActionCommand().equals("libroDiario")){
            this.moduloLibroDiario = new VistaLibroDiario();
            this.moduloLibroDiario.setControlador(this);
            new CambiaPanel(this.menu.body, moduloLibroDiario);
        }
        
        /* Abrir modal */
        if(modulo.getActionCommand().equals("libroDiario_buscarCuenta")){
            this.modalDiarioAgregarCuenta = new ModalDiarioAgregarCuenta(new JFrame(), true);
            this.modalDiarioAgregarCuenta.setControlador(this);
            try {
                mostrarCuentasDiario();
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.modalDiarioAgregarCuenta.iniciar();
        }
    }

    @Override
    public void mousePressed(MouseEvent componente) {
        if(componente.getSource().equals(this.modalDiarioAgregarCuenta.tablaCuentas)){
            int columna = this.modalDiarioAgregarCuenta.tablaCuentas.getSelectedColumn();
        
            if(columna == 2){
                int fila = this.modalDiarioAgregarCuenta.tablaCuentas.getSelectedRow();
                String cod_cuenta = this.modalDiarioAgregarCuenta.tablaCuentas.getValueAt(fila, 0).toString();
                String nom_cuenta = this.modalDiarioAgregarCuenta.tablaCuentas.getValueAt(fila, 1).toString();
                
                this.moduloLibroDiario.labelCodCuenta.setText(cod_cuenta);
                this.moduloLibroDiario.labelNomCuenta.setText(nom_cuenta);
                this.modalDiarioAgregarCuenta.dispose();
                this.modalDiarioAgregarCuenta = null;
            }
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

}
