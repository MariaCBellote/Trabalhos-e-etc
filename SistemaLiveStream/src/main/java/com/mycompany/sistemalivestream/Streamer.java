/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemalivestream;

/**
 *
 * @author Usuario
 */
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class Streamer extends Usuario {
    private Set<Transmissao> streams;
    private double poupanca;
    private Set<Usuario> seguidores;

    public Streamer(String n, String e, String s) {
        super(n, e, s);
        streams = new HashSet<>();
        seguidores = new HashSet<>();
    }
    
    public void listarStreams(){
         System.out.println("Streams de: "+getNome());
        for(Transmissao t: streams){
            System.out.println(t);
        }
    }
    
    public void removerSeguidor(Usuario u){
        if(seguidores.contains(u)){
        seguidores.remove(u);
        u.getInscricao().remove(this);
        }
        
    }
    
    public void TotalSeguidores(){
        System.out.println("Total de seguidores de "+getNome()+":"+seguidores.size());
    }
    
    public void totalAdquirido(){
        System.out.printf("Total de poupança:%.2f \n",getPoupanca());
    }
    
    
    
    public void abrirStream(String n,Plataforma p){
        if(getStreamsOn()==null){
      Transmissao stream=new Transmissao(n);
          stream.setEstado(true);
          stream.setStreamer(this);
          stream.imprimirEstado();
          streams.add(stream);
          p.armazenarStream(stream);
          
        }
        else{
            System.out.println("Você já está em live!");
        }
      
    }
    
    public void encerrarStream(){
       
                Transmissao t=getStreamsOn();
                t.encerrarStream();
                System.out.println(getNome()+" encerrou a live "+t.getTitulo()+". Total de views: "+t.getVisualizacoes());
            
        
    }
    
    

    public Transmissao getStreamsOn() {
        for (Transmissao t : streams) {
            if (t.isEstado()) {
                return t;
            }
        }
        return null;
    }
    
    public void banirViewer(Usuario u){
        Transmissao t=getStreamsOn();
        
            if(t.getViewer().contains(u)){
            t.getViewer().remove(u);
            System.out.println(u.getNome() + " foi banido(a) da live.");
            }
    
    
    }

    public void setStreams(Set<Transmissao> streams) {
        this.streams = streams;
    }

    public double getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(double poupanca) {
        this.poupanca = poupanca;
    }

    public Set<Usuario> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(Set<Usuario> seguidores) {
        this.seguidores = seguidores;
    }
    
    

    
}
