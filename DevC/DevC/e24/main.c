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
            printf("Coloque seu n�mero de matr�cula: ");
            scanf("%i", &m[i]);

            for (j = 0; j < i; j++)
            {
                if (m[i] == m[j])
                {
                    printf("Essa matr�cula j� existe. Por favor, insira uma nova matr�cula.\n");
                    sinal = 1;
                }
            }
        }
        while (sinal == 1);

        printf("Coloque seu tempo de corrida(em minutos):");
        scanf("%f",&t[i]);
    }

    printf("D�gite a matr�cula do corredor que desaja ter informa��o: ");
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
         printf("Matricula n�o encontrada.\n");



//busca bin�ria
    for(g=0; g<atleta-1; g++)
    {
        for(h=0; h<atleta-g-1; h++)
        {
            if(m[h]>m[h+1])
            {
                //ordenando as matr�culas
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
       printf("Matricula n�o encontrada.\n");

    return 0;

}
