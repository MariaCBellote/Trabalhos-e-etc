/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemalivestream;

/**
 *
 * @author Usuario
 */
public class SistemaLiveStream {

    public static void main(String[] args) {
        Usuario u1=new Usuario("Maria","ammam@gmail.com","123456");
        Usuario u2=new Usuario("Gabs","gbsm@gmail.com","9568f1");
        Usuario u3=new Usuario("Lucas","lucas@gmail.com","@#$1234");
        
        Streamer s1=new Streamer("Gaboo","gaboo@gmail.com","892379091");
        Streamer s2=new Streamer("Luke","luke@gmail.com","akjdhauid");
        
        Plataforma p= new Plataforma();
        
        p.cadastrarUser(u1);
        p.cadastrarUser(u2);
        p.cadastrarUser(u3);
        p.cadastrarUser(s1);
        p.cadastrarUser(s2);
        
       s1.abrirStream("Jogando com a galera",p);
       s2.abrirStream("Cumprindo seus desafios!!",p);
       
       p.mostrarStreams();
       
       u1.assistirStream(s2);
       u2.assistirStream(s2);
       u3.assistirStream(s1);
      
      u1.seguirStreamer(s2);
      s1.seguirStreamer(s2);
      u2.seguirStreamer(s2);
      u1.seguirStreamer(s1);
     
      
      s1.encerrarStream();
      
      p.mostrarStreamsOn();
      s2.banirViewer(u1);
      u2.sairLive(s2);
      p.mostrarStreamsOn();
      
      s2.encerrarStream();
      p.mostrarStreamsEncerradas();
      
      s2.TotalSeguidores();
      u2.cancelarInscricao(s2);
      s2.TotalSeguidores();
      
      u2.editarPerfil("Gabii", "ahndk@yahoo.com");
      
      u2.exibirPerfil();
      
      u2.trocarSenha("auyhwfiaue");
      
      u2.enviarDonate(4.89, s2, "Gosto do seu conteúdo!");
      s2.totalAdquirido();
      u2.enviarDonate(10.76, s2, "Ola");
      s2.totalAdquirido();
      
      u1.listarSeguindo();
      u1.cancelarInscricao(s2);
      u1.listarSeguindo();
      s2.removerSeguidor(s1);
      s2.TotalSeguidores();
      
    }
}
