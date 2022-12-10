#include <stdio.h>

int main(){
    int arr[3][3] = {{1,2,3}, {4,5,6}, {7,8,9}};
    int N, M;
    printf("Enter N = ");
    scanf("%d", &N);
    printf("Enter M = ");
    scanf("%d", &M);
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            if(arr[i][j] == M){
                arr[i][j] = N;
            }
        }
    }
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}