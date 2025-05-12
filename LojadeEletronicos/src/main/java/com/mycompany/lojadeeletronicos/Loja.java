/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojadeeletronicos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author Usuario
 */
public class Loja {
    private List<Produto> estoque=new ArrayList<>();
    private Set<String> categorias=new HashSet<>();
    private Map<Integer, Produto> mapaProdutos=new HashMap<>();
     
    public void addProduto(Produto produto){
      
       if(!estoque.contains(produto)) 
       {
          estoque.add(produto);
          mapaProdutos.put(produto.getId(), produto);
           if(!categorias.contains(produto.getMarca()))
           {
               categorias.add(produto.getMarca());
           }
           
       }
    }
    
    public void buscarProduto(int id){
        if(mapaProdutos.get(id)!=null){
        System.out.println(mapaProdutos.get(id));
        }
        else{
        System.out.println("Produto não está registrado.");
        }
    }
    
    public void exibirProdutoCategoria(String marca){
        System.out.println("Categoria: "+marca.toUpperCase());
        boolean a=false;
        for(Produto p: estoque){
            if(marca.equalsIgnoreCase(p.getMarca()))
            {
               System.out.println(p);
               a=true;
        }
    }
        if(a==false){
           System.out.println("Marca não encontrada.");
        }
    }
    
    

public void listarCategorias(){
         System.out.println("CATEGORIAS:");
        for(String cat: categorias)
        {
            System.out.println(cat);
        }
    }
}
