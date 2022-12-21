package mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {
    public static void createMessageDB(Mensajes message){
        Conexion connectionDB = new Conexion();
        try(Connection conexion = connectionDB.get_connection()) {
            PreparedStatement ps;
            String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?, ?)";
            ps = conexion.prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setString(2, message.getAutor_message());
            ps.executeUpdate();
            System.out.println("new message created");
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readMessageDB(){
        Conexion connectionDB = new Conexion();
        try(Connection conexion = connectionDB.get_connection()) {
            PreparedStatement ps;
            ResultSet rs;
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("id_mensaje") + ". "
                        + rs.getString("mensaje"));
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void deleteMessageDB(int id_message){
        Conexion connectionDB = new Conexion();
        try(Connection conexion = connectionDB.get_connection()) {
            PreparedStatement ps;
            String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
            ps = conexion.prepareStatement(query);
            ps.setInt(1,id_message);
            ps.executeUpdate();

            System.out.println("delete message");
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void updateMessageDB(Mensajes message){
        Conexion connectionDB = new Conexion();
        try(Connection conexion = connectionDB.get_connection()) {
            PreparedStatement ps;
            String query = "UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
            ps = conexion.prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setInt(2, message.getId_messages());
            ps.executeUpdate();
            System.out.println("message updated");
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
