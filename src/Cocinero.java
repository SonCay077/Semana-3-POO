import java.util.Scanner;

public class Cocinero {
    static String nombre;
    static String especialidad;
    static int experiencia;
    public Cocinero(String nombre, String especialidad, int experiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }
    public void mostrar(){
        System.out.println("---Información de Cocinero---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cocinero cocinero = new Cocinero(nombre, especialidad, experiencia);
        System.out.println("Ingrese el nombre del cocinero #1: ");
        cocinero.nombre = sc.nextLine();
        System.out.println("Ingrese el especialidad del cocinero #1: ");
        cocinero.especialidad = sc.nextLine();
        System.out.println("Ingrese el experiencia del cocinero #1: ");
        cocinero.experiencia = sc.nextInt();

        cocinero.mostrar();

        Scanner sc1 = new Scanner(System.in);

        Cocinero cocinero2 = new Cocinero(nombre, especialidad, experiencia);
        System.out.println("Ingrese el nombre del cocinero #2: ");
        cocinero2.nombre = sc.nextLine();
        System.out.println("Ingrese el especialidad del cocinero #2:  ");
        cocinero2.especialidad = sc.nextLine();
        System.out.println("Ingrese el experiencia del cocinero #2: ");
        cocinero2.experiencia = sc.nextInt();

        cocinero2.mostrar();
        Scanner sc2 = new Scanner(System.in);

        Cocinero cocinero3 = new Cocinero(nombre, especialidad, experiencia);
        System.out.println("Ingrese el nombre del cocinero #3: ");
        cocinero3.nombre = sc.nextLine();
        System.out.println("Ingrese el especialidad del cocinero #3: ");
        cocinero3.especialidad = sc.nextLine();
        System.out.println("Ingrese el experiencia del cocinero #3: ");
        cocinero3.experiencia = sc.nextInt();
        sc.close();
        sc1.close();
        sc2.close();


        cocinero3.mostrar();

    }
}