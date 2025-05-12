/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lojadeeletronicos;

/**
 *
 * @author Usuario
 */
public class LojadeEletronicos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Produto p1=new Produto("Celular","SAMSUNG",1,3600.90);
        Produto p2=new Produto("Computador","Intel",2,2900);
        Produto p3=new Produto("Televisão","SAMSUNG",3,1790.7);
        Produto p4=new Produto("Monitor","LG",4,1960.0);
        Loja l=new Loja();
        l.addProduto(p1);
        l.addProduto(p2);
        l.addProduto(p3);
        l.addProduto(p4);
        l.listarCategorias();
        l.buscarProduto(0);
        l.exibirProdutoCategoria("Brastempe");
        l.exibirProdutoCategoria("intel");
    }
}
