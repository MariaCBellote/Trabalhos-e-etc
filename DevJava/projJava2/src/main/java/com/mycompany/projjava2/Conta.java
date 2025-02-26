/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projjava2;

/**
 *
 * @author alunolab08
 */
public class Conta {
    int numero;
    String nome;
    double saldo, limite;
    
    public void sacar(double valor)
    {
        if(saldo<valor)
        {
            System.out.println("Saldo insuficiente!!!!!");
            System.out.println("SAQUE NEGADO!");
            
        }
        else{
        saldo= saldo-valor;
        
        }
    }
    public void depositar(double valor){
        saldo=saldo+valor;
    }
}
