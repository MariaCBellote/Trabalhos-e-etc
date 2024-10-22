#include <stdio.h>
#include <stdlib.h>
#include <string.h>
# define tamanho 100
//exemplo 3 strcmp
int main()
{
    char STR1[tamanho], STR2[tamanho];
    int resposta, T1,T2;
    while(1)
    {
        printf("string 1: "); scanf("\n%[^\n]", STR1); // não pode colocar o &, pois o nome da estrutura de dados é o próprio endereço de memória.
        printf("string 2: "); scanf("\n%[^\n]", STR2); // não pode colocar o &, pois o nome da estrutura de dados é o próprio endereço de memória.
        T1= strlen(STR1);
        T2= strlen(STR2);
        printf("MNESAGEM: %s TEM %i CARACTERES\n", STR1,T1);
        printf("MNESAGEM: %s TEM %i CARACTERES\n", STR2,T2);
        resposta= strcmp(STR1, STR2);
        if(resposta==0)
            printf("string 1: %s== string 2: %s\n", STR2, STR2);
        else{
            printf( "String 1: %s é diferente de string 2: %s\n", STR1, STR2);
            if(resposta<0)
            {
                printf(" ORDEM LEXOGRAFICA: \n");
                printf("string 1: %s\n", STR1);
                printf("string 2: %s\n", STR2);

            }
            else{
                printf(" ORDEM LEXOGRAFICA: \n");
                printf("string 2: %s\n", STR2);
                printf("string 1: %s\n", STR1);
            }
        }
        if(T1<2 || T2<2)
            break;
    }

    return 0;
}
