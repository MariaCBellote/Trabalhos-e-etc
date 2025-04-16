/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excolecaolista;

/**
 *
 * @author alunolab08
 */
public class Contato {
     private String numero;
    private String nome;

    public Contato(String nome, String numero) {
        this.numero = numero;
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Contato{" + "numero=" + numero + ", nome=" + nome + '}';
    }

}
