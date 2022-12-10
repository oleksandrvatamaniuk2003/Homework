#include <stdio.h>
#include <math.h>
#include <float.h>
int sqr_eqn_solver(double a, double b, double c){
    double x1, x2;
    double D = b*b - 4*a*c;
    double epsilon = 2 * DBL_EPSILON;
    if(fabs(a) < epsilon){
        if(fabs(b) < epsilon){
            if(fabs(c) < epsilon){
                printf("INFINITY\n");
                return -1;
            }
            printf("Not equation\n");
            return 0;
        }
        printf("One linear root\n");
        x1 = c / b;
        printf("x1=%lf\n", x1);
        return 1;
    }
    if(fabs(D) < epsilon){
        printf("One root ");
        x1 = (-b) / 2 / a;
        printf("x=%lf\n", x1);
        return 1;
    } else if(D < 0){
        printf("No roots\n");
        return 0;
    } else {
        printf("Two roots ");
        x1 = (-b + sqrt(D)) / 2 / a;
        x2 = (-b - sqrt(D)) / 2 / a;
        printf("x1=%lf\nx2=%lf]\n", x1, x2);
        return 2;
    }
}

int main(){
    double a = 0, b = 0, c = 0, x1, x2;
    scanf("%lf %lf %lf", &a, &b, &c);
    printf("Equation %lf*x^2 + %lf * x + %lf = 0 has %d roots", a, b, c, sqr_eqn_solver(a, b, c));
}
