#include <stdio.h>
long long coins_nominals[5] = {1, 5, 10, 25, 50};
long long n = 19000;
long long sums[50000] = {0};
long long t;

long long Coins(long long n){
    if(n == 0){
        return 0;
    }
    long long minNum = 10000000000;
    for(long long i = 0; i < 5; i++){
        if(n-coins_nominals[i] >= 0){
            
            if (sums[n-coins_nominals[i]] != 0){
                t = sums[n-coins_nominals[i]] + 1;  
            } else {
                t = Coins(n-coins_nominals[i]) + 1;
                sums[n-coins_nominals[i]] = t - 1;
            }
            if (t < minNum){
                minNum = t;
            }
            
        }
    }
    return minNum;
}

int main(){
    
    printf("%lld", Coins(n));
}