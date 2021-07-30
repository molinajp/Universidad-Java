package domain;

public class Usuario {
    
    private int usuarioId;
    
    private String usuario;
    
    private String password;

    public Usuario() {
    }

    public Usuario(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario(int usuarioId, String usuario, String password) {
        this.usuarioId = usuarioId;
        this.usuario = usuario;
        this.password = password;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuarioId=" + usuarioId + ", usuario=" + usuario + 
                ", password=" + password + '}';
    }
    
}
