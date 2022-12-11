#include <stdio.h>

int main(){

    unsigned char a;
    scanf("%hhu", &a);
    unsigned char b;
    scanf("%hhu", &b);
    unsigned short c = b *a;
    printf("%hu", c);
}