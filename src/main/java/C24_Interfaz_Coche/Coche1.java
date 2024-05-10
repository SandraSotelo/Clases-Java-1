package C24_Interfaz_Coche;

import C24B6.InterfaceVehiculo;

public class Coche1 implements Interface_Vehiculo {
    @Override
    public void acelerar(int velocidad) {
        System.out.println("Acelerando...");
    }



    @Override
    public void frenar() {
        System.out.println("Frenando...");
    }
}