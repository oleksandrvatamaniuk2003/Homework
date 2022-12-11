#include <stdio.h>
int main(){
    unsigned char v;
    scanf("%u", &v);
    unsigned long long dert = 1, temp_val = 2;
    for(int bit=0; bit<8; bit++){
        if(v >> bit & 1){
            dert *= (v >> bit & 1) * temp_val;
        }
        temp_val *= temp_val;
    }
    printf("%llu", dert);
}


