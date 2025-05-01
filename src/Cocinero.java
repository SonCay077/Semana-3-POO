import java.util.Scanner;

public class Cocinero {
    private String nombre;
    private String especialidad;
    private int experiencia;

    public Cocinero(String nombre, String especialidad, int experiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }

    public void mostrar() {
        System.out.println("--- Información de Cocinero ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Experiencia: " + experiencia + " años");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        System.out.print("Ingrese la cantidad de cocineros a ingresar: ");
        cantidad = sc.nextInt();
        sc.nextLine();
        Cocinero[] cocineros = new Cocinero[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del cocinero #" + (i + 1) + ":");
            String nombre = sc.nextLine();

            System.out.println("Ingrese la especialidad del cocinero #" + (i + 1) + ":");
            String especialidad = sc.nextLine();

            System.out.println("Ingrese la experiencia del cocinero #" + (i + 1) + ":");
            int experiencia = sc.nextInt();
            sc.nextLine();

            cocineros[i] = new Cocinero(nombre, especialidad, experiencia);
        }

        System.out.println("\n--- Lista de Cocineros ---");
        for (Cocinero cocinero : cocineros) {
            cocinero.mostrar();
        }

        sc.close();
    }
}