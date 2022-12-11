#include <stdio.h>
#include <math.h>

double pidrahuvatu_koeficienty(double x, double character_block[], const int n){
    double character_block_2[n];
    character_block_2[0] = character_block[0];
    for (int i = 1; i < n; i+=1){
        character_block_2[i] = x*character_block_2[i-1] + character_block[i]; 
    }
    return character_block_2[n-1];
}

int main(){
   
    const int n = 5;
    double x;
    scanf("%lf", &x);
    double character_block[] = {1, 4, 2, 5, 1};
    printf("%lf\n", pidrahuvatu_koeficienty(x, character_block, n));
    double arr1[] = {1, 1, 1, 1, 1};
    printf("%lf\n", pidrahuvatu_koeficienty(x, arr1, 5));

    double character_block_2[] = {1, 5, 10, 10, 5, 1};
    printf("%lf\n", pidrahuvatu_koeficienty(x, character_block_2, 6));
    double arr3[] = {1, 0, 1, 1, 4, 7, 1, 0, 0, 1};
    printf("%lf\n", pidrahuvatu_koeficienty(x, arr3, 10));
    double arr4[] = {16, 8, 5, 2, 1};
    printf("%lf\n", pidrahuvatu_koeficienty(x, arr4, 5));
    double arr5[] = {1, 0, 1, 0, 1, 0};
    printf("%lf", pidrahuvatu_koeficienty(x, arr5, 6));
}


