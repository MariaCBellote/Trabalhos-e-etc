/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinteconta;

/**
 *
 * @author alunolab08
 */
public class Conta {
  private double saldo;
  

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double i){
        if(i<=saldo){
        this.saldo=this.saldo-i;
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void depositar(double i){
        this.saldo= this.saldo+i;
    }
    
    public void aplicarRendimento(){
        
    }

    @Override
    public String toString() {
        return   "Saldo=" + saldo;
    }
    
}
