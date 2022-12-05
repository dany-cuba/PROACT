package Clases;

import Excepciones.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Administracion {
    
    Conexion enlace = new Conexion();
    static Connection con;
    static PreparedStatement ps;
    static ResultSet rs;
    
    public void agregarObservaciones(String fecha, float temp_max, float temp_min, float precip,
                                     float vel_media, float evaporiz, String entidad)   throws SQLException, ClassNotFoundException{
        
        con = enlace.conectar();
        
        switch (entidad) {
            case "E. Caibarién" -> {
                ps = con.prepareStatement("INSERT INTO `observación` (`Fecha`, `Temp_max`, `Temp_min`, `Precipitaciones`, `Media_viento`, `Evaporización_agua`, `Nombre_E`)"
                                                        + " VALUES ('"+fecha+"', '"+temp_max+"', '"+temp_min+"', '"+precip+"', '"+vel_media+"', '"+evaporiz+"', '"+entidad+"')");
                ps.executeUpdate();
            }
            case "E. La Piedra" -> {
                ps = con.prepareStatement("INSERT INTO `observación` (`Fecha`, `Temp_max`, `Temp_min`, `Precipitaciones`, `Media_viento`, `Evaporización_agua`, `Nombre_E`)"
                                                        + " VALUES ('"+fecha+"', '"+temp_max+"', '"+temp_min+"', '"+precip+"', '"+vel_media+"', '"+evaporiz+"', '"+entidad+"')");
                ps.executeUpdate();
            }
            case "E. Sagua la Grande" -> {
                ps = con.prepareStatement("INSERT INTO `observación` (`Fecha`, `Temp_max`, `Temp_min`, `Precipitaciones`, `Media_viento`, `Evaporización_agua`, `Nombre_E`)"
                                                        + " VALUES ('"+fecha+"', '"+temp_max+"', '"+temp_min+"', '"+precip+"', '"+vel_media+"', '"+evaporiz+"', '"+entidad+"')");
                ps.executeUpdate();
            }
            case "E. Santo Domingo" -> {
                ps = con.prepareStatement("INSERT INTO `observación` (`Fecha`, `Temp_max`, `Temp_min`, `Precipitaciones`, `Media_viento`, `Evaporización_agua`, `Nombre_E`)"
                                                        + " VALUES ('"+fecha+"', '"+temp_max+"', '"+temp_min+"', '"+precip+"', '"+vel_media+"', '"+evaporiz+"', '"+entidad+"')");
                ps.executeUpdate();
            }
            case "E. Yabú" -> {
                ps = con.prepareStatement("INSERT INTO `observación` (`Fecha`, `Temp_max`, `Temp_min`, `Precipitaciones`, `Media_viento`, `Evaporización_agua`, `Nombre_E`)"
                                                        + " VALUES ('"+fecha+"', '"+temp_max+"', '"+temp_min+"', '"+precip+"', '"+vel_media+"', '"+evaporiz+"', '"+entidad+"')");
                ps.executeUpdate();
            }
        }
        con = enlace.desconectar();
    }
    
    public boolean revizarFecha(String fecha) throws SQLException, ClassNotFoundException, FechaExistente{
        
        con = enlace.conectar();
        
        ps = con.prepareStatement("SELECT * FROM `observación` WHERE `Fecha`='"+fecha+"'");
        rs = ps.executeQuery();
        
        con = enlace.desconectar();
        return rs.next();
    }
    
    public void revizarErrorFecha(String fecha) throws SQLException, ClassNotFoundException, FechaExistente{
        if(revizarFecha(fecha)){
            throw new FechaExistente("Ya existe una observación para esa fecha");
        }
    }
    
    public String buscarValor_FechaEstacion(String fecha, String nombre_E, String columna) throws SQLException, ClassNotFoundException{
        
        con = enlace.conectar();
        
        ps = con.prepareStatement("SELECT * FROM `observación` WHERE `Fecha` = '"+fecha+"' AND `Nombre_E` = '"+nombre_E+"'");
        rs = ps.executeQuery();
        rs.next();
        
        con = enlace.desconectar();
        return rs.getString(columna);
        
    }
    
    public float[] listaTemperaturas(String fecha, String tipo) throws SQLException, ClassNotFoundException{
        float[] lista = new float[5];
        con = enlace.conectar();
        
        if(tipo.equals("max")){
            
            ps = con.prepareStatement("SELECT * FROM `observación` WHERE `Fecha` = '"+fecha+"' AND (SELECT `Temp_max`)");
            rs = ps.executeQuery();
            rs.next();
        
            for(int i=0; i<5; i++){
                lista[i] = rs.getFloat("Temp_max");
                rs.next();
            }
            con = enlace.desconectar();
            return lista;
        
        }else if(tipo.equals("min")){
            
            ps = con.prepareStatement("SELECT * FROM `observación` WHERE `Fecha` = '"+fecha+"' AND (SELECT `Temp_min`)");
            rs = ps.executeQuery();
            rs.next();
        
            for(int i=0; i<5; i++){
                lista[i] = rs.getFloat("Temp_min");
                rs.next();
            }
            con = enlace.desconectar();
            return lista;
        }
        return null;
    }
    
    public String normalizarFecha(String anno, String mes, String decena){
        String fecha = "";
        
        switch(decena){
            case "Primera" -> fecha = "1ra/"+mes+"/"+anno;
                
            case "Segunda" -> fecha = "2da/"+mes+"/"+anno; 
            
            case "Tercera" -> fecha = "3ra/"+mes+"/"+anno;
        }
        return fecha;
    }
}
