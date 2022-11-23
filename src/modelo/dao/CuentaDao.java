/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.conexion.Conexion;
import modelo.entidades.Cuenta;
import modelo.entidades.Empresa;
import modelo.entidades.TipoCuenta;

/**
 *
 * @author Adonay
 */
public class CuentaDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public ArrayList<Cuenta> selectAll() throws SQLException {
        String sql = "SELECT * FROM cuenta";
        return select(sql);
    }

    public ArrayList<Cuenta> selectAllTo(String atrib, String condicion) throws SQLException {
        String sql = "SELECT * FROM cuenta WHERE " + atrib + "='" + condicion + "'";
        return select(sql);
    }
    
    public ArrayList<Cuenta> selectAllTo(String atrib, int condicion) throws SQLException {
        String sql = "SELECT * FROM cuenta WHERE " + atrib + "=" + condicion + "";
        return select(sql);
    }

    public ArrayList<Cuenta> buscar(String dato) throws SQLException {
        String sql = "SELECT * FROM cuenta WHERE cod_cuenta like '" + dato + "%' OR nom_cuenta like '" + dato + "%'";
        return select(sql);
    }

    private ArrayList<Cuenta> select(String sql) throws SQLException {
        
        ArrayList<Cuenta> lista = new ArrayList<>();
        Cuenta obj = null;
        
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new Cuenta();

                obj.setCod_cuenta(rs.getString("cod_cuenta"));
                obj.setNom_cuenta(rs.getString("nom_cuenta"));
                obj.setTipo_saldo(rs.getString("tipo_saldo"));
                obj.setEstado_financiero(rs.getString("estado_financiero"));
                obj.setTipo_cuenta(new TipoCuenta(rs.getInt("id_tipo_cuenta")));
                obj.setEmpresa(new Empresa(rs.getInt("id_empresa")));

                lista.add(obj);
            }

        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
            }
        }
        
        return lista;
    }
}
