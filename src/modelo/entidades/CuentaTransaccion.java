/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidades;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.dao.CuentaDao;
import modelo.dao.TransaccionDao;

/**
 *
 * @author Adonay
 */
public class CuentaTransaccion {
    private Transaccion transaccion;
    private Cuenta cuenta;
    private double monto_cuenta;
    private String tipo_saldo;
    private boolean estado;

    public CuentaTransaccion() {
    }

    public CuentaTransaccion(Transaccion transaccion, Cuenta cuenta, double monto_cuenta, String tipo_saldo, boolean estado) {
        this.transaccion = transaccion;
        this.cuenta = cuenta;
        this.monto_cuenta = monto_cuenta;
        this.tipo_saldo = tipo_saldo;
        this.estado = estado;
    }

    public Transaccion getTransaccion() {
        TransaccionDao daoTransaccion = new TransaccionDao();
        try {
            this.transaccion = daoTransaccion.selectId(this.transaccion.getId_transaccion()).get(0);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    public Cuenta getCuenta() {
        CuentaDao daoCuenta = new CuentaDao();
        try {
            this.cuenta = daoCuenta.selectAllTo("cod_cuenta", this.cuenta.getCod_cuenta()).get(0);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public double getMonto_cuenta() {
        return monto_cuenta;
    }

    public void setMonto_cuenta(double monto_cuenta) {
        this.monto_cuenta = monto_cuenta;
    }

    public String getTipo_saldo() {
        return tipo_saldo;
    }

    public void setTipo_saldo(String tipo_saldo) {
        this.tipo_saldo = tipo_saldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
