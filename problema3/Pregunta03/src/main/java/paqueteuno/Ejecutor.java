/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.Fabricante;

/**
 *
 * @author busta
 */
public class Ejecutor {
    public static void main(String[] args) {
        Fabricante fabricante = new Fabricante();
        fabricante.establecerNombreFabricante("Mazda");
        fabricante.establecerCiudadOrigen("Hiroshima Japón");
        
        AutomotorC automotor = new AutomotorC("1105446544", 1990,995.00,
                fabricante);
        automotor.calcularValorMatricula();
        System.out.printf("%s",automotor);
    }
}
