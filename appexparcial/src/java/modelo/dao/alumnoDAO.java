package modelo.dao;

import java.sql.*;
import java.util.ArrayList;
import modelo.bean.Alumno;

public class alumnoDAO {
    public static ArrayList<Alumno> listado(){
        ArrayList<Alumno> lista = new ArrayList();
        Alumno al = null;
        String sql = "select * from alumno";
        try {
            Connection cn = conexion.Conexion.abrirConexion();
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                al = new Alumno();
                al.setCod_al(rs.getInt("cod_al"));
                al.setNom_alum(rs.getString("nom_alum"));
                al.setCod_esp(rs.getInt("cod_esp"));
                al.setFoto(rs.getString("foto"));
                lista.add(al);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    public static ArrayList<Alumno> listadoCarrera(int cod_esp){
        ArrayList<Alumno> lista = new ArrayList();
        Alumno al = null;
        String sql = "select * from alumno where cod_esp=?";
        try {
            Connection cn = conexion.Conexion.abrirConexion();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, cod_esp);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                al = new Alumno();
                al.setCod_al(rs.getInt("cod_al"));
                al.setNom_alum(rs.getString("nom_alum"));
                al.setCod_esp(rs.getInt("cod_esp"));
                al.setFoto(rs.getString("foto"));
                lista.add(al);
            }
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
}
