/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projjava2;

import java.util.Scanner;

/**
 *
 * @author alunolab09
 */
public class Cliente {
    String nome;
    String sobrenome;
    String cpf;
    Cliente conjuge;
    
    public void casar(Cliente conjuge){
        if(this.conjuge !=null){
            this.conjuge=conjuge;
            this.conjuge.conjuge=this;
        }
        else{
            System.out.println("Já está casado.");
        }
    }
    
    public void perguntar(){
          Scanner scan= new Scanner(System.in);
          System.out.println("Nome: ");
          nome=scan.next();
          System.out.println("Sorenome: ");
          sobrenome=scan.next();
          System.out.println("CPF: ");
          cpf=scan.next();
          
          
    }
}
