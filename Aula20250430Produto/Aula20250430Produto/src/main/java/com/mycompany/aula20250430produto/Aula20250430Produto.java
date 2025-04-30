package com.mycompany.aula20250430produto;

public class Aula20250430Produto {

    public static void main(String[] args) {
        System.out.println("Projeto livros");
        Eletronico e1 = new Eletronico("Celular", 75, 110);
        Livro l1 = new Livro("POO", 149.9, "Cassio", 300);
        l1.ehCaro();
        l1.ehGrande();


        e1.ehCaro();
        e1.ehCaro(75);
    }
}
