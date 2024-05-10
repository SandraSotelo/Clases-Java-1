package C24_Interfaz_Coche;
import java.util.Scanner;

public class MainC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coche1 coche = new Coche1();

        System.out.println("Aplicando interfaces");

        coche.acelerar(50);
        coche.frenar();

        scanner.close();

    }

}