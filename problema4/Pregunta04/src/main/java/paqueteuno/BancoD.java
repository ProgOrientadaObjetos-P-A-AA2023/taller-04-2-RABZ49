/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.Banco;
import paquetedos.Cliente;

/**
 *
 * @author busta
 */
public class BancoD {
    private double valorCheque;
    private double comisionBanco;
    private Banco banco;
    private Cliente cliente;
    
    public BancoD(double vC, Banco b, Cliente c){
    valorCheque = vC;
    banco = b;
    cliente = c;
    
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public void esablecerValorCheque(double x) {
        valorCheque = x;
    }

    public double obtenerComisionBanco() {
        return comisionBanco;
    }

    public void calcularComisionBanco() {
        comisionBanco = valorCheque * 0.003;
    }

    public Banco obtenerBanco() {
        return banco;
    }

    public void esablecerBanco(Banco x) {
        banco = x;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public void esablecerCliente(Cliente x) {
        cliente = x;
        
        
        
    }

    @Override
    public String toString() {
        String x = String.format("Nombre del banco: %s\n"
                + "Numero de sucursales: %d"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Cedula: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comision del banco: %.2f\n"
                ,obtenerBanco().obtenerNombreBanco(),
                obtenerBanco().obtenerNumeroSucursales(),
                obtenerCliente().obtenerNombre(),
                obtenerCliente().obtenerApellidos(),
                obtenerCliente().obtenerCedula(),
                obtenerValorCheque(),obtenerComisionBanco());
        return x;
    }
}
