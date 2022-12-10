#include <stdio.h>

int main()
{
    unsigned int n;
    printf("Enter n: ");
    scanf("%u", &n);
    double arr[n];
    
    for(unsigned int i = 0; i < n; i++){
        printf("arr[%u] = ", i);
        scanf("%lf", &arr[i]);
    }

    // write
    FILE *f = fopen("client.bin", "wb");
    
    fwrite(&arr, sizeof(double), n, f);
    fclose(f);

    // read
    FILE *f1 = fopen("client.bin", "rb");
    double byte[4];
    fread(&byte, sizeof(double), n, f1);
    for(unsigned int i = 0; i < n; i++){
        printf("%lf, ", arr[i]);
    }

}