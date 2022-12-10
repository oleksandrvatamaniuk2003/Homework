#include <stdio.h>

int main(){
    double arr[3][3] = {{1.0,2,3}, {4,5,6}, {7,8,9}};
    int i, j;
    double a;
    printf("Enter i = ");
    scanf("%d", &i);
    printf("Enter j = ");
    scanf("%d", &j);
    printf("Enter a = ");
    scanf("%lf", &a);
    if(i < 3 & j < 3 & i >= 0 & j >= 0){
        arr[i][j] = a;
    }
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            printf("%lf ", arr[i][j]);
        }
        printf("\n");
    }
}