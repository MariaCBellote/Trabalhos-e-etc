#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/* 12) Escrever um programa que leia uma mensagem (Texto) e exiba a freqüência (número de ocorrência)
de cada caractere da mensagem escolhida pelo usuário. Exemplo de saída:
"UNIVERSIDADE - UVV" = ('U': 2, 'V': 3, ' ': 2, '-': 1, 'I': 2, 'E': 2, 'N': 1, 'A': 1, 'D': 2, 'U': 2). */
#define MAX_TAM 100  // Tamanho máximo para a mensagem

void contar_frequencia(char *mensagem);

int main() {
    char mensagem[MAX_TAM];


    printf("Digite a mensagem: ");
    scanf("%[^\n]", mensagem);


    contar_frequencia(mensagem);

    return 0;
}

// Função para contar a frequência de cada caractere na mensagem
void contar_frequencia(char *mensagem) {
    int i, j;
    int frequencias[256] = {0};  // Inicializa um array para armazenar a frequência (ASCII 0-255)
    int contagem;
    char c;  // Para verificar se o caractere já foi contado

    // Conta a frequência de cada caractere
    for (i = 0; i < strlen(mensagem); i++) {
        c = mensagem[i];

        // Verifica se o caractere já foi contado
        contagem = 0;
        for (j = 0; j < i; j++) {
            if (mensagem[i] == mensagem[j]) {
                contagem = 1;
                break;
            }
        }

        // Se o caractere ainda não foi contado, conta a frequência
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
