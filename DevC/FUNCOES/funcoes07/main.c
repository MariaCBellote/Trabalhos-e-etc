#include <stdio.h>
#include <stdlib.h>
int bissexto( int ano);
int main()
{
    int ano;
    while(1)
    {
    printf("Digite um ano ou 0 para sair: "); scanf("%i",&ano);
    if(ano==0)
    {
        printf("Encerrado\n");
        break;
    }
    else{
    if(bissexto(ano))
    {
        printf("O ano %i é bissexto!\n",ano);
    }
    else
    {
        printf("O ano %i não é bissexto!\n",ano);
    }
    }
    }
    return 0;
}
int bissexto( int ano)
{
    if(ano%400==0 ||(ano%4==0 && ano%100!=0))
    {
       return 1;
}
else{
    return 0;
}
}
