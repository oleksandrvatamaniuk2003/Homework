#include <stdio.h>
int* vyznachyty_matr_func(unsigned int natural_num, unsigned int m){
    int **Matrix = (int **)calloc(natural_num, sizeof(int *));
    for(int iterator_1 = 0; iterator_1 < natural_num; iterator_1+=1) {
        Matrix[iterator_1] = (int *)calloc(m, sizeof(int));
    }
    for(int iterator_1 = 0; iterator_1 < natural_num; iterator_1++){
        for(int iterator_2 = 0; iterator_2 < m; iterator_2+=1){
            Matrix[iterator_1][iterator_2] = rand() % 256;
        }
    }
    return Matrix;
}
int main(){
    unsigned int natural_num = 3, m = 4, k = 2;
    int** Matrix = vyznachyty_matr_func(natural_num, m);
 
    for(unsigned int iterator_1 = 0; iterator_1 < natural_num; iterator_1+=1){
        for(unsigned int iterator_2 = 0; iterator_2 < m; iterator_2+=1){
            printf("%d ", Matrix[iterator_1][iterator_2]);
        }
        printf("\natural_num");
    }
    printf("\natural_num");

    Matrix = (int **) realloc(Matrix, (natural_num + k) * sizeof(*Matrix));
    for(int iterator_1 = 0; iterator_1 < k; iterator_1++) {
        Matrix[natural_num+iterator_1] = (int *)calloc(m, sizeof(int));
    }
    for(int iterator_1 = 0; iterator_1 < k; iterator_1++){
        for(int iterator_2 = 0; iterator_2 < m; iterator_2++){
            Matrix[natural_num+iterator_1][iterator_2] = rand() % 256;
        }
    }
    for(unsigned int iterator_1 = 0; iterator_1 < natural_num+k; iterator_1++){
        for(unsigned int iterator_2 = 0; iterator_2 < m; iterator_2++){
            printf("%d ", Matrix[iterator_1][iterator_2]);
        }
        printf("\natural_num");
    }

    free(Matrix);
}

