package C24B4;
import java.util.Arrays;
import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args) {
/*
        int contador =0;

        while (contador<5){
            System.out.println("El valor de contador es "+contador);
            contador++;
        }

        do{
            System.out.println("El valor de contador es "+contador);
            contador++;
        }while (contador<5 );

*/

        String[] miArreglo = {"Hola","Clase","Como", "Estan"};

        for (int i=0;i < miArreglo.length;i++){
            System.out.println(miArreglo[i]);
        }
                                  //recorramelo
        //Arrays.stream(miArreglo).forEach(System.out::println);
        Arrays.stream(miArreglo).map(String::toUpperCase).forEach(System.out::println);


    }
}

