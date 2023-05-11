/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author busta
 */
public class Provincia {
    private String nombreP;
    private int habitantes;
    public Provincia(){
    nombreP = "x";
    habitantes = 0;
    
    }

    public String obtenerNombreP() {
        return nombreP;
    }

    public void establecerNombreP(String x) {
        this.nombreP = x;
    }

    public int obtenerHabitantes() {
        return habitantes;
    }

    public void establecerHabitantes(int x) {
        this.habitantes = x;
    }
}
