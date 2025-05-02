/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bidirecional2;

/**
 *
 * @author Usuario
 */
public class Bidirecional2 {

    public static void main(String[] args) {
        Professor p=new Professor("Jonas");
        Aluno a=new Aluno("Julia");
        Aluno b=new Aluno("Romildo");
        Cursos c=new Cursos("Computaria");
        
        p.addAluno(a);
        p.addAluno(b);
        c.addstu(b);
        c.addstu(a);
        System.out.print(c);
        System.out.print(p);
        System.out.print(a);
    }
}
