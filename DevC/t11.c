/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <stdlib.h>
int main()
{
 int x,c;
 printf("Digite um número inteiro: ");scanf("%i",&x);
 for(c=0;c<20;c++)
 {
 x=x+1;
 printf("%i\n",x);
 }

 return 0;}