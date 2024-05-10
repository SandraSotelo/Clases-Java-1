package C24_Ejercicio_Numeros_Pares;

import java.util.Arrays;
import java.util.List;


public class NumerosParesDeLista {

    public static void main(String[] args) {
        // int num;
        List<Integer> numeros= Arrays.asList(1,2,3,4,5,6,7,8,9);

        for(int i=0; i<numeros.size(); i++){

            Integer nro = numeros.get(i);
            if(nro%2 == 0){
                System.out.println(nro);
            }
        }

    }

}
