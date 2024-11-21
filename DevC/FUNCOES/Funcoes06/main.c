#include <stdio.h>
#include <stdlib.h>

int fatorial( int n);
double arranjo( int n, int p);
double combinacao (int n, int p);
int main()
{   int n, p;
    double ar,co;
    printf(" Arranjos e combinações\n");
    while(1){
    printf("Digite seu n: "); scanf("%i",&n);
    printf("Digite seu p: "); scanf("%i",&p);
    if(n<0 || p<0 || n<p)
    {
        printf("Valores incorretos!\n");
        break;
    }
    else{
        ar=arranjo(n,p);
        co=combinacao(n,p);
        printf("Arranjo(%i,%i): %.2f\n",n,p,ar);
        printf("combinação(%i,%i): %.2f\n",n,p,co);

    }
    }

    return 0;
}

int fatorial( int nu)
{
    int i,f=1;
    for(i=1;i<=nu;i++)
    {
        f=f*i;
    }
    return f;
}
double arranjo( int n, int p)
{
    double a;
    a= (double)fatorial(n)/ fatorial(n-p);
    return a;
}
double combinacao (int n, int p)
{
    double c;
    c= arranjo(n,p)/fatorial(p);
    return c;
}
