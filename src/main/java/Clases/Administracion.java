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
    
    public void agregarObservacion(Observacion o)   throws SQLException, ClassNotFoundException{
        
        con = enlace.conectar();
        
            ps = con.prepareStatement("INSERT INTO `observación` (`Fecha`, `Temp_max`, `Temp_min`, `Precipitaciones`, `Media_viento`, `Evaporización_agua`, `Nombre_E`)"
                                                        + " VALUES ('"+o.getFecha()+"', '"+o.getTempMax()+"', '"+o.getTempMin()+"', '"+o.getPrecipitacion()+"', '"+o.getMediaViento()+"', '"+o.getEvapor()+"', '"+o.getNombreEstacion()+"')");
            ps.executeUpdate();
            
        con = enlace.desconectar();
    }
    
    public void modificarObservacion(Observacion o)   throws SQLException, ClassNotFoundException{
        
        con = enlace.conectar();
        
            ps = con.prepareStatement("UPDATE `observación` SET `Temp_max`='"+o.getTempMax()+"',`Temp_min`='"+o.getTempMin()+"' ,`Precipitaciones`='"+o.getPrecipitacion()+"',"
                    + "`Media_viento`='"+o.getMediaViento()+"',`Evaporización_agua`='"+o.getEvapor()+"' WHERE `Fecha`= '"+o.getFecha()+"' AND `Nombre_E` = '"+o.getNombreEstacion()+"'");
            ps.executeUpdate();
         
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
    
    public String[][] buscarMatriZValores_Fecha(String fecha) throws SQLException, ClassNotFoundException{
        
        String[][] matriz = new String[5][5];
        con = enlace.conectar();
        
        String[] Observ = new String[5];
        Observ[0] = "Temp_max";
        Observ[1] = "Temp_min";
        Observ[2] = "Precipitaciones";
        Observ[3] = "Media_viento";
        Observ[4] = "Evaporización_agua";
        
        ps = con.prepareStatement("SELECT * FROM `observación` WHERE `Fecha` = '"+fecha+"'");
        rs = ps.executeQuery();
        rs.next();
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                matriz[i][j] = rs.getString(Observ[j]);
                
            }
            rs.next();
        }
        con = enlace.desconectar();
        return matriz;        
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

    public boolean eliminarObservacion(Observacion o) throws SQLException, ClassNotFoundException, FechaExistente {
        con = enlace.conectar();
        
        ps = con.prepareStatement("DELETE FROM `observación` WHERE `Fecha` = '"+o.getFecha()+"'");
        int res = ps.executeUpdate();
        
        con = enlace.desconectar();
        return res>0;        
    }
    
    public void agregarActorC(ActorClave actor) throws SQLException, ClassNotFoundException{
        con = enlace.conectar();
        
        ps = con.prepareStatement("INSERT INTO `actor_clave` (`Nombre_A`, `Nombre_M`, `Tipo`)"
                + " VALUES ('"+actor.nombre+"', '"+actor.municipio+"', '"+actor.tipo+"')");
        ps.executeUpdate();
        con = enlace.desconectar();
    }
    
    public boolean eliminarActorC(ActorClave actor) throws SQLException, ClassNotFoundException{
        con = enlace.conectar();
        
        ps = con.prepareStatement("DELETE FROM `actor_clave` WHERE `Nombre_A` = '"+actor.nombre+"'");
        int res = ps.executeUpdate();
        
        con = enlace.desconectar();
        return res>0; 
    }
    
    public boolean revizarNombre(String nombre) throws SQLException, ClassNotFoundException{
        con = enlace.conectar();
        
        ps = con.prepareStatement("SELECT * FROM `actor_clave` WHERE `Nombre_A` = '"+nombre+"'");
        rs = ps.executeQuery();
        
        con = enlace.desconectar();
        return rs.next();
    }
}
