/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemalivestream;

/**
 *
 * @author Usuario
 */
public interface Espectador {
    public void enviarDonate(Double doacao, Streamer s,String msg);
    public void assistirStream(Streamer s);
    public void seguirStreamer(Streamer s);
    public void listarSeguindo();
    public void cancelarInscricao(Streamer s);
    public void sairLive(Streamer s);
    
}
