package C24B3;

import java.util.Scanner;

public class numeroMayorMenor {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Ingrese un primer número");
        numero1 = scanner.nextInt();

        System.out.println("Ingrese un segundo número");
        numero2 = scanner.nextInt();

        if(numero1 > numero2){
            System.out.println(numero1+ " es mayor que "+ numero2);
        } else {
            System.out.println( numero1+" es menor que "+numero2);
        }
        scanner.close();
    }

}
