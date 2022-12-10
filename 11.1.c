#include <stdio.h>
#include <math.h>
int main()
{
    unsigned int n;
    double a;
    printf("Enter a: ");
    scanf("%lf", &a);
    printf("Enter n: ");
    scanf("%u", &n);
    double arr[n];
    
    for(unsigned int i = 0; i < n; i++){
        printf("arr[%u] = ", i);
        scanf("%lf", &arr[i]);
    }

    // FILE F
    FILE *f = fopen("f.bin", "wb");
    
    fwrite(&arr, sizeof(double), n, f);
    fclose(f);

    // read file F
    FILE *f1 = fopen("f.bin", "rb");
    double byte[n], arr2[n], arr3[n];
    unsigned int j = 0, k = 0;
    fread(&byte, sizeof(double), n, f1);
    for(unsigned int i = 0; i < n; i++){
        if(fabs(byte[i]) < a){
            arr2[j] = byte[i];
            j++;
        } else {
            arr3[k] = byte[i];
            k++;
        }
    }
    // write to G
    FILE *g = fopen("g.bin", "wb");
    
    fwrite(&arr2, sizeof(double), j, g);
    fclose(g);
    // rewrite F
    FILE *f2 = fopen("f.bin", "wb");
    
    fwrite(&arr3, sizeof(double), k, f2);
    fclose(f2);
}