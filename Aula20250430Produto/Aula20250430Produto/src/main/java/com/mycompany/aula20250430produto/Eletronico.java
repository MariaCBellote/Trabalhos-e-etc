package com.mycompany.aula20250430produto;

public class Eletronico extends Produto{
    private int voltagem;
    
    public Eletronico(String n, double p, int v) {
        nome = n;
        preco = p;
        voltagem  =v;
    }
    public Eletronico() {
        nome = null;
        preco = 0;
        voltagem  =0;
    }
    public Eletronico(String n, double p) {
        nome = n;
        preco = p;
        voltagem  =0;
    }
    
    public void  ehCaro( int valor) {
        if(preco > valor){
            System.out.println("Eletronico caro!");
        }else{
            System.out.println("Eletronico barato!");
        }
    }
    
    
    
}
