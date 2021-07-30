package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.*;
import java.util.*;

public class UsuarioDAO {

    private static final String SQL_INSERT = "INSERT INTO usuario (username, "
            + "password) VALUES(?, ?)";

    private static final String SQL_UPDATE = "UPDATE usuario SET username = ?, "
            + "password = ? WHERE id_usuario = ?";

    private static final String SQL_DELETE = "DELETE FROM usuario WHERE "
            + "id_usuario = ?";

    private static final String SQL_SELECT = "SELECT id_usuario, "
            + "username, password FROM usuario";

    public List<Usuario> select() {
        Connection connection = null;
        PreparedStatement prepState = null;
        ResultSet resultSet = null;
        List<Usuario> usuarios = new ArrayList();
        try {
            connection = getConnection();
            prepState = connection.prepareStatement(SQL_SELECT);
            resultSet = prepState.executeQuery();
            while (resultSet.next()) {
                var id = resultSet.getInt("id_usuario");
                var username = resultSet.getString("username");
                var password = resultSet.getString("password");
                usuarios.add(new Usuario(id, username, password));
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
        return usuarios;
    }

    public int insertar(Usuario usuario) {
        Connection connection = null;
        PreparedStatement prepState = null;
        int insertados = 0;
        try {
            connection = getConnection();
            prepState = connection.prepareStatement(SQL_INSERT);
            prepState.setString(1, usuario.getUsername());
            prepState.setString(2, usuario.getPassword());
            insertados = prepState.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(prepState);
                close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return insertados;
    }

    public int eliminar(Usuario usuario) {
        Connection connection = null;
        PreparedStatement prepState = null;
        int eliminados = 0;
        try {
            connection = getConnection();
            prepState = connection.prepareStatement(SQL_DELETE);
            prepState.setInt(1, usuario.getId_usuario());
            eliminados = prepState.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(prepState);
                close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return eliminados;
    }

    public int actualizar(Usuario usuario) {
        Connection connection = null;
        PreparedStatement prepState = null;
        int eliminados = 0;
        try {
            connection = getConnection();
            prepState = connection.prepareStatement(SQL_UPDATE);
            prepState.setString(1, usuario.getUsername());
            prepState.setString(2, usuario.getPassword());
            prepState.setInt(3, usuario.getId_usuario());
            eliminados = prepState.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
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
