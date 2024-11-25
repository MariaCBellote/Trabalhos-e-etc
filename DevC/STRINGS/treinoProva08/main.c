#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_TAM 100  // Tamanho m�ximo para a mensagem

int main() {
    char mensagem[MAX_TAM];
    int i;

    while(1) {
        // L� a mensagem do usu�rio
        printf("Digite uma mensagem (ou 'FIM' para encerrar): ");
        scanf("%[^\n]%*c", mensagem);  // L� a linha inteira at� o enter

        // Verifica se a mensagem � "FIM"
        if (strcmp(mensagem, "FIM") == 0) {
            printf("Programa encerrado.\n");
            break;  // Encerra o loop se a mensagem for "FIM"
        }

        // Exibe a mensagem com espa�os entre os caracteres
        for( i = 0; i < strlen(mensagem); i++) {
            printf("%c ", mensagem[i]);
        }
        printf("\n");
    }

    return 0;
}
