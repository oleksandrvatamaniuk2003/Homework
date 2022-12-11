#include <stdlib.h> 

int* inputVector(unsigned int natural_num){
    int *list = (int*)malloc(natural_num * sizeof(int));
    for(int iterator = 0; iterator < natural_num; iterator++){
        printf("Array[%d] = ", iterator);
        scanf("%d", &list[iterator]);
    }
    return list;
}
int main(){
    unsigned int natural_num;
    printf("Value: ");
    scanf("%u", &natural_num);
    int *vector_1 = inputVector(natural_num);
    int *vector_2 = inputVector(natural_num);
    int *vector_3 = (int*)malloc(natural_num * sizeof(int));
    for(int iterator = 0; iterator < natural_num; iterator++){
        vector_3[iterator] = vector_2[iterator] - vector_1[iterator];
    }
    free(vector_1);
    free(vector_2);
    free(vector_3);
}


