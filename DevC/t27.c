/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <stdlib.h>
int main()
{
 float n,sn=0,sp=0,mn,mp;
 int contn=0, contp=0;
 do{
 printf("Digite os números que deseja(pare digitando 0): "); scanf("%f",&n);
 if(n!=0)
 {
 if(n<0)
 {
 sn=sn+n;
 contn++;
 }
 else{
 sp=sp+n;
 contp++;
 }
 }
 }
 while(n!=0);
 mn=sn/contn;
 mp=sp/contp;
 printf("Média dos positivos: %f e média dos negativos: %f\n",mp,mn);


 return 0;
}