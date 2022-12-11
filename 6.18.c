#include <stdio.h>

int main(){
    int num1, num2;
    printf("num1=");
    scanf("%d", &num1);
    printf("num2=");
    scanf("%u", &num2);
    num1 = num1 | (1<<num2);
    printf("%d", num1);
}

