#include <stdio.h>
int main()
{
    unsigned int n;
    printf("Vvod");
    scanf("%u", &n);
    double our_array[n];
    for(unsigned int iterating_variable = 0; iterating_variable < n; iterating_variable++){
        printf("our_array[%u] = ", iterating_variable);
        scanf("%lf", &our_array[iterating_variable]);
    }
    FILE *f = fopen("client.bin", "wb");
    fwrite(&our_array, sizeof(double), n, f);
    fclose(f);
    FILE *variable_1 = fopen("client.bin", "rb");
    double byte[4];
    fread(&byte, sizeof(double), n, variable_1);
    for(unsigned int iterating_variable = 0; iterating_variable < n; iterating_variable+=1){
        printf("%lf, ", our_array[iterating_variable]);
    }
}



