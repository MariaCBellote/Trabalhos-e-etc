/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projjava2;

/**
 *
 * @author alunolab08
 */
import java.util.Scanner;
public class ProjJava2 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("CONTA!");
        System.out.println("------");
        int opcao;
        double saque,deposito,s=0,saldoVelho=0;
        Conta c = new Conta();
        System.out.println("Digite o numero de sua conta: ");
        c.numero=scan.nextInt();
        System.out.println("Nome: ");
        c.nome=scan.next();
        System.out.println("Digite o limite de sua conta: ");
        c.limite=scan.nextDouble();
        System.out.println("Digite o saldo de sua conta: ");
        c.saldo=scan.nextDouble();
        do
        {
        System.out.println(" (0)SAIR (1)SAQUE ou (2)DEPOSITO: ");
        opcao= scan.nextInt();
        
        switch(opcao)
        {
            case 0: System.out.println("Saindo!");
            break;
            case 1: System.out.println("Quanto deseja sacar?");
            saque=scan.nextDouble();
            s= saque+s;
                    
            if(s>c.limite)
            {
                System.out.println("Você ultrapassou o limite da sua conta!");
                System.out.println("SAQUE NEGADO!");
            }
            else{
               saldoVelho=c.saldo;
               c.sacar(saque); 
            }
            System.out.println("======================");
            System.out.println("Saldo Atual:"+c.saldo);
            System.out.println("Saldo Anterior:"+saldoVelho);
            System.out.println("======================");
            break;
            case 2:System.out.println("Quanto quer depositar?");
            deposito=scan.nextDouble();
            saldoVelho=c.saldo;
            c.depositar(deposito);
            System.out.println("======================");
            System.out.println("Saldo:"+c.saldo);
            System.out.println("Saldo Anterior:"+saldoVelho);
            System.out.println("======================");
            break;
            default: System.out.println("Invalido!");
            break;
        }
        }while(opcao!=0);
        }
}
        
      
        
