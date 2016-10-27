/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg6;

import java.util.Set;

/**
 *
 * @author fdacostamillos
 */
public class Cuenta {
    private String nombre;
    private int numCuenta, saldo;
    
    public Cuenta(){
        
    }
    
    public Cuenta(String nombre, int numCuenta,int saldo){
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void ingreso(int dinero){
        if (dinero > 0){
        saldo+=dinero;        
        }
        else{
            System.out.println("Ingreso negativo"); 
        }      
    }
    
    public void reintegro(int dinero){
        if (saldo>dinero){
            saldo-=dinero;
        }
        else{
            System.out.println("Dinero insuficiente");
        }
    }
    
    public void visualizar(){
        System.out.println("El nombre del cliente es: " + nombre + " el numero de cuenta es: "+ numCuenta + " y el saldo es: " + saldo);
    }
    
    public void transferencia(Cuenta cuentita, int dinero) {
        cuentita.setSaldo(dinero + cuentita.getSaldo());
        saldo -= dinero;                
    }
    
    
}

