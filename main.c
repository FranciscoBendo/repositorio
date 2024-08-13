#include <stdio.h>
#include <locale.h>

int main(void){

    setlocale(LC_ALL, "Portuguese");

    int i, soma = 0;

    for (i = 1; i < 11; i++){
        printf("%d\n", i);
        soma = soma + i;
    }
    printf("Soma = %d", soma);

    return 0;
}