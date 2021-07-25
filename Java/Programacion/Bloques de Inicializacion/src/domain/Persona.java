package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    
    static{
        System.out.println("Ejecución bloque estático");
        ++Persona.contadorPersonas;
    }
    
    {
        System.out.println("Ejecución bloque NO estático");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecución del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
