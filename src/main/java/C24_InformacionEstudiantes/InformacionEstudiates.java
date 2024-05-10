package C24_InformacionEstudiantes;

import java.util.Scanner;

import java.util.Scanner;

public class InformacionEstudiates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arregloEdades = new int[5];
        float promedio;



        System.out.println("Ingrese la edad del estudiante nro 1");
        int edad1 = scanner.nextInt();

        arregloEdades[0] = edad1;

        System.out.println("Ingrese la edad del estudiante nro 2");
        int edad2 = scanner.nextInt();

        arregloEdades[1] = edad2;

        System.out.println("Ingrese la edad del estudiante nro 3");
        int edad3 = scanner.nextInt();

        arregloEdades[2] = edad3;

        System.out.println("Ingrese la edad del estudiante nro 4");
        int edad4 = scanner.nextInt();

        arregloEdades[3] = edad4;

        System.out.println("Ingrese la edad del estudiante nro 5");
        int edad5 = scanner.nextInt();

        arregloEdades[4] = edad5;

        promedio = (arregloEdades[0]+arregloEdades[1]+arregloEdades[2]+arregloEdades[3]+arregloEdades[4])/5;

        System.out.println("El promedio es: " +promedio);

        scanner.close();
    }

}
