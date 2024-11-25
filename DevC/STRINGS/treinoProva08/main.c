#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_TAM 100  // Tamanho máximo para a mensagem

int main() {
    char mensagem[MAX_TAM];
    int i;

    while(1) {
        // Lê a mensagem do usuário
        printf("Digite uma mensagem (ou 'FIM' para encerrar): ");
        scanf("%[^\n]%*c", mensagem);  // Lê a linha inteira até o enter

        // Verifica se a mensagem é "FIM"
        if (strcmp(mensagem, "FIM") == 0) {
            printf("Programa encerrado.\n");
            break;  // Encerra o loop se a mensagem for "FIM"
        }

        // Exibe a mensagem com espaços entre os caracteres
        for( i = 0; i < strlen(mensagem); i++) {
            printf("%c ", mensagem[i]);
        }
        printf("\n");
    }

    return 0;
}
