/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.Universidad;

/**
 *
 * @author busta
 */
public class Ejecutor {

    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        universidad.establecerNombreU("Universidad Tecnica Particular de "
                + "Loja");
        universidad.establecerDireccionU("San Cayetano Alto, C. París");
        UniversidadData unidata = new UniversidadData("Roberto Busamante",
                10, 9, 8.5, universidad);
        unidata.calcularPromedioCalificaciones();
        System.out.println(unidata);
    }
}
