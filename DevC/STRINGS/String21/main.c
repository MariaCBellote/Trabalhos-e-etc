#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define tamanho 100

char *invertida (char *palavra);
int main()
{
    char palavra[tamanho],*invert;
    while(1){
    printf("Escreva uma palavra ou digite sair: "); scanf("\n%[^\n]",palavra);
      if (strcmp(palavra, "sair") == 0 || strcmp(palavra, "SAIR") == 0 || strcmp(palavra, "Sair") == 0)
      {
          printf("Programa encerrado.\n");
          break;
      }
      else{
        invert=invertida(palavra);
        printf("Palavra invertida: %s.\n",invert);
        free(invert); // Libera a memória alocada para a palavra invertida
      }

    return 0;
}
}

char *invertida (char *palavra)
{
    char *invertido = (char *)malloc((strlen(palavra) + 1) * sizeof(char));
    int i,j=0;
    for(i=strlen(palavra)-1;i>=0;i--)
    {
        invertido[j]=palavra[i];
        j++;
    }
    invertido[j]='\0';

    return invertido;
}
