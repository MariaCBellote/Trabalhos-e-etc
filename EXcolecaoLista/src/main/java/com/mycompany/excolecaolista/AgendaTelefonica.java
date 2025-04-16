/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excolecaolista;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author alunolab08
 */
public class AgendaTelefonica {
     private List<Contato> listaContato; 
    
    public AgendaTelefonica(){
        this.listaContato=new ArrayList<>();
    }
    public void inserir(String n, String num)
    {
        
        Contato contato= new Contato(n,num);
        listaContato.add(contato);
    }
    
    public Contato buscar(String n)
    {
        for(Contato aux:this.listaContato)
        {
            if(aux.getNome().equalsIgnoreCase(n))
            {
                System.out.println("Contato: "+aux);
                return aux;
            }
        }
         return null;
      
       
    }
    
    public void remover(String n){
      /* Contato deletar=null;
       for(Contato aux: this.listaContato)
       {
           if(aux.getNome().equalsIgnoreCase(n))
           {
               deletar=aux;
           }
       }*/
      Contato deletar=buscar(n);
       if(deletar!=null)
       {
           this.listaContato.remove(deletar);
           System.out.println("Deletado");
       }
       else{
            System.out.println("Não encontrado");
       }
       
    }
    
    public int tamanho(){
        return listaContato.size();
    }
    
    public void imprimir(){
        if(this.listaContato.isEmpty())
                {
                   System.out.println("Vazio.");
                }
        else{
        for(Contato contato: this.listaContato)
        {
           System.out.println("Contato: "+ contato);
        }
                }
    }
}
