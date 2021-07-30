package test;

import java.sql.*;

public class TestMYSqlJDBC {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone"
                + "=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver"); hoy en dia no es requerido
            Connection conexion = DriverManager.getConnection(url,"root",
                    "Escritorio*10");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, "
                    + "telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("Id Persona: " + resultado.getInt
                                                    ("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.println(" Telefono: " + resultado.getString("telefono"));
            }
            conexion.close();
            instruccion.close();
            resultado.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
