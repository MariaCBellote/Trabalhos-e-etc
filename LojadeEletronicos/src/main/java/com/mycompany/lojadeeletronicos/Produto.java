/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojadeeletronicos;

/**
 *
 * @author Usuario
 */
public class Produto {
    private String nome,marca;
    private int id;
    private double preco;

    public Produto(String nome, String marca, int id, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.id = id;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto:" + "\n"+"Nome=" + nome + "| marca=" + marca + "| id=" + id + "| preco=" + preco;
    }
    
    
}
