#include <stdio.h>

int main(){
    double a, b;
    scanf("%lf", &a);
    scanf("%lf", &b);
    double c = a * b, d = a - b;
    printf("%.2f %.2f", c, d);
}