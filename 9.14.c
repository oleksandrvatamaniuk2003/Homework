#include <stdlib.h>

int main(){
    unsigned int objects_quantity_var;
    printf("Chyslo: ");
    scanf("%u", &objects_quantity_var); 
    int *our_array = (int*) malloc(objects_quantity_var * sizeof(int));
    for(int iterator = 0; iterator < objects_quantity_var; iterator+=1){
        printf("A[%u] = ", iterator);
        scanf("%d", &our_array[iterator]);
    }
    int res = 0;
    for(int iterator = 0; iterator < objects_quantity_var; iterator+=1){
        res += our_array[iterator]*our_array[iterator];
    }
    printf("%u", res);
    free(our_array);
}

