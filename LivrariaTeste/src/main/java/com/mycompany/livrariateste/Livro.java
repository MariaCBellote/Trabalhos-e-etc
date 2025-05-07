/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livrariateste;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab08
 */
public class Livro {
    private String titulo;
    private int ano;
    private Editora editora;
    private List <Autor> autores;

    public Livro(String titulo, int ano, Editora editora) {
        this.titulo = titulo;
        this.ano = ano;
        this.editora=editora;
        this.autores= new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public Editora getEditora() {
        return editora;
    }

    public List<Autor> getAutores() {
        return autores;
    }
    

    public void SetEditora(Editora editora){
       if(!editora.getLivros().contains(this))
       {
           this.editora= editora;
           System.out.println("Adicionado editora");
       }
    }
    
   public void addAutor(Autor autor)
   {
       if(!autores.contains(autor))
       {
           autores.add(autor);
            System.out.println("Adicionado autor");
           if(!autor.getLivros().contains(this))
           {
               autor.addLivro(this);
               System.out.println("Adicionado livro");
           }
       }
   }
   public void imprimirAutor(){
        for (Autor aux: autores)
        {
             System.out.println("Autor: "+aux);
        }
   }
}
    
    
    

