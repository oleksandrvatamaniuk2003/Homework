#include <stdio.h>
int main(){
    int nat, x;
    scanf("%d %d", &nat, &x);
    printf("%*c", nat, ' ');
    printf("%d", x);
    printf("\nat%*c", 4*nat, ' ');
    printf("%d", x*x);
}


