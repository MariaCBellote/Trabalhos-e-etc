/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livrariateste;

/**
 *
 * @author alunolab08
 */
public class Contato {
    private String tipo,contato;
    private Autor autor;

    public Contato(String tipo, String contato) {
        this.tipo = tipo;
        this.contato = contato;
    }
    
    

    public String getTipo() {
        return tipo;
    }

    
    public String getContato() {
        return contato;
    }

    

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Contato{" + "tipo=" + tipo + ", contato=" + contato + ", autor=" + autor + '}';
    }

   
    
    
}
