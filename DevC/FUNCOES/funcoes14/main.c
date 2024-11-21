#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define loop 50
#define pi 3.14
void area(int r, float *a);
void volume(int r, float *v);
int main()
{
    int i;
    float r,a,v;
    printf("Calculando area e volume da esfera\n");
    for(i=0;i<loop;i++)
    {
        printf("Digite o raio: "); scanf("%f", &r);
        if(r<0)
        {
            printf("Valor inválido, digite outro valor!\n");
        }
        else{
            area(r,&a);
            volume(r,&v);
           printf(" A area: %.2f, volume: %.2f\n",a,v);
        }
    }
    return 0;
}
void area(int r, float *a)
{
    *a= 4*pi*pow(r,2);

}
void volume( int r, float *v)
{
    *v=pi*pow(r,3)*(4.0/3);

}
