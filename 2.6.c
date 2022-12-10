#include <stdio.h>
#include <math.h>
int main(){
    double x;
    int min, max, rounded;
    scanf("%lf", &x);
    int whole = (int) x;
    double fract = x - whole;
    if(x < 0){
        min = whole - 1;
        max = whole;
        rounded = max;

        if(fract == 0){
            max = whole;
            min = whole;
        } else if(fract < -0.5) {
            rounded = min;
        }
    } else{
        min = whole;
        max = whole + 1;
        rounded = min;

        if(fract == 0){
            max = whole;
            min = whole;
        } else if(fract > 0.5) {
            rounded = max;
        }
    }
    double fract2,whole2;
    int min2, max2, rounded2;
    double x2 = x;
    min2 = floor(x); max2 = ceil(x); rounded2 = roundl(x);
    fract2 = modf(x2, &whole2);
    printf("%f %f %f %d %d %d\n", x, whole2, fract2, min2, max2, rounded2);
    printf("%f %d %f %d %d %d", x, whole, fract, min, max, rounded);
}