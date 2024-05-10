
package C24B2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donde vives");
        String ciudad = scanner.next();
        System.out.println("Es la mejor ciudad");

        System.out.println("Cual es tu edad");
        String edad = scanner.next();
        System.out.println("Estas muy joven");

        System.out.println("Cual es tu estudio más reciente");
        String estudio = scanner.next();

        System.out.println("Cual es tu teléfono");
        String telefono = scanner.next();



        // Creación de un objeto
        Persona2 persona = new Persona2();
        persona.id = "41954254";

        System.out.println(persona.id);

        Closet2 closet = new Closet2();

        scanner.close();

        }

}