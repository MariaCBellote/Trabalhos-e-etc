#include <stdio.h>
#include <stdlib.h>
#define atleta 5
#define meta 88.7

int main()
{   int m[atleta],i,j,sinal;
    float med,t[atleta],s=0;
  for(i=0;i<atleta;i++){
       do {
            sinal = 0;
            printf("Coloque seu n�mero de matr�cula: ");
            scanf("%i", &m[i]);


            for (j = 0; j < i; j++) {
                if (m[i] == m[j]) {
                    printf("Essa matr�cula j� existe. Por favor, insira uma nova matr�cula.\n");
                    sinal = 1;
                }
            }
        }
        while (sinal == 1);
        printf("Coloque seu tempo de corrida(em minutos):");scanf("%f",&t[i]);
        s=s+t[i];
}
  med=(float)s/atleta;
  printf("A m�dia de tempo de todos os atletas �: %.2f\n",med);

  for (i = 0; i < atleta; i++) {
        if (t[i] < meta)
        printf("O atleta com matr�cula %i est� abaixo da meta.\n",m[i]);
        }
    return 0;

}
