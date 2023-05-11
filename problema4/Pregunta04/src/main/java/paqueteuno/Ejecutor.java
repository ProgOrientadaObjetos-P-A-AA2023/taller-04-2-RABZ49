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
public class Ejecutor {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.establecerNombre("Roberto");
        cliente.establecerApellidos("Bustamante");
        cliente.establecerCedula("1105446544");
        
        Banco banco = new Banco();
        banco.esablecerNombreBanco("Produbanco");
        banco.esablecerNumeroSucursales(20);
        
        BancoD bancoD = new BancoD(1500, banco, cliente);
        bancoD.calcularComisionBanco();
        System.out.printf("%s",bancoD);
    }
}
