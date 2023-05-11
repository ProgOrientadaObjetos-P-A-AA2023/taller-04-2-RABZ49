/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author busta
 */
public class Universidad {

    private String nombreU;
    private String direccionU;

    public Universidad() {
        nombreU = "x";
        direccionU = "x";

    }

    public String obtenerNombreU() {
        return nombreU;
    }

    public void establecerNombreU(String x) {
        nombreU = x;
    }

    public String obtenerDireccionU() {
        return direccionU;
    }

    public void establecerDireccionU(String x) {
        direccionU = x;
    }
}
