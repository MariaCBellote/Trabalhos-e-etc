/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinteconta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab08
 */
public class Cliente {
   private String nome,cpf;
   private List<Conta> contas=new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        
    }
    
    public void criarConta(int i,double s){
       if(i==0) 
       {
           Conta cc=new ContaCorrente(s);
       }
       else if (i==1){
           Conta cc=new ContaPoupanca(s);
       }
       else{
           System.out.println("Digite 0 caso corrente ou 1 para poupança");
       }
    
       
    }
    public void addConta(Conta conta)
    {  
        if(!contas.contains(conta))
        {
        contas.add(conta);
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
    public void mostrarSaldos(){
        System.out.println("CONTAS:");
        for(Conta i: contas)
        {
            System.out.println("Conta: "+i);
        }
    }
    
    
}
