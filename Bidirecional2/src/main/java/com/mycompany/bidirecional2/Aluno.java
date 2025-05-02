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
public class Aluno {
     private String nome;
    private Professor prof;
    private List<Cursos> curso=new ArrayList<>();
   

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Professor getProf() {
        return prof;
    }
    
    public void setProf(Professor prof){
        this.prof=prof;
       if(!prof.getAlunos().contains(this))
       {
           prof.addAluno(this);
       }
        
       
    }

    public List<Cursos> getCurso() {
        return curso;
    }

    public void addCursos(Cursos curso) {
        if(!this.curso.contains(curso))
        {
            this.curso.add(curso);
        }
        if(!curso.getStus().contains(this))
        {
            curso.addstu(this);
        }
    }
      

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", prof=" + prof + '}';
    }

}
