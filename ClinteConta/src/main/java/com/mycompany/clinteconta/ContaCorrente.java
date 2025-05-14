/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinteconta;

/**
 *
 * @author alunolab08
 */
public class ContaCorrente extends Conta {
    
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double i)
    {
       if(i<=getSaldo()){
       setSaldo(getSaldo()-(i+5));
        }
        else{
            System.out.println("Saldo insuficiente!");
        } 
    }    
    
    @Override
     public void aplicarRendimento(){
        setSaldo(getSaldo()*1.0012);
    }
     
    @Override
    public String toString() {
        return "Corrente";
    }
    
}
