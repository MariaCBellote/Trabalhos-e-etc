package com.mycompany.aula20250430produto;

public class Livro extends Produto{
    private String autor;
    private int paginas;

    public Livro(String n, double p, String a, int pg) {
        autor = a;
        paginas = pg;
        nome = n;
        preco = p;
    }

    public void  ehGrande() {
        if(paginas > 200){
            System.out.println("É grande.");
        }
    }
    
    @Override
    public void  ehCaro() {
        if(preco > 50){
            System.out.println("Livro caro!");
        }
    }
    
}
