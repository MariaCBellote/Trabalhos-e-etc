#include <stdio.h>
#include <stdlib.h>
#define Size 10
#define min 10
#define max 99
#include <time.h>
int main()
{
  int contador,n[Size],par=0,impar=0,i=0,p=0;
  float mp,mi;
  srand(time(NULL));
  for(contador=0;contador<Size;contador++)
{
n[contador]=rand() %(max-min+1)+min;
 if(contador % 2 ==1 || contador==1)
 {
     impar=impar+n[contador];
     i++;
 }
  if(contador % 2 ==0 || contador==0)
  {
     par=par+n[contador];
     p++;
  }
printf("%i\n",n[contador]);
}
mp=(float)par/(float)p;
mi=(float)impar/(float)i;
printf("Média de números pares:%.1f\n",mp);
printf("Média de númeors ímpares:%.1f",mi);
 return 0;
}
