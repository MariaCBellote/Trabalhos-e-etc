/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bidirecional2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Professor {
     private String nome;
    private List<Aluno> alunos=new ArrayList<>();;

    public Professor(String nome) {
        this.nome = nome;
        
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    
   public void addAluno(Aluno aluno) {
    if (!alunos.contains(aluno)) {
        alunos.add(aluno);
    }

    if (aluno.getProf() != this) {
        aluno.setProf(this);
    } else {
        System.out.print("Já está contido");
    }
}

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", alunos=" + alunos + '}';
    }

    
}
