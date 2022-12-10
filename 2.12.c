#include <stdio.h>
#include <math.h>
double calcSegmentLength(double x1, double y1, double x2, double y2){
    return sqrt(pow(x2-x1, 2) + pow(y2-y1, 2));
}

double calcTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3){
    double a = calcSegmentLength(x1, y1, x2, y2);
    double b = calcSegmentLength(x2, y2, x3, y3);
    double c = calcSegmentLength(x1, y1, x3, y3);
    return sqrt((a+b-c)*(a+c-b)*(b+c-a)*(a+b+c))/4;
}

int main(){
    double x1, y1, x2, y2, x3, y3;
    scanf("%lf %lf\n%lf %lf\n%lf %lf", &x1, &y1, &x2, &y2, &x3, &y3);
    printf("%lf", calcTriangleArea(x1, y1, x2, y2, x3, y3));
}