/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.bean.Especialidad;

/**
 *
 * @author Alumno
 */
public class especialidadDAO {
    public static ArrayList<Especialidad> listado(){
        ArrayList<Especialidad> lista = new ArrayList();
        Especialidad esp = null;
        String sql = "select * from especialidad";
        try {
            Connection cn = conexion.Conexion.abrirConexion();
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                esp = new Especialidad();
                esp.setCod_esp(rs.getInt("cod_esp"));
                esp.setNom_esp(rs.getString("nom_esp"));
                lista.add(esp);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    public static Especialidad especialidadDato(int cod_esp){
        Especialidad esp = null;
        String sql = "select * from especialidad where cod_esp=?";
        try {
            Connection cn = conexion.Conexion.abrirConexion();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, cod_esp);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                esp = new Especialidad();
                esp.setCod_esp(rs.getInt("cod_esp"));
                esp.setNom_esp(rs.getString("nom_esp"));
            }
            return esp;
        } catch (Exception e) {
            return null;
        }
    }
}
