package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;
import static datos.Conexion.*;

public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT id_persona, nombre, "
            + "apellido, email, telefono FROM persona";
    
    private static final String SQL_INSERT = "INSERT INTO persona (nombre, "
            + "apellido, email, telefono) VALUES(?, ?, ?, ?)";
    
    private static final String SQL_DELETE = "DELETE FROM persona WHERE"
            + " id_persona = ?";
    
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?,"
            + " apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";

    public List<Persona> selecccionar() {
        Connection connection = null;
        PreparedStatement prepState = null;
        ResultSet resultSet = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        try {
            connection = getConnection();
            prepState = connection.prepareStatement(SQL_SELECT);
            resultSet = prepState.executeQuery();
            while (resultSet.next()) {
                int idPersona = resultSet.getInt("id_persona");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String email = resultSet.getString("email");
                String telefono = resultSet.getString("telefono");
                
                persona = new Persona(idPersona, nombre, apellido,
                        email, telefono);
                
                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(resultSet);
                close(prepState);
                close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return personas;
    }
    
    public int insertar(Persona persona){
        Connection connection = null;
        PreparedStatement prepState = null;
        int insertados = 0;
        try {
            connection = getConnection();
            prepState = connection.prepareStatement(SQL_INSERT);
            prepState.setString(1, persona.getNombre());
            prepState.setString(2, persona.getApellido());
            prepState.setString(3, persona.getEmail());
            prepState.setString(4, persona.getTelefono());
            insertados = prepState.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                close(prepState);
                close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return insertados;
    }
    
      public int actualizar(Persona persona){
        Connection connection = null;
        PreparedStatement prepState = null;
        int actualizados = 0;
        try {
            connection = getConnection();
            prepState = connection.prepareStatement(SQL_UPDATE);
            prepState.setString(1, persona.getNombre());
            prepState.setString(2, persona.getApellido());
            prepState.setString(3, persona.getEmail());
            prepState.setString(4, persona.getTelefono());
            prepState.setInt(5, persona.getIdPersona());
            actualizados = prepState.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                close(prepState);
                close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return actualizados;
    }
    
    public int eliminar(Persona persona){
        Connection connection = null;
        PreparedStatement prepState = null;
        int eliminados = 0;
        try {
            connection = getConnection();
            prepState = connection.prepareStatement(SQL_DELETE);
            prepState.setInt(1, persona.getIdPersona());
            eliminados = prepState.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                close(prepState);
                close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return eliminados;
    }
    
  
}
