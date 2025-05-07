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
public class Autor {
    private String nome,abreviatura;
    private List <Contato> contatos;
    private List <Livro> livros;

    public Autor(String nome, String abreviatura) {
        this.nome = nome;
        this.abreviatura = abreviatura;
        this.contatos=new ArrayList<>();
        this.livros=new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
    public void addContato(String tipo, String cotato)
    {
        Contato contato= new Contato(tipo,cotato);
        if(!this.contatos.contains(contato))
        {
            contatos.add(contato);
            contato.setAutor(this);
             System.out.println("Adicionado contato");
        }
    }
    
    public void addLivro(Livro livro){
        if(!livros.contains(livro))
        {
            livros.add(livro);
             System.out.println("Adicionado livro");
            if(!livro.getAutores().contains(this))
            {
                livro.addAutor(this);
                 System.out.println("Adicionado autor");
            }
        }
    }
    
    public void imprimirLivro(){
        for (Livro aux: livros)
        {
             System.out.println("Livro: "+aux);
        }
    }
    
    public void imprimirContato(){
        for (Contato aux: contatos)
        {
             System.out.println("Contato: "+aux);
        }
    }

    @Override
    public String toString() {
        return "Autor{" + "nome=" + nome + ", abreviatura=" + abreviatura + '}';
    }
    
    
}
