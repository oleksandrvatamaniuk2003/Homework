#include <stdio.h>

int main(){
    const int M, N, K;
    printf("M: ");
    scanf("%d", &M);
    printf("N: ");
    scanf("%d", &N);
    printf("K: ");
    scanf("%d", &K);
    double list[M][N];
    for(int row = 0; row < M; row+=1){
        for(int col = 0; col < N; col+=1){
            printf("list[%d][%d] = ", row, col);
            scanf("%lf", &list[row][col]);
        }
        printf("\n");
    }
    double result = 0;
    for(int row = 0; row < M; row++){
        if(row - K >= 0 & row - K < N){
            result += list[row][row-K];
        }
    }
    printf("result=%lf", result);
}

