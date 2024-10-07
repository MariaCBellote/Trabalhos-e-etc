#include <stdio.h>
#include <stdlib.h>
#define alunos 30
int main()
{
    int sexo[alunos],i;
    float n1[alunos], n2[alunos],media[alunos],m=0;

    for(i=0; i<alunos; i++)
    {
        do
        {
            printf("Digite seu sexo(1 para masculino ou 2 para feminino): ");
            scanf("%i",&sexo[i]);
        }
        while(sexo[i]!=1 && sexo[i]!=2);
        printf("Digite sua nota do primeiro bimestre: ");
        scanf("%f",&n1[i]);
        printf("Digite sua nota do segundo bimestre: ");
        scanf("%f",&n2[i]);
        media[i]=(n1[i]+n2[i])/2;
        if(media[i]>m && sexo[i]==1)
        {
            m=media[i];
        }
    }
    printf("A maior media dos estudantes do sexo masculino foi: %.2f.\n",m);

    return 0;
}
