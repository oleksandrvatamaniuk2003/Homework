#include <stdio.h>
#include <math.h>
int main()
{
    // 3e
    int *arr;
    arr = (int*) calloc(1, sizeof(int));
    unsigned int i = 0;
    printf("arr[%u] = ", i);
    int t;
    scanf("%d", &arr[0]);
    while(t!=0){
        arr = realloc(arr, sizeof(int)*(i+1));
        arr[i] = t;
        i++;
        printf("\narr[%u] = ", i);
        scanf("%d", &t);
    }
    printf("%d", arr[i-1]);
    // FILE F
    FILE *f = fopen("f.bin", "wb");
    
    fwrite(&arr, sizeof(double), i, f);
    fclose(f);

    // read file F
    FILE *f1 = fopen("f.bin", "rb");
    int byte[i], arr2[i];
    unsigned int j = 0;
    fread(&byte, sizeof(double), i, f1);
    for(unsigned int k = 0; k < i; k++){
        if(byte[k] % 2 == 0){
            arr2[j] = byte[k];
            j++;
        }
    }
    // write to G
    FILE *g = fopen("g.bin", "wb");
    
    fwrite(&arr2, sizeof(double), i, g);
    fclose(g);
   
}