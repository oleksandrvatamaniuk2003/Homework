#include <stdio.h>

int main(){
    int arr[5] = {rand(), rand(), rand(), rand(), rand()};
    int k, count = 0;
    printf("k=");
    scanf("%d", &k);
    for(int i = 0; i < 5; i++){
        if(arr[i] < k){
            count++;
        }
    }
    printf("Count=%d", count);
}