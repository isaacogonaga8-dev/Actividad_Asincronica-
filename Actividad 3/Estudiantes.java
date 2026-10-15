Actividad 3. Implementación en Java

  
public class Estudiante {
    // Atributos
    String nombre;
    String apellido;
    int edad;
    String carrera;
    int semestre;
}




CODIGO PRINCIPAL=

public class Principal {
    public static void main(String[] args) {

        // Estudiante 1
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Isaac";
        estudiante1.apellido = "Ogonaga";
        estudiante1.edad = 19;
        estudiante1.carrera = "Software";
        estudiante1.semestre = 1;

        // Estudiante 2
        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Julio";
        estudiante2.apellido = "Terán";
        estudiante2.edad = 19;
        estudiante2.carrera = "Software";
        estudiante2.semestre = 1;

        // Estudiante 3
        Estudiante estudiante3 = new Estudiante();
        estudiante3.nombre = "Steven";
        estudiante3.apellido = "Betancourt";
        estudiante3.edad = 19;
        estudiante3.carrera = "Software";
        estudiante3.semestre = 1;

        // Mostrar información
        mostrar(estudiante1, 1);
        mostrar(estudiante2, 2);
        mostrar(estudiante3, 3);
    }

    static void mostrar(Estudiante e, int numero) {
        System.out.println("===== Estudiante " + numero + " =====");
        System.out.println("Nombre: " + e.nombre);
        System.out.println("Apellido: " + e.apellido);
        System.out.println("Edad: " + e.edad);
        System.out.println("Carrera: " + e.carrera);
        System.out.println("Semestre: " + e.semestre);
        System.out.println();
    }
}
