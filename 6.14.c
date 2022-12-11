#include <stdio.h>

int main(){
    int num1;
    printf("num1=");
    scanf("%d", &num1);
    int checker = 0;
    for(int iter = 0; iter < 8*sizeof(num1); iter++){
        if(((num1 >> iter) & 1) == 0){
            checker+=1;
        }
    }
    printf("Dovzhyna: %d", checker);
}

