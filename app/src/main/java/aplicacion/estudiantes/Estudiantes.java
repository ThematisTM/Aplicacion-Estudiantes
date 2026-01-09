
package aplicacion.estudiantes;
import java.util.ArrayList;
import java.util.Scanner;

public class Estudiantes {
    public  String nombre;
    public  int edad;
    public  double notaFinal;

    public Estudiantes(String nombre, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public static ArrayList<Estudiantes> readEstudiantes() {
        Scanner scanner = new Scanner(System.in);
        
        int cantidad = 0;
        do {
            System.out.print("¿Cuántos estudiantes deseas registrar? ");
            cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
            
            if (cantidad < 1) {
                System.out.println("La cantidad debe ser mayor a 0. Intenta de nuevo.");
            }
        } while (cantidad < 1);
        
        ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
        
        System.out.println("\n--- Registrar estudiantes ---");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nEstudiante " + (i + 1) + ":");
            
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            
            int edad = 0;
            do {
                System.out.print("Edad: ");
                edad = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner después de nextInt()
                
                if (edad <= 15) {
                    System.out.println("La edad debe ser mayor a 15. Intenta de nuevo.");
                }
            } while (edad <= 15);
            
            System.out.print("Nota Final: ");
            double notaFinal = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer del scanner después de nextDouble()
            
            listaEstudiantes.add(new Estudiantes(nombre, edad, notaFinal));
        }
        
        return listaEstudiantes;
    }

    public static Estudiantes[] crearListaEstudiantes() {
        Estudiantes[] estudiantes = new Estudiantes[8];
        
        estudiantes[0] = new Estudiantes("Juan Pérez", 20, 6.5);
        estudiantes[1] = new Estudiantes("María García", 21, 7.0);
        estudiantes[2] = new Estudiantes("Carlos López", 19, 5.2);
        estudiantes[3] = new Estudiantes("Ana Martínez", 20, 6.8);
        estudiantes[4] = new Estudiantes("Pedro Sánchez", 22, 4.5);
        estudiantes[5] = new Estudiantes("Laura Rodríguez", 20, 6.3);
        estudiantes[6] = new Estudiantes("Diego Fernández", 21, 3.7);
        estudiantes[7] = new Estudiantes("Sofia Gómez", 19, 5.9);
        
        return estudiantes;
    }
}