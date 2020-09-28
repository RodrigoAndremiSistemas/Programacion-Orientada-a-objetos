package datos;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import entidades.Cursos;


public class PersonaDatos {
    

    public static List<Alumno>  listaAlumno = new ArrayList<Alumno>();
    static int id=0;
    
    public PersonaDatos(){                
    }
    
    public void create(Alumno A) {
        id = id + 1;
        System.out.println("ID:" + id);
        A.setId(id);
        listaAlumno.add(A);
    }
    
    public void delete(int id) {
        for (Alumno A : listaAlumno) {
            if (id == A.getId()) {
                listaAlumno.remove(A);
                System.out.println("Eliminado " + A.getNombre());
            }
        }
    }    
}
