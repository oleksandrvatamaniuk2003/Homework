#include <stdio.h>

double func(double arr[], int N){
    double sum = 0;
    for(int i = 0; i < N; i++){
        sum += (arr[i] > exp(1)) * arr[i];
    }
    return sum;
}

int main(){
    int N = 10;
    double arr[10];
    for(int i = 0; i < N; i++){
        printf("%d element:", i+1);
        scanf("%lf", &arr[i]);
    }
    printf("%lf", func(arr, N));
}