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
public class AutomotorC {
    private String cedulaDuenio;
    private int anioFabricacion;
    private double valorVehiculo;
    private Fabricante fabricante;
    private double valorMatricula;
    public AutomotorC(String c,  int a, double vv, Fabricante f){
        cedulaDuenio = c;
        anioFabricacion = a;
        valorVehiculo = vv;
        fabricante = f;
        
    }

    public String obtenerCedulaDuenio() {
        return cedulaDuenio;
    }

    public void esablecerCedulaDuenio(String x) {
        cedulaDuenio = x;
    }

    public int obtenerAnioFabricacion() {
        return anioFabricacion;
    }

    public void esablecerAnioFabricacion(int x) {
        anioFabricacion = x;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public void esablecerValorVehiculo(double x) {
        valorVehiculo = x;
    }

    public Fabricante obtenerFabricante() {
        return fabricante;
    }

    public void esablecerFabricante(Fabricante x) {
        fabricante = x;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    public void calcularValorMatricula() {
        valorMatricula = (valorVehiculo * 0.002)*anioFabricacion;
    }
    @Override
    public String toString() {
        String x = String.format("Cedula dueño: %s\n"
                + "Año de fabricacion: %d\n"
                + "Valor Vehiculo: %.2f\n"
                + "Valor Matricula: %.2f\n"
                + "Fabricante: %s\n"
                + "Ciudad de origen : %s\n",
                obtenerCedulaDuenio(),
                obtenerAnioFabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula(),
                obtenerFabricante().obtenerNombreFabricante(),
                obtenerFabricante().obtenerCiudadOrigen());
        return x;
    }
}
