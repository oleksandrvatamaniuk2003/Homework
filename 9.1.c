#include <stdio.h>
#include <math.h>
int main(){
    const int n;
    printf("N=");
    scanf("%d", &n);
    int arr[n][n];
    int i = floor(n/2.), j = ceil(n/2.) - 1, t = 1, l = 2;
    arr[i][j] = 1;

    for(int k = 1; l < n*(n-1); k++){
        for(int f = 0; f < k; f++){
            arr[i][j+=t] = l;
            l++;
        }
        for(int f = 0; f < k; f++){
            arr[i-=t][j] = l;
            l++;
        }
        t *= -1;
    }  
  
    for(int k = 1; k < n; k++){
        arr[i][j+=t] = l;
        l++;
    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}