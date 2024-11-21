#include <stdio.h>
#include <stdlib.h>
#define preco 3.55
void tempo(int *he1,int *he2, int *hs1, int *hs2,int*hh,int*mm, int*total);
void pagar(int *total, float *valor);
int main()
{   int he1,he2,hs1,hs2, hh, mm, total;
float valor;
    printf("Hora de entrada(hh:mm): ");scanf("%i:%i",&he1,&he2);
    printf("Hora de saída(hh:mm): "); scanf("%i:%i",&hs1,&hs2);

    tempo(&he1,&he2,&hs1,&hs2, &hh, &mm, &total);
    pagar(&total, &valor);
    printf("Tempo total: %02d horas e %02d minutos\n", hh, mm);
    printf("Valor a pagar: R$%.2f\n", valor);
    return 0;
}
void tempo(int *he1,int *he2, int *hs1, int *hs2,int*hh,int*mm, int*total)
{
    int soma1, soma2;
    *he1= *he1*60;
    soma1=*he1+*he2;
    *hs1=*hs1*60;
    soma2=*hs1+*hs2;
    *total= soma2-soma1;
    if(*total<0)
    {
        *total= *total+(24*60);
    }
    *hh= *total/60;
    *mm= *total%60;
    if(*mm>59)
    {
        *mm= 00;
        *hh= *hh+1;
    }
}
void pagar(int *total, float *valor)
{
  *valor = (preco*(*total))/60;
}
