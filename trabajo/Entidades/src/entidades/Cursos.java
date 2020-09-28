package entidades;

public class Cursos  extends Alumno{
    
   private int id;
    private String Nombre;
    private Double Credito;
    private int Horas;
    
    
    public void agregarCursos() {
        System.out.println("agregar Cursos");
    }

    public void recibirCursos() {
        System.out.println("recibir los cursos");
       
    }

    public int setId() {
        return id;
    }

    public void getId(int id) {
        this.id = id;
    }

    public String setNombre() {
        return Nombre;
    }

    public void getNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getCredito() {
        return Credito;
    }

    public void setCredito(Double Credito) {
        this.Credito = Credito;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

   
    
}
