#include <stdlib.h>

int main(){
    unsigned int elements_amount;
    printf("N: ");
    scanf("%u", &elements_amount); 
    int *dyn_array = (int*) malloc(elements_amount * sizeof(int));
    for(int i = 0; i < elements_amount; i++){
        printf("A[%u] = ", i);
        scanf("%d", &dyn_array[i]);
    }
    int sum = 0;
    for(int i = 0; i < elements_amount; i++){
        sum += dyn_array[i]*dyn_array[i];
    }
    printf("%u", sum);
    free(dyn_array);
}