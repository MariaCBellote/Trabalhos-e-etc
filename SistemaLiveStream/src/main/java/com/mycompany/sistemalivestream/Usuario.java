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
public  class Usuario implements Espectador{
    private String nome,email,senha;
    private Set <Streamer> inscricao=new HashSet<>();
    
    public Usuario(String n,String e, String s)
    {
        this.nome=n;
        this.email=e;
        this.senha=s;
        
    }
    
    public void exibirPerfil(){
        System.out.println( "Nome: "+getNome()+"|"+ "Email "+getEmail());
    }  
    
    public String editarPerfil(String nome, String email)
    {
        this.nome=nome;
        this.email=email;
        return "Nome e email atualizados para: "+ getNome()+"|"+getEmail();
    }
    
    public void trocarSenha(String s){
        if(!s.equals(this.senha)){
            this.senha=s;
            System.out.println (this.senha);
        }
        else{
         System.out.println ("Essa senha já está sendo utilizada: "+ getSenha());
        }
    }
    
    @Override
    public void sairLive(Streamer s){
         Transmissao t= s.getStreamsOn();
         t.getViewer().remove(this);
         System.out.println(getNome()+" saiu da live "+t.getTitulo());
    }
    
    @Override
    public void enviarDonate(Double doacao, Streamer s,String msg)
    {
       if(doacao>=1) {
           System.out.println("Donate de "+doacao+" enviiada para "+ s+" por "+getNome()+"|"+msg);
           s.setPoupanca(s.getPoupanca()+doacao);
       }
       else{
           System.out.println("Apenas valores maiores que 1 real!!");
    }
    }
    
    @Override
    public void assistirStream(Streamer s) //já q um streamer n faz duas lives ao mesmo tempo
    {
        Transmissao t= s.getStreamsOn();
        if(t.isEstado()){
            System.out.println(getNome()+" entrou na stream de "+s+", "+t.getTitulo());
            t.addViewer(this);
        }
        else
        {
            System.out.println("Essa stream já foi encerrada");
        }
    }
    
    @Override
    public void seguirStreamer(Streamer s)
    {
        if(!inscricao.contains(s)){
            inscricao.add(s);
            s.getSeguidores().add(this);
        }
    }
    
    @Override
    public void cancelarInscricao(Streamer s){
        inscricao.remove(s);
        s.removerSeguidor(this);
    }
    
    @Override
    public void listarSeguindo(){
        System.out.println(getNome()+" está seguindo:");
        for(Streamer s:inscricao){
            System.out.println(s.getNome());
        }
    }
    
    public  String getTipoConta(){
        return "Usuário Comum.";
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return  nome ;
    }

    public Set<Streamer> getInscricao() {
        return inscricao;
    }

    public void setInscricao(Set<Streamer> inscricao) {
        this.inscricao = inscricao;
    }
    
    
}
