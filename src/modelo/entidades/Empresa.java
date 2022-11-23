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
public class Empresa {
    private int id_empresa;
    private String nom_empresa;
    private int periodo;
    private String nit_empresa;
    private boolean estado_empresa;
    private ArrayList<Cuenta> cuentas;

    public Empresa() {
    }

    public Empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public Empresa(int id_empresa, String nom_empresa, int periodo, String nit_empresa, boolean estado_empresa) {
        this.id_empresa = id_empresa;
        this.nom_empresa = nom_empresa;
        this.periodo = periodo;
        this.nit_empresa = nit_empresa;
        this.estado_empresa = estado_empresa;
    }

    public Empresa(String nom_empresa, int periodo, String nit_empresa, boolean estado_empresa) {
        this.nom_empresa = nom_empresa;
        this.periodo = periodo;
        this.nit_empresa = nit_empresa;
        this.estado_empresa = estado_empresa;
    }

    public Empresa(String nom_empresa, int periodo, String nit_empresa, boolean estado_empresa, ArrayList<Cuenta> cuentas) {
        this.nom_empresa = nom_empresa;
        this.periodo = periodo;
        this.nit_empresa = nit_empresa;
        this.estado_empresa = estado_empresa;
        this.cuentas = cuentas;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNom_empresa() {
        return nom_empresa;
    }

    public void setNom_empresa(String nom_empresa) {
        this.nom_empresa = nom_empresa;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getNit_empresa() {
        return nit_empresa;
    }

    public void setNit_empresa(String nit_empresa) {
        this.nit_empresa = nit_empresa;
    }

    public boolean isEstado_empresa() {
        return estado_empresa;
    }

    public void setEstado_empresa(boolean estado_empresa) {
        this.estado_empresa = estado_empresa;
    }

    public ArrayList<Cuenta> getCuentas() throws SQLException {
        CuentaDao daoCuenta = new CuentaDao();
        this.cuentas = daoCuenta.selectAllTo("id_empresa", this.getId_empresa());
        return this.cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
