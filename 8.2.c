#include <stdio.h>

int main(){
    const int M, N;
    printf("Enter M = ");
    scanf("%d", &M);
    printf("Enter N = ");
    scanf("%d", &N);
    double arr[M][N];
    for(int i = 0; i < M; i++){
        for(int j = 0; j < N; j++){
            printf("arr[%d][%d] = ", i, j);
            scanf("%lf", &arr[i][j]);
        }
        printf("\n");
    }
    for(int i = 0; i < M; i++){
        for(int j = 0; j < N; j++){
            printf("%lf ", arr[i][j]);
        }
        printf("\n");
    }
}