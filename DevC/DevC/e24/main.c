#include <stdio.h>
#include <stdlib.h>
#define atleta 25000

int main()
{
    int m[atleta],i,j,g,h,sinal,matricula,auxm,menor,maior,meio;
    float med,t[atleta],auxt,s=0;

    for(i=0; i<atleta; i++)
    {
        do
        {
            sinal = 0;
            printf("Coloque seu número de matrícula: ");
            scanf("%i", &m[i]);

            for (j = 0; j < i; j++)
            {
                if (m[i] == m[j])
                {
                    printf("Essa matrícula já existe. Por favor, insira uma nova matrícula.\n");
                    sinal = 1;
                }
            }
        }
        while (sinal == 1);

        printf("Coloque seu tempo de corrida(em minutos):");
        scanf("%f",&t[i]);
    }

    printf("Dígite a matrícula do corredor que desaja ter informação: ");
    scanf("%i",&matricula);



    //busca sequencial

    sinal=0;
    for(g=0; g<atleta; g++)
    {
        if(m[g]==matricula)
        {
            printf("O atleta de matricula %i teve o tempo de %.2f minutos.\n",matricula,t[g]);
            sinal=1;
        }
    }
    if(!sinal)
         printf("Matricula não encontrada.\n");



//busca binária
    for(g=0; g<atleta-1; g++)
    {
        for(h=0; h<atleta-g-1; h++)
        {
            if(m[h]>m[h+1])
            {
                //ordenando as matrículas
                auxm=m[h];
                m[h]=m[h+1];
                m[h+1]=auxm;

                //ordenando o tempo
                auxt=t[h];
                t[h]=t[h+1];
                t[h+1]=auxt;
            }
        }
    }
//fazendo a busca
    menor=0;
    maior=atleta-1;
    sinal=0;
    while(menor<=maior)
    {
         meio =( menor + (maior - menor)) / 2;
        if(matricula==m[meio])
        {

            printf("O atleta de matricula %i teve o tempo de %.2f minutos.\n",matricula,t[meio]);
            sinal=1;
            break;
        }
        else if(matricula>m[meio])
        {
            menor=meio+1;
        }

        else
        {
            maior=meio-1;
        }
    }

    if(!sinal)
       printf("Matricula não encontrada.\n");

    return 0;

}
