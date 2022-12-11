#include <stdio.h>

int main(){
    const num = 3;
    unsigned int Vector[num];
    int j_counting_iterator = 0;
    for(int iterator = 0; iterator < num; iterator++){
        printf("Vector[%d]=", iterator);
        scanf("%u", &Vector[iterator]);
    }
    for(int iterator = 0; iterator < num; iterator++){
        if (((Vector[iterator] >> 7) & 1) & ((Vector[iterator] >> 8) & 1) & ((Vector[iterator] >> 7) & 1)){
            j_counting_iterator++;
        }
    }
    printf("Result%d", j_counting_iterator);
}