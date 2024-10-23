#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define tamanho 100
#define letras 10000

int main()
{
    char catpar[letras][tamanho], catimpar[letras][tamanho], cat[letras];
    int i=0,j,par=0,impar=0;
    printf("PALAVRAS PARES OU ÍMPARES\n");
    while(i<tamanho)
    {
        printf("Digite a palavra: ");
        scanf("%s",cat);
        if (strcmp(cat, "sair") == 0 || strcmp(cat, "SAIR") == 0 ) {
            break;
        }
        else{

        if(strlen(cat) % 2 == 0) {
            strcpy(catpar[par], cat);  // Armazena a copia palavra em catpar
            par++;
        } else {
            strcpy(catimpar[impar], cat);  // Armazena a copia palavra em catimpar
            impar++;
        }
        i++;
    }
    }
    printf("PALAVRAS PARES: ");
    for(j=0; j<par; j++)
    {
        printf("%s ", catpar[j]);
        if(j < par - 1)
            printf(", ");  // Adiciona vírgula se não for a última palavra
    }
    printf("\n");
    printf("PALAVRAS IMPARES: ");
    for(j=0; j<impar; j++)
    {
        printf("%s ", catimpar[j]);
        if(j < impar - 1)
            printf(", ");  // Adiciona vírgula se não for a última palavra
    }
    printf("\n");

    return 0;
}

