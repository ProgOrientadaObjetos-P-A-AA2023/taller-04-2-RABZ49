/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author busta
 */
public class Fabricante {
    private String nombreFabricante;
    private String ciudadOrigen;
    
    public Fabricante(){
    nombreFabricante = "x";
    ciudadOrigen = "x";
    
    }

    public String obtenerNombreFabricante() {
        return nombreFabricante;
    }

    public void establecerNombreFabricante(String x) {
        nombreFabricante = x;
    }

    public String obtenerCiudadOrigen() {
        return ciudadOrigen;
    }

    public void establecerCiudadOrigen(String x) {
        ciudadOrigen = x;
    }
}
