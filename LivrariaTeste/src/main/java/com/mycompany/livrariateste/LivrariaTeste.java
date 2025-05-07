/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livrariateste;

/**
 *
 * @author alunolab08
 */
public class LivrariaTeste {

    public static void main(String[] args) {
        System.out.println("______________LIVRARIA______________");
        
        Editora e1=new Editora("algo","edti@gmail.com");
        Editora e2=new Editora("algo2","edti@gmail.com.br");
        Livro l1=new Livro("Pequeno Principe",1960,e1);
        Livro l2=new Livro("Memórias do Subsolo",1890,e2);
        Autor a1= new Autor("Roberto","Rob");
        Autor a2= new Autor("Fiodor","Fifi");
               
        a1.addContato("email","jhakjhfh@gmail.com");
        a2.addContato("email","sdsh@gmail.com");
        a1.addContato("ajdj@gmal.com", "emailosxi");
        a1.imprimirContato();
        a2.imprimirContato();
        e1.SetLivro(l2);
        l1.addAutor(a2);
        
        
        
        
        
    }
}
