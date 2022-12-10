#include <stdio.h>

int main(){
    unsigned char x;
    scanf("%u", &x);
    unsigned long long d = 1, t = 2;
    for(int bit=0; bit<8; bit++){
        if(x >> bit & 1){
            d *= (x >> bit & 1) * t;
        }
        t *= t;
    }
    printf("%llu", d);
}