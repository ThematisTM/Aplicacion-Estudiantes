
package aplicacion.estudiantes;
import java.util.ArrayList;
import java.util.Scanner;

public class Estudiantes {
    private String nombre;
    private int edad;
    private double notaFinal;

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
        while (true) {
            System.out.print("¿Cuántos estudiantes deseas registrar? ");
            if (scanner.hasNextInt()) {
                cantidad = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner
                if (cantidad >= 1) {
                    break;
                } else {
                    System.out.println("La cantidad debe ser mayor a 0. Intenta de nuevo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingresa un número entero.");
                scanner.nextLine(); // Limpiar la entrada inválida
            }
        }
        
        ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
        
        System.out.println("\n--- Registrar estudiantes ---");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nEstudiante " + (i + 1) + ":");
            
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine().trim();
            while (nombre.isEmpty()) {
                System.out.print("El nombre no puede estar vacío. Nombre: ");
                nombre = scanner.nextLine().trim();
            }
            
            int edad = 0;
            while (true) {
                System.out.print("Edad: ");
                if (scanner.hasNextInt()) {
                    edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner después de nextInt()
                    if (edad > 15) {
                        break;
                    } else {
                        System.out.println("La edad debe ser mayor a 15. Intenta de nuevo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, ingresa un número entero para la edad.");
                    scanner.nextLine(); // Limpiar la entrada inválida
                }
            }
            
            double notaFinal = 0.0;
            while (true) {
                System.out.print("Nota Final: ");
                if (scanner.hasNextDouble()) {
                    notaFinal = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer del scanner después de nextDouble()
                    if (notaFinal >= 0.0 && notaFinal <= 10.0) {
                        break;
                    } else {
                        System.out.println("La nota debe estar entre 0.0 y 10.0. Intenta de nuevo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, ingresa un número decimal para la nota.");
                    scanner.nextLine(); // Limpiar la entrada inválida
                }
            }
            
            listaEstudiantes.add(new Estudiantes(nombre, edad, notaFinal));
        }
        
        scanner.close();
        return listaEstudiantes;
    }

    /*public static Estudiantes[] crearListaEstudiantes() {
        Estudiantes[] estudiantes = new Estudiantes[8];
        
        estudiantes[0] = new Estudiantes("Juan Pérez", 20, 6.5);
        estudiantes[1] = new Estudiantes("María García", 21, 7.0);
        estudiantes[2] = new Estudiantes("Carlos López", 19, 5.2);
        estudiantes[3] = new Estudiantes("Ana Martínez", 20, 6.8);
        estudiantes[4] = new Estudiantes("Pedro Sánchez", 22, 4.5);
        estudiantes[5] = new Estudiantes("Laura Rodríguez", 20, 6.3);
        estudiantes[6] = new Estudiantes("Diego Fernández", 21, 3.7);
        estudiantes[7] = new Estudiantes("Sofia Gómez", 19, 5.9);
        
        return estudiantes;*/
    }
