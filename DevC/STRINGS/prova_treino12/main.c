#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* 12) Escrever um programa que leia uma mensagem (Texto) e exiba a freq��ncia (n�mero de ocorr�ncia)
de cada caractere da mensagem escolhida pelo usu�rio. Exemplo de sa�da:
"UNIVERSIDADE - UVV" = ('U': 2, 'V': 3, ' ': 2, '-': 1, 'I': 2, 'E': 2, 'N': 1, 'A': 1, 'D': 2, 'U': 2). */
#define MAX_TAM 100  // Tamanho m�ximo para a mensagem

void contar_frequencia(char *mensagem);

int main() {
    char mensagem[MAX_TAM];


    printf("Digite a mensagem: ");
    scanf("%[^\n]", mensagem);


    contar_frequencia(mensagem);

    return 0;
}

// Fun��o para contar a frequ�ncia de cada caractere na mensagem
void contar_frequencia(char *mensagem) {
    int i, j;
    int frequencias[256] = {0};  // Inicializa um array para armazenar a frequ�ncia (ASCII 0-255)
    int contagem;
    char c;  // Para verificar se o caractere j� foi contado

    // Conta a frequ�ncia de cada caractere
    for (i = 0; i < strlen(mensagem); i++) {
        c = mensagem[i];

        // Verifica se o caractere j� foi contado
        contagem = 0;
        for (j = 0; j < i; j++) {
            if (mensagem[i] == mensagem[j]) {
                contagem = 1;
                break;
            }
        }

        // Se o caractere ainda n�o foi contado, conta a frequ�ncia
        if (contagem == 0) {
            // Contando quantas vezes o caractere aparece
            int freq = 0;
            for (j = 0; j < strlen(mensagem); j++) {
                if (mensagem[i] == mensagem[j]) {
                    freq++;
                }
            }

            // Exibe o caractere e sua contagem
            printf("'%c': %d\n", c, freq);
        }
    }
}
