/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treinojava;

/**
 *
 * @author alunolab08
 */
import java.util.Scanner;
import java.util.Random;
import java.time.Year;
public class Aluno {
    private String nome,curso,turma;
    private String matricula;
    private int periodo;
    private double nota1,nota2,notaFinal;
    private static int alunos= 0;
    
    public Aluno(String nome, String curso, String turma, int periodo, double nota1,double nota2 ){
      //susbstring(x,y): pega a substring do indice x até y(nao inclui y), ou seja, com toUpper somente o 0 fica maiúsculo.
      //o substring(x)imprimira a palavra do indice x até o final( nesse caso vai pegar o resto da string do indice 1 ao finalm NÃO incluindo o 0 para continuar maiusculo.
      // por isso concatenamso com o resrto da palavra.
      this.nome=nome.substring(0, 1).toUpperCase()+nome.substring(1);
        this.curso=curso;
        this.turma=turma;
        this.periodo=periodo;
        this.nota1=nota1;
        this.nota2=nota2;
        //calcula a quantidade de alunos. O contador funciona toda vez  q uma nova instancia é criada.
        alunos++;
        this.gerarMatricula();
    }
//Getters
    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getTurma() {
        return turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getPeriodo() {
        return periodo;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public static int getAlunos() {
        return alunos;
    }
//Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    
    
    

    //printa a quantidade de alunos.
    //precisa ser static para ser chamada sem instancia na main.
    public static void quantidadeAlunos(){
       System.out.println("Quantidade de alunos: "+ alunos);
    }
    
  //passa o aluno de semestre.  
   public void passar(){
    Scanner scan= new Scanner(System.in); 
    this.periodo++;
    System.out.println("Digite sua nova turma: ");
    String turma=scan.nextLine();
    this.turma= turma;
    
}
   
   //gera uma matricula com data e um numero aleatório.
   private void gerarMatricula(){
       Random rand= new Random();
       
       int numero= rand.nextInt(10000);
       int ano= Year.now().getValue();
       //String.format une os valores, além de permitir formatação.
       this.matricula= String.format("%d%04d",ano,numero);
       
   }
   //calcula a media
   public void fecharSemestre(){
       this.notaFinal= (this.nota1+this.nota2)/2;
       System.out.printf("Sua nota final é: %.2f\n",notaFinal); 
       if(this.notaFinal>=7)
       {
         System.out.println("Você passou!");
         passar();
         System.out.println("Periodo atual: "+ this.periodo);
          System.out.println("Turma atual: "+ this.turma);
         
       }
       else if(this.notaFinal>=3 && this.notaFinal<7)
       {
           System.out.println("Você está de recuperação!");
       }
       else{
           System.out.println("Você reprovou!");
       }
   }
   //Imprime as informações de alunos.
   public void mostrar(){
        System.out.println("Seu nome é: "+ this.nome);
        System.out.println("Sua matricula é: "+this.matricula);
        System.out.println("Seu curso é: "+ this.curso);
        System.out.println("Sua turma é: "+ this.turma); 
        System.out.println("Seu periodo é: "+ this.periodo);
        System.out.println("1 Bismestre : "+ this.nota1);
        System.out.println("2 Bimestre: "+ this.nota1);
        fecharSemestre();
   }
   // função diretamente relacionada a classe e ao construtor.
   //Não é preciso instanciar objetos dentro da main, pois o retorno já possui um processo de instancia generalizado.
   //precisa ser static para ser chamada sem instancia na main.
   public static Aluno perguntar(){
       Scanner scan= new Scanner(System.in);
       System.out.println("Digite seu nome: ");
       String nome=scan.nextLine();
       System.out.println("Digite seu curso: ");
       String curso=scan.nextLine();
       System.out.println("Digite sua turma: ");
       String turma=scan.nextLine();
       System.out.println("Digite seu período: ");
       int periodo=scan.nextInt();
       System.out.println("Digite a nota do primeiro bimestre: "); 
       double nota1=scan.nextDouble();
       System.out.println("Digite a nota do segundo bimestre: "); 
       double nota2=scan.nextDouble();
       
       
       //retorna o construtor, já realizando a isntancia.
       return new Aluno(nome,curso,turma,periodo,nota1,nota2);
   }
   
   
}