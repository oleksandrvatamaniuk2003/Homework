#include <stdio.h>

int main(){
    const size = 4;
    int temp;
    int arr[] = {5, 112, 4, 3};
    for(int i = 0; i < size/2; i++){
        temp = arr[i];
        arr[i] = arr[size-i-1];
        arr[size-i-1] = temp;
    }
    for(int i = 0; i < size; i++){
        printf("%d, ", arr[i]);
    }
    
}