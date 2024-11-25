#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define tamanho 100
//Escrever um programa que leia 100 palavras (uma por uma) e inverta somente as N primeiras letras.
//Onde o valor de N é inteiro: [ N ≥ 2 e N ≤ Tamanho da Palavra ] escolhido pelo usuário.
void inverter(char *palavra, char *invertida, int *q);
int main()
{
    int i,q;
    char palavra[tamanho], invertida[tamanho];
    for(i=0;i<tamanho;i++)
    {
        printf("Digite uma palavra ou sair: "); scanf("\n%[^\n]",palavra);
        if (strlen(palavra) < 2) {
                printf("Erro! O valor de N deve ser entre 2 e o tamanho da palavra.\n");
                continue;
            }
            else{
        if(strcmp(palavra,"Sair")==0 || strcmp(palavra,"sair")==0 ||strcmp(palavra,"SAIR")==0)
        {
            printf("Programa encerrado.\n");
            break;
        }
        else{
            printf("Digite a quantidade de letras que deseja inverter: "); scanf("%i",&q);
            inverter(palavra,invertida,&q);
            printf("%s\n", invertida);
        }
    }
    }

    return 0;
}

void inverter(char *palavra, char *invertida, int *q)
{
   int i,j;
   invertida[strlen(palavra)]='\0';
   j=*q-1;
   for(i=0;i<*q;i++)
   {
       invertida[i]=palavra[j];
       j--;
   }
   for(i=*q;i<strlen(palavra);i++)
   {
       invertida[i]=palavra[i];
   }
}
