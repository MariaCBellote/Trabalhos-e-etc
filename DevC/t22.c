/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <stdlib.h>

int main()
{
 int t,s=0,c=0;
 float m;
 do{
 printf("Digite a tempratura: ");scanf("%i",&t);
 if(t>=-15 && t<=5){
 s=t+s;
 c++;
 }
 }
 while(t>=-15 && t<=5);
 m=(float)s/(float)c;
 printf("Média: %.2f",m);
 return 0;

}