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
public class Editora {
    private String nome,email;
    private List<Livro> livros;

    public Editora(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.livros=new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public List<Livro> getLivros() {
        return livros;
    }
    
    public void SetLivro(Livro livro){
        if(!livros.contains(livro))
        {
            this.livros.add(livro);
            if(!livro.getEditora().equals(this))
            {
                livro.SetEditora(this);
            System.out.println("Adicionado Livro");
        }
        }
    }
}
