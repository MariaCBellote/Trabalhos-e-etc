#include <stdio.h>
#include <stdlib.h>
#define Size 10
#define min 100
#define max 999
#include <time.h>

int main()
{   float f,n[Size];
    int indice;

  do{
    printf("Insira o valor desejado( dentro do intervalo de 10 a 99): "); scanf("%f",&f);
    }
    while(f<10 || f>99);
    srand(time(NULL));
printf("Valores maiores que o escolhido pelo user:\n");
  for(indice=0;indice<Size;indice++)
{
n[indice]=(float)(rand() %(max-min+1)+min)/10;

   if(n[indice]>f)
   printf("%i: %.2f\n",indice+1,n[indice]);

}

    return 0;
}
