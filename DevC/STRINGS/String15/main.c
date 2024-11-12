#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define tamanho 100


int main(){
char palavra[tamanho],texto[tamanho][tamanho],p[4];
int i,j;
   for(i=0;i<tamanho;i++){
    printf("Digite sua palavra ou ok para sair.\n");
    scanf("\n%[^\n]",palavra);
    if(strcmp(palavra, "ok") == 0 || strcmp(palavra, "Ok") == 0 || strcmp(palavra, "OK") == 0)
    {
        printf("Programa encerrado.\n");
        break;

    }
    else{
      strncpy(p,&palavra[0],3);
      p[3]='\0';
      strcpy(texto[i],p);
    }
}
for(j=0;j<tamanho;j++)
{
    printf("%s",texto[j]);

    if(j==tamanho-1)
    {
        printf(".\n");
        break;
    }
    printf(" ");
}
    return 0;
}
