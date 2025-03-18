/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treinojava;

/**
 *
 * @author alunolab11
 */
import java.util.Random;
import java.time.Year;
public class Aluno {
    String matricla,nome,curso,turma;
    int periodo;
    double nota1,nota2,notaFinal;
    int static alunos=0;
    
    
    public Aluno(String nome, String curso, String turma, int periodo, double nota1,double nota2 ){
        this.nome=nome;
        this.curso=curso;
        this.turma=turma;
        this.periodo=periodo;
        this.nota1=nota1;
        this.nota2=nota2;
        alunos++;
    }
    
   public void passar(){
    periodo++;
}
   
   
   public void gerarMatricula(){
       Random rand= new Random();
       int numero= rand.nextInt(10000);
       int ano= Year.now().getValue();
   }
   
    
    
    
    
}