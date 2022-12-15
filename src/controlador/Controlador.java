/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.dao.CuentaDao;
import modelo.entidades.Cuenta;
import utilidades.CambiaPanel;
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
public class Controlador implements ActionListener{
    ////////////////////////////////////////////////////
    private Menu menu;
    
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
    private CuentaDao daoCuenta = new CuentaDao();
    /* Fin declaración de objetos DAOs */
    ////////////////////////////////////////////////////
    
    
    public Controlador(Menu menu) {
        this.menu = menu;
        this.menu.setControlador(this);
        new CambiaPanel(this.menu.pnlCambia, new PnlInicio());
        this.menu.iniciar();
    }
    
    /* Método para cambiar de módulo */
    public void cambiarModulo(String boton){
        /* Condiciones para cambiar de modulo */
        if(boton.equals("moduloInicio")){
            this.panelInicio = new PnlInicio(); /* Se asigna espacio en memoria */
            new CambiaPanel(this.menu.pnlCambia, this.panelInicio); /* Llamar a la clase 'CambiaPanel' para mostrar el módulo o vista*/
        }else if(boton.equals("moduloLibros")){
            this.panelLibros = new PnlLibros();
            this.panelLibros.setControlador(this); /* Setteamos el controlador para poder manejar los eventos de botones */
            new CambiaPanel(this.menu.pnlCambia, this.panelLibros);
        }else if(boton.equals("moduloLibroDiario")){
            this.panelLibroDiario = new PnlLibroDiario();
            this.panelLibroDiario.setControlador(this);
            new CambiaPanel(this.menu.pnlCambia, this.panelLibroDiario);
        }
        
        /* Condiciones para mostrar modals (JDialog) */
        if(boton.equals("dialogReporteLibroDiario")){
            this.dialogReporteLibroDiario = new DialogReporteLibroDiario(new JFrame(), true);
            //this.dialogReporteLibroDiario.setControlador(this);
            this.dialogReporteLibroDiario.setVisible(true);
        }else if(boton.equals("dialogBuscarCuentaLibroDiario")){
            this.dialogCuentasLibroDiario = new DialogCuentasLibroDiario(new JFrame(), true);
            mostrarCuentasLibroDiario(); /* Antes de mostrar dialogo se cargan las cuentas en la tabla */
            this.dialogCuentasLibroDiario.setVisible(true);
        }
    }
    
    ////////////////////////////////////////////////////
    /* Métodos para mostrar datos en tablas */
    public void mostrarCuentasLibroDiario(){
        DefaultTableModel modelo = (DefaultTableModel)this.dialogCuentasLibroDiario.tablaCuentasLibroDiario.getModel();
        modelo.setRowCount(0);
        
        try {
            for(Cuenta x : this.daoCuenta.selectAll()){
                modelo.addRow(new Object[]{x.getCod_cuenta(), x.getNom_cuenta(), ""});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        this.dialogCuentasLibroDiario.tablaCuentasLibroDiario.setModel(modelo);
    }
    /* Fin métodos para mostrar datos en tablas */
    ////////////////////////////////////////////////////
    
    
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
        }
        
        System.out.println("Cambia de módulo " + i++); //<- Omitir
    }

}
