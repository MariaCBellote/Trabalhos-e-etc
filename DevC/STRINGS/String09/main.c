#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define LOOP 100
#define TAMANHO 1000

int main() {
    char frase[TAMANHO], uvv[] = "UVV", *copia;
    int i, c = 0;

    printf("Escreva a palavra que deseja ou digite 'sair' para encerrar\n");

    for (i = 0; i < LOOP; i++) {
        printf("Digite seu texto: ");
        scanf(" %[^\n]", frase);

        if (strcmp(frase, "sair") == 0 || strcmp(frase, "SAIR") == 0 || strcmp(frase, "Sair") == 0) {
            printf("Programa encerrado.\n");
            break;
        }

        // Inicializa o ponteiro para o in�cio da string
        copia = frase;


        while ((copia = strstr(copia, uvv)) != NULL) {
            c++;
            copia += 3; // Avan�a o ponteiro para a pr�xima posi��o depois de achar uvv
        }


        if (c > 0) {
            printf("A substring 'UVV' foi encontrada %d vez(es) na frase.\n", c);
        } else {
            printf("N�o h� a substring 'UVV' na frase.\n");
        }

    }

    return 0;
}
