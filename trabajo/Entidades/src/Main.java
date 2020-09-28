import java.util.List;
import java.util.Scanner;

import datos.PersonaDatos;
import entidades.Alumno;
import entidades.Cursos;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt = 0;
        PersonaDatos pData = new PersonaDatos();
        do {
            System.out.println("***** CRUD PERSONA *****");
            System.out.println("1 Listar ");
            System.out.println("2 Nuevo ");
            System.out.println("3 Eliminar ");
            System.out.println("0 Salir ");
            System.out.println("Seleccionar: ");
            opt = input.nextInt();
            System.out.println("Tu seleccionaste: " + opt);
            input.nextLine(); // Limpiar el buffer
            switch (opt) {
                case 1:
                    System.out.println("****** 1 Listar *****");
            
                    System.out.println("ID \t Nombre ");
                    for (Alumno A : pData.listaAlumno ) {
                        System.out.println(A.getId() + "\t" + A.getNombre());
                    }
                    break;
                case 2:
                    System.out.println("**** 2 Nuevo ****");
                    Alumno A = new Alumno();
                    System.out.print("Ingrese Nombre: ");
                    A.setNombre(input.nextLine());
                    System.out.print("Ingrese Apellido Paterno: ");
                    A.setAPaterno(input.nextLine());
                    System.out.print("Ingrese Apellido Materno: ");
                    A.setAMaterno(input.nextLine());
                
                    pData.create(A);
                    break;
              
                case 3  :
                    System.out.println("**** 3 Eliminar ****");
                    System.out.print("Ingrese ID a eliminar: ");
                    pData.delete(input.nextInt());
                    input.nextLine();
                    break;

                case 0:
                    System.out.println("Salir ");
                    break;
                default:
                    System.out.println("Incorrecto");
                    break;
            }
        } while (opt != 0);

    }
}