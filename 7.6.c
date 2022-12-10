#include <stdio.h>

void oddEven(int *ret){
    int arr[50], i = 0, even = 0, odd = 0;
    while(scanf("%d", &arr[i]) && arr[i] != 0){
        if(arr[i] % 2 == 0){
            ret[0]++;
        } else {
            ret[1]++;
        }
    }
}

int main(){
    int ret[2] = {0};
    oddEven(ret);
    printf("odd = %d\n even = %d", ret[0], ret[1]);
}