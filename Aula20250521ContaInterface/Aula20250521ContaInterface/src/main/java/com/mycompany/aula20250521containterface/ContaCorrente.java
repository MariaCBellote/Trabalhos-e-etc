package com.mycompany.aula20250521containterface;

public class ContaCorrente extends Conta implements IPix/*, ICheque,IBitcoin */ {

    public ContaCorrente(double saldo) {
        super(saldo);
    }
    
    @Override
    public void Sacar(double valor){
        if(getSaldo()>=(valor+5)){
            setSaldo(getSaldo()-(valor+5));
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    @Override
    public void AplicarRendimento(){
        super.setSaldo(getSaldo()*1.012);
    }
    
    @Override
    public String TipoConta(){
        return "Conta Corrente";
    }
   /*public void qualquercoisa(){
       this.Sacar(10);
       super.Sacar(10);
   }*/

    @Override
    public void ReceberPix(double valor) {  
        setSaldo(getSaldo()+valor);
    }
    
}

