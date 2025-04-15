/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excolecaomapas;

/**
 *
 * @author alunolab11
 */
public class EXcolecaoMapas {

    public static void main(String[] args) {
       AgendaTelefonica ag=new AgendaTelefonica();
       ag.inserir("maria", "1111111");
       ag.inserir("julia", "1011190");
       ag.inserir("romildo", "1111991");
       ag.inserir("jona", "11167761");
       ag.imprimir();
       System.out.println(ag.tamanho());
       ag.remover("jona");
       ag.imprimir();
       ag.buscar("julia");
    }
}
