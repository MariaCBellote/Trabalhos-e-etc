#include <stdio.h>
#include <stdlib.h>
#define Size 100
#define min 10
#define max 99
#include <time.h>



int main()
{
    int contador,n[Size];
    srand(time(NULL));
    printf("Valores primos e múltiplos de 7\n");


for(contador=0;contador<Size;contador++)
{
    n[contador]=rand() %(max-min+1)+min;
    if(n[contador] % 2 ==1 && n[contador]>=min && n[contador]<=max && n[contador] % 7==0)
    {
        printf("Índice[%i] %i\n",contador,n[contador]);
    }

}
  return 0;
}
