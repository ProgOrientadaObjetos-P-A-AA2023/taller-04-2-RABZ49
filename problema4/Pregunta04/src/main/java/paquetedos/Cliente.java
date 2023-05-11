/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author busta
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private String cedula ;
    public Cliente(){
    nombre = "x";
    apellidos = "x";
    cedula = "x";
    
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public void establecerApellidos(String x) {
        apellidos = x;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String x) {
        cedula = x;
    }
}
