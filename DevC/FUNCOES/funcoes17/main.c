#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define loop 50
void enesimo(int *a, int *q, int *n, int *et);
void soma(int *a, int *q, int *n, float *st);
int main()
{
    int a, q, n, menu,i, et;
    float st;
    for(i=0;i<loop;i++){
    printf("Digite 0 caso deseje sair ou outro numero para prosseguir: ");scanf("%i",&menu);
    if(menu==0)
    {
        printf("Programa encerrado.\n");
        break;
    }
    else{
    printf("Digite o primeiro termo da PG: "); scanf("%i",&a);
    printf("Digite a razão da PG: "); scanf("%i",&q);
    printf("Digite a quantidade de termos da PG: "); scanf("%i",&n);
    enesimo(&a, &q, &n, &et);
            printf("O enésimo termo da PG é: %i\n", et);

    soma(&a, &q, &n, &st);
            printf("A soma dos %i primeiros termos da PG é: %.2f\n", n, st);
    }
    }

    return 0;
}
void enesimo(int *a, int *q, int *n, int *et){
 *et= *a*pow(*q,*n-1);

}
void soma(int *a, int *q, int *n, float *st){
 *st= (*a * (pow(*q,*n)-1))/ (*q-1);
}
