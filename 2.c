#include <stdio.h>
#include <math.h>

int main(){
    double m1, m2, r, g; 
    m1 = 2.12;
    m2 = 3.55;
    r = 1.54;
    g = 6.673*pow(10, -11);
    double F = (m1*m2*g)/pow(r, 2);

    printf("F=%e", F);
}