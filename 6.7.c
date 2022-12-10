#include <stdio.h>

int main(){
    int k;
    printf("k=");
    scanf("%d", &k);
    int maxLen = 0, tempLen = 0;
    for(int i = 0; i < 8*sizeof(k); i++){
        if((k >> i) & 1 == 1){
            tempLen++;
        } else{
            if(maxLen < tempLen){
                maxLen = tempLen;
            }
            tempLen = 0;
        }

    }
    if(maxLen < tempLen){
        maxLen = tempLen;
    }
    printf("Len=%d", maxLen);
}