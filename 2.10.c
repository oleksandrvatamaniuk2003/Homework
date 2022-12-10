#include <stdio.h>
#include <math.h>

double methodGorner(double x, double arr[], const int n){
    double arr2[n];
    arr2[0] = arr[0];
    for (int i = 1; i < n; i++){
        arr2[i] = x*arr2[i-1] + arr[i]; 
    }
    return arr2[n-1];
}

int main(){
   
    const int n = 5;
    double x;
    scanf("%lf", &x);
    double arr[] = {1, 0, 2, 0, 1};
    printf("%lf\n", methodGorner(x, arr, n));
    // 2.4 b KP 2
    double arr1[] = {1, 1, 1, 1, 1};
    printf("%lf\n", methodGorner(x, arr1, 5));

    double arr2[] = {1, 5, 10, 10, 5, 1};
    printf("%lf\n", methodGorner(x, arr2, 6));
    double arr3[] = {1, 0, 0, 0, 0, 0, 1, 0, 0, 1};
    printf("%lf\n", methodGorner(x, arr3, 10));
    double arr4[] = {16, 8, 4, 2, 1};
    printf("%lf\n", methodGorner(x, arr4, 5));
    double arr5[] = {1, 0, 1, 0, 1, 0};
    printf("%lf", methodGorner(x, arr5, 6));
}