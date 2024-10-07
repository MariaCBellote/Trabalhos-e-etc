#include <stdio.h>
#include <stdlib.h>
#define atleta 25000

int main()
{   int m[atleta],i,j,sinal;
    float med,t[atleta],s=0;
  for(i=0;i<atleta;i++){
       do {
            sinal = 0;
            printf("Coloque seu número de matrícula: ");
            scanf("%i", &m[i]);


            for (j = 0; j < i; j++) {
                if (m[i] == m[j]) {
                    printf("Essa matrícula já existe. Por favor, insira uma nova matrícula.\n");
                    sinal = 1;
                }
            }
        }
        while (sinal == 1);
        printf("Coloque seu tempo de corrida(em minutos):"); scanf("%f",&t[i]);
        s=s+t[i];
}
  med=(float)s/atleta;
  printf("A média de tempo de todos os atletas é: %.2f\n",med);

  for (i = 0; i < atleta; i++) {
        if (t[i] < med)
        printf("O tempo %.2f do atleta com matrícula %i está abaixo da média.\n", t[i], m[i]);
        }
    return 0;

}
