#include <stdio.h>

int main()
{
    unsigned int n;
    printf("Vvod: ");
    scanf("%u", &n);
    unsigned int our_array[n];
    for(unsigned int iterating_variable = 0; iterating_variable < n; iterating_variable++){
        printf("our_array[%u] = ", iterating_variable);
        scanf("%u", &our_array[iterating_variable]);
    }
    FILE *f = fopen("app.bin", "wb");
    fwrite(&our_array, sizeof(unsigned int), n, f);
    fclose(f);
    FILE *f1 = fopen("app.bin", "rb");
    unsigned int arr2[n];
    fread(&arr2, sizeof(unsigned int), n, f1);
    int count = 0;
    double precision = 0.000001;
    for(unsigned int iterating_variable = 0; iterating_variable < n; iterating_variable+=1){
        if((abs(sqrt((double) our_array[iterating_variable]) - (double) round(sqrt(our_array[iterating_variable]))) < precision) && (int) round(sqrt(our_array[iterating_variable])) % 2 == 1){
            count++;
        }
    }
    printf("Spysok kvadrativ%d", count);
}

