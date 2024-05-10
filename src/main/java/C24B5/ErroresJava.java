package C24B5;

public class ErroresJava {

    public static void main(String[] args) {

        try {
            int numero = 0;
            if(numero==0){
                //double resultado = 10/10;
                // System.out.println(resultado);
               // Double valor = null;
                //  valor.floatValue();
               // throw new ArrayIndexOutOfBoundsException();
                throw new ArrayIndexOutOfBoundsException("No puede dividir por cero");
            }


        } catch (ArithmeticException e){

            System.out.println(e);
        }catch (NullPointerException e){
            System.out.println(e);
        }catch (RuntimeException e){
            System.out.println(e);
        }

        System.out.println("Continua el programa");

    }


}


