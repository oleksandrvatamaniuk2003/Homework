#include <stdio.h>

int main(){
    int n, k;
    printf("n=");
    scanf("%d", &n);
    printf("k=");
    scanf("%u", &k);
    n = n | (1<<k);
    printf("%d", n);
}