#include <stdio.h>
int main(){
    double a, b;
    scanf("%lf %lf", &a, &b);
    if (a > b){
        printf("Max = a = %lf\n", a);
        printf("Min = b = %lf", b);
    } else if(b > a){
        printf("Max = b = %lf\n", b);
        printf("Min = a = %lf", a);
    } else {
        printf("Min = Max = a = b = %lf", a);
    }
}