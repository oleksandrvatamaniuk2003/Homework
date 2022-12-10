#include <stdlib.h> 

int* inputVector(unsigned int n){
    int **A = (int **)calloc(n, sizeof(int *));
    for(int i = 0; i < n; i++) {
        A[i] = (int *)calloc(n, sizeof(int));
    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            printf("Array[%d][%d] = ", i, j);
            scanf("%d", &A[i][j]);
        }
    }
    return A;
}
int* inputVector2(unsigned int n){
    int *A = (int *)calloc(n*n, sizeof(int));
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            printf("Array[%d][%d] = ", i, j);
            scanf("%d", &A[i*n + j]);
        }
    }
    return A;
}

int main(){
    unsigned int n;
    printf("N = ");
    scanf("%u", &n);
    int** arr1 = inputVector(n);
    int** arr2 = inputVector(n);
    int** arr3 = (int **)calloc(n, sizeof(int *));
    
    for (unsigned int i = 0; i < n; i++){            
        for (unsigned int j = 0; j < n; j++){
            for (unsigned int t = 0; t < n; t++){
                arr3[i][j] += arr2[i][t] * arr1[t][j];
            }
        }
    }
    for (unsigned int i = 0; i < n; i++){            
        for (unsigned int j = 0; j < n; j++){
            printf("%d ", arr3[i][j]);
        }
        printf("\n");
    }

    int* arr11 = inputVector2(n);
    int* arr22 = inputVector2(n);
    int* arr33 = (int *)calloc(n*n, sizeof(int));
    for (unsigned int i = 0; i < n; i++){            
        for (unsigned int j = 0; j < n; j++){
            for (unsigned int t = 0; t < n; t++){
                arr33[i*n + j] += arr22[i*n + t] * arr11[t*n + i];
            }
        }
    }
    for (unsigned int i = 0; i < n; i++){            
        for (unsigned int j = 0; j < n; j++){
            printf("%d ", arr33[i*n + j]);
        }
        printf("\n");
    }
    free(arr1);
    free(arr2);
    free(arr3);
    free(arr11);
    free(arr22);
    free(arr33);
}