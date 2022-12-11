#include <stdio.h>
#include <math.h>
int main()
{
    int *our_array;
    our_array = (int*) calloc(1, sizeof(int));
    unsigned int iterator = 0;
    printf("our_array[%u] = ", iterator);
    int temp_1;
    scanf("%d", &our_array[0]);
    while(temp_1!=0){
        our_array = realloc(our_array, sizeof(int)*(iterator+1));
        our_array[iterator] = temp_1;
        iterator+=1;
        printf("\narr[%u] = ", iterator);
        scanf("%d", &temp_1);
    }
    printf("%d", our_array[iterator-1]);
    FILE *fand = fopen("fand.bin", "wb");
    fwrite(&our_array, sizeof(double), iterator, fand);
    fclose(fand);
    FILE *f1 = fopen("fand.bin", "rb");
    int byte[iterator], arr2[iterator];
    unsigned int iterator_2 = 0;
    fread(&byte, sizeof(double), iterator, f1);
    for(unsigned int natural_num = 0; natural_num < iterator; natural_num++){
        if(byte[natural_num] % 2 == 0){
            arr2[iterator_2] = byte[natural_num];
            iterator_2+=1;
        }
    }
    FILE *app = fopen("app.bin", "wb");
    fwrite(&arr2, sizeof(double), iterator, app);
    fclose(app);  
}


