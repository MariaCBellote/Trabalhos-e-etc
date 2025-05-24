/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemalivestream;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class Plataforma {
    private Set <Usuario> users=new HashSet<>();
    private Set <Transmissao> streams=new HashSet<>();
    
    public void cadastrarUser(Usuario u){
        if(!users.contains(u)){
            users.add(u);
        }
    }
    
    public void armazenarStream(Transmissao t){
        if(!streams.contains(t)){
            streams.add(t);
        }
    }
    
    public void mostrarStreams(){
        System.out.println("Streams gerais:");
        for(Transmissao t: streams){
            System.out.println(t.getTitulo()+"|"+t.getStreamer());
        }
        
    }
    
    public void mostrarStreamsOn(){
         for(Transmissao t: streams){
             if(t.isEstado()==true){
             System.out.println(t.getTitulo()+"|"+t.getStreamer()+"| Visualizações simultâneas: "+t.pessoasSimultaneas());
             }
        }
    }
    
    public void mostrarStreamsEncerradas(){
         for(Transmissao t: streams){
             if(t.isEstado()==false){
             System.out.println(t.getTitulo()+"|"+t.getStreamer()+"| Encerrada.");
             }
        }
    }
}
