package datos;

import java.sql.*;

public class Conexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/test?useSSL="
            + "false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    
    private static final String USER = "root";
    
    private static final String PASSWORD = "ContraseñaDePrueba";//cambiar a la otra contraseña
    
    public static Connection getConexion() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    public static void close(Connection connection) throws SQLException{
        connection.close();
    }
    
    public static void close(PreparedStatement prepState) throws SQLException{
        prepState.close();
    }
        
    public static void close(ResultSet resultSet) throws SQLException{
        resultSet.close();
    }
}
