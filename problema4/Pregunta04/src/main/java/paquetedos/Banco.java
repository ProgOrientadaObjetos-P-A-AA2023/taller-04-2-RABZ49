/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author busta
 */
public class Banco {
    private String nombreBanco;
    private int numeroSucursales;
    
    public Banco(){
    nombreBanco = "x";
    numeroSucursales = 0;
    
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public void esablecerNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public int obtenerNumeroSucursales() {
        return numeroSucursales;
    }

    public void esablecerNumeroSucursales(int numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }
}
