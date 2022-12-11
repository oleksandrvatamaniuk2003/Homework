#include <stdio.h>
#include <math.h>

int main(){
    double a, b, c, area;
    scanf("%lf %lf %lf", &a, &b, &c);
    area = sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a))/4;
    printf("%f", area);
}