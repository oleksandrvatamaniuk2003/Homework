#include <stdio.h>
#include <math.h>
#include <float.h>
int func_vyrishyty_kvadr_rivn(double val_1, double val_2, double val_3){
    double var_1, var_2;
    double D = val_2*val_2 - 4*val_1*val_3;
    double epsilon = 2 * DBL_EPSILON;
    if(fabs(val_1) < epsilon){
        if(fabs(val_2) < epsilon){
            if(fabs(val_3) < epsilon){
                printf("inf\n");
                return -1;
            }
            printf("Vvedit' schche raz\n");
            return 0;
        }
        printf("Znaydeno 1 korin'\n");
        var_1 = val_3 / val_2;
        printf("var_1=%lf\n", var_1);
        return 1;
    }
    if(fabs(D) < epsilon){
        printf("Total: 1 korin' ");
        var_1 = (-val_2) / 2 / val_1;
        printf("x=%lf\n", var_1);
        return 1;
    } else if(D < 0){
        printf("Total: 0 koreniv\n");
        return 0;
    } else {
        printf("Total: 2 koreni");
        var_1 = (-val_2 + sqrt(D)) / 2 / val_1;
        var_2 = (-val_2 - sqrt(D)) / 2 / val_1;
        printf("var_1=%lf\nx2=%lf]\n", var_1, var_2);
        return 2;
    }
}

int main(){
    double val_1 = 0, val_2 = 0, val_3 = 0, var_1, var_2;
    scanf("%lf %lf %lf", &val_1, &val_2, &val_3);
    printf("Equation %lf*x^2 + %lf * x + %lf = 0 has %d roots", val_1, val_2, val_3, func_vyrishyty_kvadr_rivn(val_1, val_2, val_3));
}




