#include <stdio.h>

int main(){
    int n, m;
    scanf("%d %d", &n, &m);
    printf("%*c", n, ' ');
    printf("%d", m);
    printf("\n%*c", 2*n, ' ');
    printf("%d", m*m);
}