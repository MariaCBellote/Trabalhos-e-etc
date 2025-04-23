/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bidirecional;

/**
 *
 * @author alunolab08
 */
public class Bidirecional {

    public static void main(String[] args) {
        Professor p=new Professor("Jonas");
        Aluno a=new Aluno("Julia");
        Aluno b=new Aluno("Romildo");
        Cursos c=new Cursos("Computaria");
        a.setProf(p);
        p.addaluno(a);
        p.addaluno(b);
        c.addstu(b);
        c.addstu(a);
        System.out.print(c);
        System.out.print(p);
        System.out.print(a);
    }
}
