/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <stdlib.h>
int main()
{
 int mix, c1=0,c2=0,c3=0,c=0;
 float p1,p2,p3;
 do{
 printf("Escolha o mix de sua preferência: 1, 2 ou 3? "); scanf("%i",&mix);

 if(mix!=0 && mix!=1 && mix!=2 && mix!=3)
 { printf("Escolha uma das três opções!\n");
 break;
 }
 if(mix==1 || mix==2 || mix==3)
 {
 c++;
 if(mix==1)
 c1++;
 else if(mix==2)
 c2++;
 else{
 c3++;
 }
 }
 }
 while(mix!=0);
 p1=(float)(c1*100)/(float)c;
 p2=(float)(c2*100)/(float)c;
 p3=(float)(c3*100)/(float)c;

 printf("Porcentagens: mix 1= %.2f%%, mix 2=%.2f%%, mix 3=%.2f%%\n",p1,p2,p3);


 return 0;
}