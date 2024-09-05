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
do
{
 printf("Digite a temperatura do dia: "); scanf("%i",&t);
 if(t>=28){
 s=s+t;
 c++;
 }
}
while(t>=28);
m=s/c;
printf("A média das temperaturas é: %.2f",m);

 return 0;

}