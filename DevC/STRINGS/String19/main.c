#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#define tamanho 100

int palindromo (char *palavra);
int main()
{
    char palavra[tamanho];
    while(1){
    printf("Escreva uma palavra: "); scanf("\n%[^\n]",palavra);
   if(palindromo(palavra)) {
        printf("%s é um palíndromo.\n",palavra);
    } else {
        printf("Não é um palíndromo.\n");
        break;
    }
    }
    return 0;
}

int palindromo (char *palavra)
{
    char invertido[tamanho];
    int i,j=0;
    for(i=strlen(palavra)-1;i>=0;i--)
    {   palavra[i]=tolower(palavra[i]);
        invertido[j]=palavra[i];
        j++;
    }
    invertido[j+1]='\0';
    if(strcmp(palavra,invertido)==0)
    {
        return 1;
    }
    return 0;
}
