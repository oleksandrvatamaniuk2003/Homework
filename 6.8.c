#include <stdio.h>

int main(){
    int y;
    for(int i = 0; i < 256; i++){
        y = ((i & (i-1))>0);
        printf("i=%d, y=%d\n", i, y);
    }
    // y = ((x & (x-1))>0); - перевіряє чи є число степенем двійки
    for(int i = 0; i < 256; i++){
        y = i & (-i);
        printf("i=%d, y=%d\n", i, y);
    } 
    // y = x & (-x); - знаходить найбільшу степінь двійки на яку ділиться число
}