#include <stdio.h>

int main(){
    long long n = 11, two = 1, fact = 1;
    double ak = 1, s = 0;
    for(int k = 1; k <= n; k++){
        two *= 2;
        fact *= k;
        ak =  k*ak + 1./k;
        s += (two*ak)/fact;
    }
    printf("Sum=%lf", s);
}