package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
       
        //Insertando un nuevo objeto de tipo Persona
//        Persona personaNueva = new Persona("Carlos", "Esparza",
//                "cesparza@mail.com", "75312648");
//        personaDao.insertar(personaNueva);
        
        //Modificar un objeto existente
        Persona personaActualizada = new Persona(5, "Juan Carlos", "Esparza",
                                        "jcesparza@mail.com", "75312648");
        personaDao.actualizar(personaActualizada);
        
        //Eliminar un registro
        Persona personaEliminar = new Persona(5);
        personaDao.eliminar(personaEliminar);
        
        //Listado de personas
        List<Persona> personas = personaDao.selecccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}
