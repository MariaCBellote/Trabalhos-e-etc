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
    private List<Aluno> alunos=new ArrayList<>();;

    public Professor(String nome) {
        this.nome = nome;
        
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    
    public void addaluno(Aluno aluno){
       
       alunos.add(aluno);
       if(aluno.getProf().equals(this))
       {
           System.out.print("Já está contido");
       }
       else{
       aluno.setProf(this);
       }
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", alunos=" + alunos + '}';
    }

    
            
}
