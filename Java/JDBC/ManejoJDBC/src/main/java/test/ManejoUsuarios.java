package test;

import datos.UsuarioDAO;
import domain.Usuario;

public class ManejoUsuarios {

    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        //Insertar un nuevo usuario
        Usuario usuario = new Usuario("carlos.juarez", "123");
        usuarioDao.insertar(usuario);
        
        //Modificar un usuario existente
        //Usuario usuario = new Usuario(3, "carlos.juarez", "456");
        //usuarioDao.actualizar(usuario);
        
        //Eliminar un usuario
        //usuarioDao.eliminar(new Usuario(3));
        
        var usuarios = usuarioDao.select();
        usuarios.forEach(us -> {
            System.out.println(us);
        });
    }
}
