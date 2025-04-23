/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class Evento {
    private String nome;
    private Set<Participante> parts;

    public Evento(String nome) {
        this.nome = nome;
        this.parts=new HashSet<>();
    }
    
    public void addParts(String nome,String email)
    {
        
        Participante p=new Participante(nome,email);
        //set não permite repetição de elementos
        /* boolean retorno=parts.add(p);
        if(retorno==true){
         System.out.println("Participante cadastrado: "+ p.getNome()+"|"+p.getEmail());
        }
        else{
        System.out.println("Esse participante já está cadastrado!");
        }
        */
        
            if(parts.contains(p))
            {
                System.out.println("Esse participante já está cadastrado!");
            }
            else{
                parts.add(p);
                System.out.println("Participante cadastrado: "+ p.getNome()+"|"+p.getEmail());
                
            }
        
       
    }
    public void remover(String email)
    {
        
        parts.removeIf(p->p.getEmail().equalsIgnoreCase(email));
    }
    
    public void imprimir(){
        if(parts.isEmpty())
        {
            System.out.println("Nenhum participante cadastrado!"); 
        }
        else{
            for(Participante p: parts){
                System.out.println(p.getNome()+"|"+p.getEmail()); 
            }
        }
    }
    /*
    public void remover(Partiipante p)
    {
    boolean retorno= parts.remove(p);
     if(retorno==true){
         System.out.println("Participante removido;
        }
        else{
        System.out.println("Não foi possível remover");
        }
    
    */
    
}
