#include <stdio.h>


int main(){
    double val_1 = 14.3;
    int val_2 = 13.7;
    double iter_use = val_1;
    val_1 = 1;
    while(val_2 > 0){
        if(val_2 % 2 == 1){
            val_1 *= iter_use;
        }
        iter_use *= iter_use;
        val_2 /= 2;
        printf("%d\n", val_2);
    }
    printf("%f", val_1);

}

