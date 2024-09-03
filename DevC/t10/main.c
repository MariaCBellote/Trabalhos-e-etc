#include <stdio.h>
#include <stdlib.h>

int main()
{  int x,y,s=0,z=0;
   float m;
do{
    printf("Digite um número para o intervalo: "); scanf("%i",&x);
}
while(x<1);
for(y=6;y<=6*x;y++)
{
    if(y%6==0)
    {
        s=s+y;
        z++;
    }
}
m=s/z;
printf("A média é : %.2f",m);
    return 0;
}
