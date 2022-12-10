#include <stdio.h>
#include <math.h>

double Rosenbrock2d(double x, double y){
    return 100*pow((pow(x, 2) - y), 2) + pow(x-1, 2);
}

int main(){
    double x1 = 5, y1 = 5, x2 = -12412, y2 = 12, x3 = 123.123, y3 = -1245;
    printf("%lf\n", Rosenbrock2d(x1, y1));
    printf("%lf\n", Rosenbrock2d(x2, y2));
    printf("%lf", Rosenbrock2d(x3, y3));
}