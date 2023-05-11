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
public class ProfesorD {

    private String nombre ;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private Provincia provincia;
    
    public ProfesorD(String n,String a,double sueldoB,String c,Provincia p){
    nombre = n;
    apellido = a;
    sueldoBasico = sueldoB;
    cedula = c;
    provincia = p;
    
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void esablecerNombre(String x) {
        nombre = x;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void esablecerApellido(String x) {
        apellido = x;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public void esablecerSueldoBasico(double x) {
        sueldoBasico = x;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = (sueldoBasico * 0.20)+sueldoBasico;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void esablecerCedula(String x) {
        cedula = x;
    }

    public Provincia obtenerProvincia() {
        return provincia;
    }

    public void esablecerProvincia(Provincia x) {
        provincia = x;
        
    }

    @Override
    public String toString() {
        String x = String.format("Nombre Profesor: %s\n"
                + "Apellido Profesor: %s\n"
                + "Cedula: %s\n"
                + "Nombre provincia: %s\n"
                + "Numero de habitantes: %d\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n",obtenerNombre(),
                obtenerApellido(),
                obtenerCedula(),
                obtenerProvincia().obtenerNombreP(),
                obtenerProvincia().obtenerHabitantes(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal() );
        return x;
    }
}
