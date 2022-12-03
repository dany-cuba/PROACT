package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Administracion {
    
    Conexion enlace = new Conexion();
    static Connection con;
    static PreparedStatement ps;
    static ResultSet rs;
    
    public void agregarObservaciones(String fecha, float temp_max, float temp_min, float precip,
                                     float vel_media, float evaporiz, String entidad)   throws SQLException, ClassNotFoundException{
        
        con = enlace.Conectar();
        
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
}
