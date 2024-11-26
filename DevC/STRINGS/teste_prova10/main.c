#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#define tamanho 300
void nome_sigla(char *nome, char *sigla);
int e_preposicao(const char *palavra);
int main()
{
    char nome[tamanho],sigla[tamanho];
    while(1)
    {
        printf("Digite seu nome completo ou sair: "); scanf("\n%[^\n]",nome);
        if(strcmp(nome,"Sair")==0 || strcmp(nome,"sair")==0 ||strcmp(nome,"SAIR")==0)
        {
            printf("Programa encerrado.\n");
            break;
        }
        else{
            nome_sigla(nome,sigla);
        }
    }

    return 0;
}
void nome_sigla(char *nome, char *sigla){
int i,f=0;
for(i=0; i<strlen(nome);i++)
{
if(!e_preposicao(nome))
{
    if(nome[i]==' ')
    {
        sigla[f]=toupper(nome[i+1]);
        f++;

    }
    if(i==0)
    {
        sigla[0]=nome[0];
    }
}
}
sigla[strlen(sigla)]='\0';
for(i=0;i<strlen(sigla);i++)
{
    printf("%c.",sigla[i]);
    if(i==strlen(sigla)-1)
    {
        printf("\n");
    }

}
}
int e_preposicao(const char *palavra) {
    // Preposições que devem ser ignoradas
    const char *preposicoes[] = {"da", "de", "di", "do", "du","dos"};
    int i;

    for (i = 0; i < 5; i++) {
        if (strcmp(palavra, preposicoes[i]) == 0) {
            return 1;  // Se for uma preposição, retorna 1
        }
    }
    return 0;  // Caso contrário, retorna 0
}
