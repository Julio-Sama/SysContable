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
import modelo.entidades.CuentaTransaccion;
import modelo.entidades.Transaccion;

/**
 *
 * @author Adonay
 */
public class CuentaTransaccionDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public ArrayList<CuentaTransaccion> selectAll() throws SQLException {
        String sql = "SELECT * FROM cuenta_transaccion";
        return select(sql);
    }

    public ArrayList<CuentaTransaccion> selectAllTo(String atrib, String condicion) throws SQLException {
        String sql = "SELECT * FROM cuenta_transaccion WHERE " + atrib + "='" + condicion + "'";
        return select(sql);
    }
    
    public ArrayList<CuentaTransaccion> selectAllTo(String atrib, int condicion) throws SQLException {
        String sql = "SELECT * FROM cuenta_transaccion WHERE " + atrib + "=" + condicion;
        return select(sql);
    }

    private ArrayList<CuentaTransaccion> select(String sql) throws SQLException {
        
        ArrayList<CuentaTransaccion> lista = new ArrayList<>();
        CuentaTransaccion obj = null;
        
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new CuentaTransaccion();

                obj.setTransaccion(new Transaccion(rs.getInt("id_transaccion")));
                obj.setCuenta(new Cuenta(rs.getString("cod_cuenta")));
                obj.setMonto_cuenta(rs.getDouble("monto_cuenta_transaccion"));
                obj.setTipo_saldo(rs.getString("tipo_saldo"));
                obj.setEstado(rs.getBoolean("estado"));

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
