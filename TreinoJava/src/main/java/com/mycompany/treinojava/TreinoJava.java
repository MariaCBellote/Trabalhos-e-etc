/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.treinojava;

/**
 *
 * @author alunolab08
 */
public class TreinoJava {

    public static void main(String[] args) {
       
       Aluno aluno1= Aluno.perguntar();
       aluno1.mostrar();
       Aluno aluno2=Aluno.perguntar() ;
       aluno2.mostrar();
       Aluno aluno3= Aluno.perguntar();
       aluno1.mostrar();
       Aluno.quantidadeAlunos();
    }
}


