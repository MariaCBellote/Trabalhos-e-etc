/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <stdlib.h> 

int main()
{
  float mercadoria,reajuste,diminuicao;
  int n;
  for(n=0;n<50;n++)
  {
      printf("Digite o preço da mercadoria(R$) %i: ",n+1); scanf("%f",&mercadoria);
    if(mercadoria<0)
      printf("Somente valores positivos são válidos\n");
    else{
      reajuste=mercadoria*0.05;
      mercadoria=mercadoria+reajuste;
      if(reajuste>25.50)
      {
         diminuicao=mercadoria*0.02;
         mercadoria=mercadoria-diminuicao;
      }
      printf("Preço reajustado %i: %.2fR$\n",n+1,mercadoria);
  }
  }
       
    return 0;
}
