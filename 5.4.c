#include <stdio.h>
#include <math.h>
int main(){
    int k = 1;
    double e = 0.00000001, x = 2., a = x, s = 0;
    while (a > e){
        s+=a;
        a *= x*x/(2*k*(2*k+1));
        k+=1;
    }
    printf("sinh(x)=%lf\n", s);
    printf("sinh(x)=%lf", sinh(x));
    
}