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
    Conta c1= new Conta();
    c1.numero=10;
    c1.saldo=2000;
    c1.limite=1000;
    
        Cliente cli1= new Cliente();
        c1.titular=cli1;
        cli1.perguntar();
        
        Cliente cli2= new Cliente();
        cli2.perguntar();
        cli1.casar(cli2);
        
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
                    
            if(s>c1.limite)
            {
                System.out.println("Você ultrapassou o limite da sua conta!");
                System.out.println("SAQUE NEGADO!");
            }
            else{
               saldoVelho=c1.saldo;
               c1.sacar(saque); 
            }
            System.out.println("======================");
            System.out.println("Saldo Atual:"+c1.saldo);
            System.out.println("Saldo Anterior:"+saldoVelho);
            System.out.println("======================");
            break;
            case 2:System.out.println("Quanto quer depositar?");
            deposito=scan.nextDouble();
            saldoVelho=c1.saldo;
            c1.depositar(deposito);
            System.out.println("======================");
            System.out.println("Saldo:"+c1.saldo);
            System.out.println("Saldo Anterior:"+saldoVelho);
            System.out.println("======================");
            break;
            default: System.out.println("Invalido!");
            break;
        }
        }while(opcao!=0);
        }
}
        
      
        
