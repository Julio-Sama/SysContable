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
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.dao.CuentaDao;
import modelo.entidades.Cuenta;
import modelo.entidades.CuentaTransaccion;
import utilidades.CambiaPanel;
import utilidades.ImgTabla;
import vista.main.Menu;
import vista.modulos.DialogCuentasLibroDiario;
import vista.modulos.DialogReporteLibroDiario;
import vista.modulos.PnlInicio;
import vista.modulos.PnlLibroDiario;
import vista.modulos.PnlLibros;

/**
 *
 * @author Adonay
 */
public class Controlador implements ActionListener, MouseListener{
    ////////////////////////////////////////////////////
    private final Menu menu;
    
    /* Declaración de objetos Módulos */
    private PnlInicio panelInicio;
    private PnlLibros panelLibros;
    private PnlLibroDiario panelLibroDiario;
    /* Fin declaración de objetos Módulos */
    
    /* Declaración de objetos Modals */
    private DialogReporteLibroDiario dialogReporteLibroDiario;
    private DialogCuentasLibroDiario dialogCuentasLibroDiario;
    /* Fin declaración de objetos Modals */
    
    /* Declaración de objetos DAOs */
    private final CuentaDao daoCuenta = new CuentaDao();
    /* Fin declaración de objetos DAOs */
    
    /* Declaración de objetos seleccionados */
    private Cuenta cuentaSeleccionada = null;
    /*Fin declaración de objetos seleccionados*/
    
    /* Declaración de objetos clases */
    private CuentaTransaccion cuentaTransaccion = null;
    /* Fin declaración de objetos clases */
    
    /* Declaración de ArrayList */
    private final ArrayList<CuentaTransaccion> listaCuentaTransaccion = new ArrayList();
    /* Declaración de ArrayList */
    ////////////////////////////////////////////////////
    
    
    public Controlador(Menu menu) {
        this.menu = menu;
        this.menu.setControlador(this);
        new CambiaPanel(this.menu.pnlCambia, new PnlInicio());
        this.menu.iniciar();
    }
    
    /* Método para cambiar de módulo */
    public void cambiarModulo(String boton){
        /* Casos para cambiar de modulo */
        switch (boton) {
            case "moduloInicio":
                this.panelInicio = new PnlInicio(); /* Se asigna espacio en memoria */
                new CambiaPanel(this.menu.pnlCambia, this.panelInicio); /* Llamar a la clase 'CambiaPanel' para mostrar el módulo o vista*/
                break;
            case "moduloLibros":
                this.panelLibros = new PnlLibros();
                this.panelLibros.setControlador(this); /* Setteamos el controlador para poder manejar los eventos de botones */
                new CambiaPanel(this.menu.pnlCambia, this.panelLibros);
                break;
            case "moduloLibroDiario":
                this.panelLibroDiario = new PnlLibroDiario();
                this.panelLibroDiario.setControlador(this);
                new CambiaPanel(this.menu.pnlCambia, this.panelLibroDiario);
                break;
            default:
                break;
        }
        
        /* Condiciones para mostrar modals (JDialog) */
        if(boton.equals("dialogReporteLibroDiario")){
            this.dialogReporteLibroDiario = new DialogReporteLibroDiario(new JFrame(), true);
            //this.dialogReporteLibroDiario.setControlador(this);
            this.dialogReporteLibroDiario.setVisible(true);
        }else if(boton.equals("dialogBuscarCuentaLibroDiario")){
            this.dialogCuentasLibroDiario = new DialogCuentasLibroDiario(new JFrame(), true);
            mostrarCuentasLibroDiario(); /* Antes de mostrar dialogo se cargan las cuentas en la tabla */
            this.dialogCuentasLibroDiario.setControlador(this);
            this.dialogCuentasLibroDiario.setVisible(true);
        }
    }
    
    ////////////////////////////////////////////////////
    /* Métodos para mostrar datos en tablas */
    public void mostrarCuentasLibroDiario(){
        DefaultTableCellRenderer diseño = (DefaultTableCellRenderer) this.dialogCuentasLibroDiario.tablaCuentasLibroDiario.getCellRenderer(0, 0); /* Se obtiene el diseño de la tabla*/
       
        DefaultTableModel modelo = (DefaultTableModel)this.dialogCuentasLibroDiario.tablaCuentasLibroDiario.getModel();
        modelo.setRowCount(0);
        
        this.dialogCuentasLibroDiario.tablaCuentasLibroDiario.setDefaultRenderer(Object.class, new ImgTabla()); /* Se renderiza la tabla para poder poner la imagen */
        this.dialogCuentasLibroDiario.tablaCuentasLibroDiario.getColumnModel().getColumn(0).setCellRenderer(diseño); /* Se settea el diseño para las columnas 0 y 1 */
        this.dialogCuentasLibroDiario.tablaCuentasLibroDiario.getColumnModel().getColumn(1).setCellRenderer(diseño);
        
        try {
            for(Cuenta x : this.daoCuenta.selectAll()){
                ImageIcon img_agregar = new ImageIcon(getClass().getResource("/img/agregar.png"));
                JLabel lbImg_agregar = new JLabel(new ImageIcon(img_agregar.getImage()));
                
                modelo.addRow(new Object[]{x.getCod_cuenta(), x.getNom_cuenta(), lbImg_agregar});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        this.dialogCuentasLibroDiario.tablaCuentasLibroDiario.setModel(modelo);
    }
    
    public void mostrarCuentaTransaccionLibroDiario(){
        DefaultTableCellRenderer diseño = (DefaultTableCellRenderer) this.panelLibroDiario.tablaCuentaTransaccion.getCellRenderer(0, 0);
        DefaultTableModel modelo = (DefaultTableModel)this.panelLibroDiario.tablaCuentaTransaccion.getModel();
        modelo.setRowCount(0);
        
        this.panelLibroDiario.tablaCuentaTransaccion.setDefaultRenderer(Object.class, new ImgTabla());
        this.panelLibroDiario.tablaCuentaTransaccion.getColumnModel().getColumn(0).setCellRenderer(diseño);
        this.panelLibroDiario.tablaCuentaTransaccion.getColumnModel().getColumn(1).setCellRenderer(diseño);
        this.panelLibroDiario.tablaCuentaTransaccion.getColumnModel().getColumn(2).setCellRenderer(diseño);
        this.panelLibroDiario.tablaCuentaTransaccion.getColumnModel().getColumn(3).setCellRenderer(diseño);
        
        double totalDebe = 0;
        double totalHaber = 0;
        
        for(CuentaTransaccion x : this.listaCuentaTransaccion){
            ImageIcon img_eliminar = new ImageIcon(getClass().getResource("/img/eliminar.png"));
            JLabel lbImg_eliminar = new JLabel(new ImageIcon(img_eliminar.getImage()));
            if(x.getTipo_saldo().equals("Deudor")){
                modelo.addRow(new Object[]{
                    x.getCuenta().getCod_cuenta(),
                    x.getCuenta().getNom_cuenta(),
                    x.getMonto_cuenta(),
                    "",
                    lbImg_eliminar
                });
                
                totalDebe += x.getMonto_cuenta();
            }else{
                modelo.addRow(new Object[]{
                    x.getCuenta().getCod_cuenta(),
                    x.getCuenta().getNom_cuenta(),
                    "",
                    x.getMonto_cuenta(),
                    lbImg_eliminar
                });
                
                totalHaber += x.getMonto_cuenta();
            }
        }
        
        /* Settear totales (debe y haber) */
        this.panelLibroDiario.labelDebe.setText(formatoDecimal(totalDebe));
        this.panelLibroDiario.labelHaber.setText(formatoDecimal(totalHaber));
        
        /* Limpiar formulario */
        this.cuentaSeleccionada = null;
        this.panelLibroDiario.selectTipoSaldo.setSelectedIndex(0);
        this.panelLibroDiario.inputCodigoCuenta.setText("-");
        this.panelLibroDiario.inputNomCuenta.setText("-");
        this.panelLibroDiario.inputSaldo.setText("");
    }
    /* Fin métodos para mostrar datos en tablas */
    ////////////////////////////////////////////////////
    
    public void accionDeBotones(String accion){
        if(accion.equals("accionAgregarCuentaLibroDiario")){
            if(!this.panelLibroDiario.inputCodigoCuenta.getText().isEmpty() &&
                    !this.panelLibroDiario.inputNomCuenta.getText().isEmpty() &&
                    !this.panelLibroDiario.inputSaldo.getText().isEmpty() &&
                    this.panelLibroDiario.selectTipoSaldo.getSelectedIndex() > 0){
                
                this.cuentaTransaccion = new CuentaTransaccion();
                this.cuentaTransaccion.setCuenta(this.cuentaSeleccionada);
                
                this.cuentaTransaccion.setEstado(true);
                this.cuentaTransaccion.setMonto_cuenta(Double.parseDouble(this.panelLibroDiario.inputSaldo.getText()));
                this.cuentaTransaccion.setTipo_saldo(this.panelLibroDiario.selectTipoSaldo.getSelectedItem().toString());
                
                this.listaCuentaTransaccion.add(this.cuentaTransaccion);
                mostrarCuentaTransaccionLibroDiario();
            }
        }
    }
    
    public String formatoDecimal(Double precio) {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("0.00", simbolos);

        return formateador.format(precio);
    }
    
    
    /* Método que verifica cual boton se ha pulsado en la vista actual */
    int i = 0; // <- Omitir
    @Override
    public void actionPerformed(ActionEvent action) {
        
        if(action.getActionCommand().equals("btnInicio")){
            cambiarModulo("moduloInicio"); /* Llamar al método 'cambiarModulo' para que haga la acción de cambio de módulo o vista */
        }else if(action.getActionCommand().equals("btnLibros") || action.getActionCommand().equals("btnVolverLibroDiario")){
            cambiarModulo("moduloLibros");
        }else if(action.getActionCommand().equals("btnLibroDiario")){
            cambiarModulo("moduloLibroDiario");
        }else if(action.getActionCommand().equals("btnReportePartidas")){
            cambiarModulo("dialogReporteLibroDiario");
        }else if(action.getActionCommand().equals("btnBuscarCuentaPartida")){
            cambiarModulo("dialogBuscarCuentaLibroDiario");
        }else if(action.getActionCommand().equals("btnAgregarCuentaPartida")){
            accionDeBotones("accionAgregarCuentaLibroDiario");
        }
        
        System.out.println("Cambia de módulo " + i++); //<- Omitir
    }
    
    @Override
    public void mousePressed(MouseEvent evento) {
        
    }
    
    @Override
    public void mouseClicked(MouseEvent evento) {
        if(evento.getSource() == this.dialogCuentasLibroDiario.tablaCuentasLibroDiario){
            int columna = this.dialogCuentasLibroDiario.tablaCuentasLibroDiario.getSelectedColumn();
            int fila = this.dialogCuentasLibroDiario.tablaCuentasLibroDiario.getSelectedRow();
            
            if(columna == 2){ /* Verifica si se presiono la columna 2 en la tabla */
                try {
                    String cod = this.dialogCuentasLibroDiario.tablaCuentasLibroDiario.getValueAt(fila, 0).toString(); /* Almacenamos el codigo en una variable */
                    this.cuentaSeleccionada = this.daoCuenta.selectAllTo("cod_cuenta", cod).get(0); /* Buscamos la cuenta en la base de datos por código de cuenta */
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                
                this.dialogCuentasLibroDiario.dispose(); /* Cerrar ventana modal */
            
                /* Mostrar código y nombre de cuenta en los inputs */
                this.panelLibroDiario.inputCodigoCuenta.setText(this.cuentaSeleccionada.getCod_cuenta());
                this.panelLibroDiario.inputNomCuenta.setText(this.cuentaSeleccionada.getNom_cuenta());
            }
        }
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
