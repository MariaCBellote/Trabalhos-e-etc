#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main()
{
    /*Faça um algoritmo em C que preencha dois vetores A e B (TAMANHO: 5) com valores inteiros.
      Depois de preencher os vetores A e B, exiba um vetor C, sendo que C = 3 * A ̶B.*/
    int A[5],B[5],C[5],i;
    srand(time(NULL));
    for(i=0; i<5; i++)
    {
        A[i]=rand()%101;
        printf("A=%i\n",A[i]);
        B[i]= rand()%101;
        printf("B=%i\n",B[i]);
        C[i]=3*A[i]-B[i];
        printf("C=%i\n",C[i]);
    }

    return 0;
}
