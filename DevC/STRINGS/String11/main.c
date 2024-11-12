#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define tamanho 10000

int main()
{
    char palavra[tamanho],copia[tamanho];
    int c=0,t=0,i;
    while(1){
            c=0;
    printf("Digite sua palavra ou ok para sair.\n");
    scanf("\n%[^\n]",palavra);
    if(strcmp(palavra, "ok") == 0 || strcmp(palavra, "Ok") == 0 || strcmp(palavra, "OK") == 0)
    {
        printf("Programa encerrado.\n");
        break;

    }
    else{
    for(i=0;palavra[i] != '\0';i++){

       if(palavra[i] !=' ')
       {
            c++;
       }
       else{

           strncpy(copia,&palavra[t],c);
           copia[c]='\0';
           t=i+1;
           printf("%s: %i\n", copia,c);
           c=0;

       }

    }
    if(c>0) // para imprimir a ultima palavra da frase
    {
           strncpy(copia,&palavra[t],c);
           copia[c]='\0';
           t=i+1;


         printf("%s: %i\n", copia,c);
    }
    }
    }
    return 0;
}
