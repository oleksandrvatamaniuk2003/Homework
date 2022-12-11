#include <stdio.h>
#include <math.h>

int main(){
    double a, b, c;
    scanf("%lf %lf", &a, &b);
    c = hypot(a, b);
    printf("%f", c);
}