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
public class Cursos {
    private String nome;
    private List<Aluno>stus=new ArrayList<>();;

    public Cursos(String nome) {
        this.nome = nome;
       
        
    }
    public void addstu(Aluno stu)
    {
        stus.add(stu);
        if(stu.getCurso().contains(this))
        {
            System.out.print("Já está contido");
        }
        else{
        stu.setCurso((List<Cursos>) this);
        }
    }

    @Override
    public String toString() {
        return "Cursos{" + "nome=" + nome + ", stus=" + stus + '}';
    }

    
    
}
