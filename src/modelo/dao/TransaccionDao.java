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
import modelo.entidades.Transaccion;

/**
 *
 * @author Adonay
 */
public class TransaccionDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public ArrayList<Transaccion> selectAll() throws SQLException {
        String sql = "SELECT * FROM transaccion";
        return select(sql);
    }

    public ArrayList<Transaccion> selectAllTo(String atrib, String condicion) throws SQLException {
        String sql = "SELECT * FROM transaccion WHERE " + atrib + "='" + condicion + "'";
        return select(sql);
    }
    
    public ArrayList<Transaccion> selectId(int id) throws SQLException {
        String sql = "SELECT * FROM transaccion WHERE id_transaccion=" + id;
        return select(sql);
    }

    private ArrayList<Transaccion> select(String sql) throws SQLException {
        
        ArrayList<Transaccion> lista = new ArrayList<>();
        Transaccion obj = null;
        
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                obj = new Transaccion();

                obj.setId_transaccion(rs.getInt("id_transaccion"));
                obj.setFecha_transaccion(rs.getDate("fecha_transaccion"));
                obj.setConcepto_transaccion(rs.getString("concepto_transaccion"));
                obj.setNumero_partida(rs.getInt("numero_partida"));

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
