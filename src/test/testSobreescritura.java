package test;

import domain.Gerente;

public class testSobreescritura {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alfredo", 1500, "Sistemas");
        System.out.println(gerente.obtenerDetalles());
    }
    
}
