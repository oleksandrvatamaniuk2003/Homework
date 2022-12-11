#include <stdio.h>
#include <stdlib.h>
int* function1(unsigned int n, unsigned int m){
    int **A = (int **)calloc(n, sizeof(int *));
    for(int i = 0; i < n; i++) {
        A[i] = (int *)calloc(m, sizeof(int));
    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j+=1){
            A[i][j] = rand() % 256;
        }
    }
    return A;
}

int main(){
    unsigned int n = 3, m = 4, k = 2;
    int** A = function1(n, m);
 
    for(unsigned int i = 0; i < n; i++){
        for(unsigned int j = 0; j < m; j++){
            printf("%d ", A[i][j]);
        }
        printf("\n");
    }
    printf("\n");
    unsigned int infimum = 100000000, supr = 0;
    for(unsigned int i = 0; i < n; i++){
        for(unsigned int j = 0; j < m; j++){
            if(A[i][j] < infimum){
                infimum = A[i][j];
                supr = j;
            }
        }
    }
    
    for(unsigned int i = 0; i < n; i++) {
        A[i] = (int *)realloc(A[i], (m+1) * sizeof(int));
    }

    for(unsigned int i = 0; i < n; i++){
        for(unsigned int j = m; j > supr+1; j--){
            A[i][j] = A[i][j-1];
        }
        A[i][supr+1] = rand() % 256;
    }
    for(unsigned int i = 0; i < n; i++){
        for(unsigned int j = 0; j < m+1; j++){
            printf("%d ", A[i][j]);
        }
        printf("\n");
    }

    free(A);
}


