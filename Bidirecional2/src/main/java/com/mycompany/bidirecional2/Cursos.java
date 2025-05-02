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
public class Cursos {
    private String nome;
    private List<Aluno>stus=new ArrayList<>();;

    public Cursos(String nome) {
        this.nome = nome;
       
        
    }

    public List<Aluno> getStus() {
        return stus;
    }
    
    public void addstu(Aluno stu)
    {
       if(!stus.contains(stu))
       {
           stus.add(stu);
       }
       if(!stu.getCurso().contains(this))
       {
           stu.addCursos(this);
       }
    }

    @Override
    public String toString() {
        return "Cursos{" + "nome=" + nome + ", stus=" + stus + '}';
    }
}
