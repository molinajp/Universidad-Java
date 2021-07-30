package test;

import datos.UsuarioDAO;
import domain.Usuario;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        usuarioDao.insertar(new Usuario("asdf","fdsa"));
        usuarioDao.insertar(new Usuario("Juan","JP"));
        
        //usuarioDao.actualizar(new Usuario(1,"asdf","password"));
    }
}
