#include <stdio.h>

int main(){
    unsigned long m;
    int j;
    printf("m=");
    scanf("%llu", &m);
    printf("j=");
    scanf("%d", &j);
    m = m & ~(1<<j);
    printf("%d\n", m);
    printf("%x", m);
}