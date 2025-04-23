/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bidirecional;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab08
 */
public class Professor {
    private String nome;
    private List<Aluno> alunos;

    public Professor(String nome) {
        this.nome = nome;
        this.alunos=new ArrayList<>();
    }
    
    public void addaluno(Aluno aluno){
       
       alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", alunos=" + alunos + '}';
    }
            
}
