/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.Provincia;

/**
 *
 * @author busta
 */
public class Ejecutor {
    public static void main(String[] args) {
        Provincia provincia = new Provincia();
        provincia.establecerNombreP("Loja");
        provincia.establecerHabitantes(214855);
        
        ProfesorD profesor = new ProfesorD("Rene", "Elizalde", 
                25000, "1105664533", provincia);
        profesor.calcularSueldoTotal();
        System.out.printf("%s", profesor);
    }
}
