#include <stdio.h>

int main(){
    int k, m, j;
    printf("k=");
    scanf("%d", &k);
    k = k >> 24 | k << 24 | (((k >> 8) << 16) >> 8);
    printf("%d\n", k);
    printf("%x", k);
}