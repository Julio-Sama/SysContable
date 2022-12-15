/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidades;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.dao.CuentaTransaccionDao;

/**
 *
 * @author Adonay
 */
public class Transaccion {
    private int id_transaccion;
    private Date fecha_transaccion;
    private String concepto_transaccion;
    private int numero_partida;
    private ArrayList<CuentaTransaccion> listaCuentaTransaccion;

    public Transaccion() {
    }

    public Transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public Transaccion(int id_transaccion, Date fecha_transaccion, String concepto_transaccion, int numero_partida) {
        this.id_transaccion = id_transaccion;
        this.fecha_transaccion = fecha_transaccion;
        this.concepto_transaccion = concepto_transaccion;
        this.numero_partida = numero_partida;
    }

    public int getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public Date getFecha_transaccion() {
        return fecha_transaccion;
    }

    public void setFecha_transaccion(Date fecha_transaccion) {
        this.fecha_transaccion = fecha_transaccion;
    }

    public String getConcepto_transaccion() {
        return concepto_transaccion;
    }

    public void setConcepto_transaccion(String concepto_transaccion) {
        this.concepto_transaccion = concepto_transaccion;
    }

    public int getNumero_partida() {
        return numero_partida;
    }

    public void setNumero_partida(int numero_partida) {
        this.numero_partida = numero_partida;
    }

    public ArrayList<CuentaTransaccion> getListaCuentaTransaccion() {
        CuentaTransaccionDao daoCuentaTransaccion = new CuentaTransaccionDao();
        try {
            this.listaCuentaTransaccion = daoCuentaTransaccion.selectAllTo("id_transaccion", this.id_transaccion);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return listaCuentaTransaccion;
    }

    public void setListaCuentaTransaccion(ArrayList<CuentaTransaccion> listaCuentaTransaccion) {
        this.listaCuentaTransaccion = listaCuentaTransaccion;
    }
}
