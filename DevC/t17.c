/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <float.h>
#include <stdlib.h>

int main()
{
 float n,menor=FLT_MAX; // Inicializa com o maior valor possível
 do{
 printf("DIgite um número real e positivo: "); scanf("%f",&n);

 if(n>0 && n<menor)
 menor=n;
 }
 while(n>0);
 if(n<0)
 {
 printf("O número deve ser positivo! Tente novamente.\n");
 }
 printf("O menor valor foi: %.2f\n",menor);

 return 0;

}