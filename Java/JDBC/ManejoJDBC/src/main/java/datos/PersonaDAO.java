package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;
import static datos.Conexion.*;

public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT id_persona, nombre, "
            + "apellido, email, telefono FROM persona";

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

}
