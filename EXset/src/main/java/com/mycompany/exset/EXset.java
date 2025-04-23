/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exset;

/**
 *
 * @author Usuario
 */
public class EXset {

    public static void main(String[] args) {
       Evento e=new Evento("São joao");
       e.addParts("joao", "mdaakdj@gmail.com");
       e.addParts("ana", "sjdhlk@hotmail");
       e.imprimir();
       e.remover("mdaakdj@gmail.com");
       e.imprimir();
       
    }
}
