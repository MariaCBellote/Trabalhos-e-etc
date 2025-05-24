/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemalivestream;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class Transmissao {
    private String titulo;
    private boolean estado;
    private Streamer streamer;
    private int visualizacoes=0;
    private Set <Usuario> viewer;

    public Transmissao(String titulo ) {
        this.titulo = titulo;
        this.viewer=new HashSet<>();
    }
    
    public void imprimirEstado() {
        if (estado) {
        System.out.println("Transmissão "+getTitulo()+" está ao vivo|Feita por: "+getStreamer());
        }
        else {
        System.out.println("Transmissão "+getTitulo()+ " encerrada.|Feita por: "+getStreamer());
        }
    }
    
    public void encerrarStream(){
        this.estado=false;
    }
    public void addViewer(Usuario u){
     if(!viewer.contains(u))
     {
        viewer.add(u);
        this.visualizacoes=this.visualizacoes+1;
     }
    }
     
     public int pessoasSimultaneas(){

         return viewer.size();
    }
 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Streamer getStreamer() {
        return streamer;
    }

    public void setStreamer(Streamer streamer) {
        this.streamer = streamer;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public Set<Usuario> getViewer() {
        return viewer;
    }

    public void setViewer(Set<Usuario> viewer) {
        this.viewer = viewer;
    }
    
    
}
