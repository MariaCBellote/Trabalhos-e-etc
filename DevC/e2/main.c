#include <stdio.h>
#include <stdlib.h>
#define Size 10
#define min 10
#define max 99
#include <time.h>



int main()
{
    int contador,n[Size];
    float p;
    srand(time(NULL));
    printf("Valores \n");


for(contador=0;contador<Size;contador++)
{
    n[contador]=rand() %(max-min+1)+min;
    if(n[contador]>=35 && n[contador]<=40)
    {
        p=n[contador]*0.05;
        p=n[contador]+p;

        printf("Índice[%i] %.1f\n",contador,p);
    }

}
  return 0;
}
