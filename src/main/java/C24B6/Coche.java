package C24B6;


public class Coche implements InterfaceVehiculo {

    public void acelerar(int velocidad) {
        System.out.println("Acelerando...");
    }

    @Override
    public void acelerar() {

    }

    public void frenar() {
        System.out.println("Frenando...");
    }
}