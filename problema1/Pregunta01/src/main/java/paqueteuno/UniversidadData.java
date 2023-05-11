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
public class UniversidadData {

    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedioCalificaciones;
    private Universidad universidad;

    public UniversidadData(String n, double m1, double m2, double m3,
            Universidad u) {
        nombreEstudiante = n;
        calificacionMateria1 = m1;
        calificacionMateria2 = m2;
        calificacionMateria3 = m3;
        universidad = u;

    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public void establecerNombreEstudiante(String x) {
        nombreEstudiante = x;
    }

    public double obtenerCalificacionMateria1() {
        return calificacionMateria1;
    }

    public void establecerCalificacionMateria1(double x) {
        calificacionMateria1 = x;
    }

    public double obtenerCalificacionMateria2() {
        return calificacionMateria2;
    }

    public void establecerCalificacionMateria2(double x) {
        calificacionMateria2 = x;
    }

    public double obtenerCalificacionMateria3() {
        return calificacionMateria3;
    }

    public void establecerCalificacionMateria3(double x) {
        calificacionMateria3 = x;
    }

    public double obtenerPromedioCalificaciones() {
        return promedioCalificaciones;
    }

    public void calcularPromedioCalificaciones() {
        promedioCalificaciones = (calificacionMateria1 + calificacionMateria2
                + calificacionMateria3) / 3;
    }

    public Universidad obtenerUniversidad() {
        return universidad;
    }

    public void establecerUniversidad(Universidad x) {
        universidad = x;
    }

    @Override
    public String toString() {
        String x = String.format(" Nombre de la Universidad: %s\n"
                + " Direccion Universidad: %s\n"
                + " Calificacion materia 1: %.2f\n"
                + " Calificacion materia 2: %.2f\n"
                + " Calificacion materia 3: %.2f\n"
                + " Promedio calificaciones %.2f",
                obtenerUniversidad().obtenerNombreU(),
                obtenerUniversidad().obtenerDireccionU(),
                obtenerCalificacionMateria1(),
                obtenerCalificacionMateria2(),
                obtenerCalificacionMateria3(),
                obtenerPromedioCalificaciones());
        return x;
    }

}
