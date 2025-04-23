/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bidirecional;

/**
 *
 * @author alunolab08
 */
public class Aluno {
    private String nome;
    private Professor prof;
   

    public Aluno(String nome) {
        this.nome = nome;
    }
    public void setProf(Professor prof){
        this.prof=prof;
       
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", prof=" + prof + '}';
    }
    
}
