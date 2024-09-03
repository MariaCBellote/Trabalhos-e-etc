#include <stdio.h>
#include <stdlib.h>

int main()
{int x,y=0;
   do{
    printf("Digite um número(0 caso queira parar: "); scanf("%i",&x);
     if(x>=10 && x<=90 && x%5==2)
   {
     y=x+y;
   }

       }
   while(x!=0);

    printf("A soma dos números que divididos por 5 o resto é 2= %i\n",y);
    return 0;



}
