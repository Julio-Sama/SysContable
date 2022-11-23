/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidades;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.dao.CuentaDao;

/**
 *
 * @author Adonay
 */
public class TipoCuenta {
    private int id_tipo_cuenta;
    private String nom_tipo;
    private ArrayList<Cuenta> cuentas;

    public TipoCuenta() {
    }

    public TipoCuenta(int id_tipo_cuenta) {
        this.id_tipo_cuenta = id_tipo_cuenta;
    }

    public TipoCuenta(int id_tipo_cuenta, String nom_tipo, ArrayList<Cuenta> cuentas) {
        this.id_tipo_cuenta = id_tipo_cuenta;
        this.nom_tipo = nom_tipo;
        this.cuentas = cuentas;
    }
    
    public int getId_tipo_cuenta() {
        return id_tipo_cuenta;
    }

    public void setId_tipo_cuenta(int id_tipo_cuenta) {
        this.id_tipo_cuenta = id_tipo_cuenta;
    }

    public String getNom_tipo() {
        return nom_tipo;
    }

    public void setNom_tipo(String nom_tipo) {
        this.nom_tipo = nom_tipo;
    }

    public ArrayList<Cuenta> getCuentas() throws SQLException {
        CuentaDao daoCuenta = new CuentaDao();
        this.cuentas = daoCuenta.selectAllTo("id_tipo_cuenta", this.getId_tipo_cuenta());
        return this.cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
