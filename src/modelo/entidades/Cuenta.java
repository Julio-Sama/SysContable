/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.entidades;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.dao.CuentaTransaccionDao;

/**
 *
 * @author Adonay
 */
public class Cuenta {
    private String cod_cuenta;
    private String nom_cuenta;
    private String tipo_saldo;
    private String estado_financiero;
    private int nivel_cuenta;
    private Empresa empresa;
    private TipoCuenta tipo_cuenta;
    private ArrayList<CuentaTransaccion> listaCuentaTransacciones;
    
    public Cuenta() {
    }

    public Cuenta(String cod_cuenta) {
        this.cod_cuenta = cod_cuenta;
    }

    public Cuenta(String cod_cuenta, String nom_cuenta) {
        this.cod_cuenta = cod_cuenta;
        this.nom_cuenta = nom_cuenta;
    }

    public Cuenta(String cod_cuenta, String nom_cuenta, String tipo_saldo, String estado_financiero, int nivel_cuenta, Empresa empresa, TipoCuenta tipo_cuenta) {
        this.cod_cuenta = cod_cuenta;
        this.nom_cuenta = nom_cuenta;
        this.tipo_saldo = tipo_saldo;
        this.estado_financiero = estado_financiero;
        this.nivel_cuenta = nivel_cuenta;
        this.empresa = empresa;
        this.tipo_cuenta = tipo_cuenta;
    }

    public String getCod_cuenta() {
        return cod_cuenta;
    }

    public void setCod_cuenta(String cod_cuenta) {
        this.cod_cuenta = cod_cuenta;
    }

    public String getNom_cuenta() {
        return nom_cuenta;
    }

    public void setNom_cuenta(String nom_cuenta) {
        this.nom_cuenta = nom_cuenta;
    }

    public String getTipo_saldo() {
        return tipo_saldo;
    }

    public void setTipo_saldo(String tipo_saldo) {
        this.tipo_saldo = tipo_saldo;
    }

    public String getEstado_financiero() {
        return estado_financiero;
    }

    public void setEstado_financiero(String estado_financiero) {
        this.estado_financiero = estado_financiero;
    }

    public int getNivel_cuenta() {
        return nivel_cuenta;
    }

    public void setNivel_cuenta(int nivel_cuenta) {
        this.nivel_cuenta = nivel_cuenta;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public TipoCuenta getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(TipoCuenta tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public ArrayList<CuentaTransaccion> getListaCuentaTransacciones() {
        CuentaTransaccionDao daoCuentaTransaccion = new CuentaTransaccionDao();
        try {
            this.listaCuentaTransacciones = daoCuentaTransaccion.selectAllTo("cod_cuenta", this.cod_cuenta);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return listaCuentaTransacciones;
    }

    public void setListaCuentaTransacciones(ArrayList<CuentaTransaccion> listaCuentaTransacciones) {
        this.listaCuentaTransacciones = listaCuentaTransacciones;
    }

    
}
