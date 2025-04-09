/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excolecaomapas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alunolab11
 */
public class AgendaTelefonica {
 
    private Map<String,Contato> listaContato= new HashMap<>();  
    
    
    public void inserir(String n, String num)
    {
        Contato contato= new Contato(n,num);
        listaContato.put(n, contato);
    }
    
    public String buscar(String n)
    {
        Contato contato= listaContato.get(n);
        if (contato!=null)
        {
            return contato.getNumero();
        }
        else
        {
            return "Contato não salvo!";
        }
    }
    
    public void remover(String n){
        listaContato.remove(n);
    }
    
    public int tamanho(){
        return listaContato.size();
    }
    
    public void imprimir(){
        for(Contato contato: listaContato.values())
        {
           System.out.println("Contato: "+ contato);
        }
    }
}
