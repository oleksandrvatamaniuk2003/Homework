#include <stdio.h>
#include <math.h>

double chysl_count_func(double x, double y){
    return 100*pow((pow(x, 2) - y), 2) + pow(x-1, 2);
}

int main(){
    double x1 = 5, y1 = 5, x2 = -16812, y2 = 12, x3 = 144.12, y3 = 701;
    printf("%lf\n", chysl_count_func(x1, y1));
    printf("%lf\n", chysl_count_func(x2, y2));
    printf("%lf", chysl_count_func(x3, y3));
}


