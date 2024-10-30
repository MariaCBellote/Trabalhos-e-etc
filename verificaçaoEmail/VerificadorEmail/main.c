#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>
#define limite 200
int main()
{
    /* O email deve conter @;
    Deve conter ".";
    Deve ter antes do "@", no mínimo, 2 caracteres;
    Apos o "@" no minimo, 2 caracteres;
    Apos o ".", minimo 2 caracteres.
    */
    setlocale(LC_ALL, "pt_BR.UTF-8");
    char email[limite];
    int i,j,k,flag1,flag2;
    printf("VERIFICADOR DE EMAIL\n");
    while(1)
    {
        j=0;
        k=0;
        i=0;
        flag1=1;
        flag2=1;
        printf("Digite seu email: ");
        scanf("\n%[^\n]",email);
        if(strcmp(email, "SAIR") == 0 || strcmp(email, "sair") == 0)
        {
            printf("Prgrama fechado.\n");
            break;
        }
        if(strlen(email)<8) printf("O email não está dentro dos parâmetros necessários\n");
        else
        {
          for(i=0;i<strlen(email);i++)
          {
              if(email[i]=='@') flag1=i;
              else if( email[i]=='.' && flag1!=1 && i>flag1) flag2=i;
          }

            if(flag1==1)
            {
                printf("Seu email não possui arroba!\n");
            }
            else if(flag2==1)
            {
                printf("Seu email não possui ponto após o arroba!\n");
            }
            else if(j<2)
            {
                printf("Seu email deve ter pelo menos 2 caracteres antes do '@'.\n");
            }
            else if(k-j<3)
            {
                printf("Seu email deve ter pelo menos 2 caracteres entre o '@' e o ponto.\n");
            }
            else if (strlen(email)-k<3)
            {
                printf("Seu email deve ter pelo menos 2 caracteres antes e depois do ponto.\n");
            }
            else{
                printf("Seu email é válido: %s\n", email);
            }
}
        printf(" %i %i %i %i\n",j,k,flag1,flag2);
    }

    return 0;
}
