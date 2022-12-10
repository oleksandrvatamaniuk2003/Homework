#include <stdio.h>

int main(){
    int x, a, b, c;
    scanf("%u", &x);
    a = x%10;
    x /= 10;
    b = x%10;
    x /= 10;
    c = x%10;
    if (a != b && b != c && a != c){
        // function is taken from the home task for Combinatorics, sorry for spaghetti code  
        const int n = 3;
        int directions[n], numbers[n];
        // for direction 1 is ->, -1 is <-
        for(int i = 1; i <= n; i++){
            directions[i-1] = -1;
            numbers[i-1] = i;
        }
        int isMobile = 1, maxElement, maxKey;
        while(isMobile){

            printf("\n");
            for(int i = 0; i < n; i++){
                if(numbers[i] == 1){
                    printf(" %d ", a);
                }
                else if(numbers[i] == 2){
                    printf(" %d ", b);
                }
                else{
                    printf(" %d ", c);
                }
            }
            maxElement = 0, maxKey = 0, isMobile = 0;
            for(int i = 0; i < n; i++){
                if( i + directions[i] >= 0 && i + directions[i] < n){
                    if(numbers[i] > numbers[i + directions[i]] && numbers[i] > maxElement){
                        maxKey = i;
                        maxElement = numbers[i];
                        isMobile = 1;

                    }
                }

            }
            if(isMobile){

                numbers[maxKey] = numbers[maxKey + directions[maxKey]];
                numbers[maxKey + directions[maxKey]] = maxElement;
                int tempDirection = directions[maxKey];
                directions[maxKey] = directions[maxKey + tempDirection];
                directions[maxKey + tempDirection] = tempDirection;
                for(int i = 0; i < n; i++){
                    if(numbers[i] > maxElement){
                        directions[i] = -directions[i];
                    }
                }
            }


        }
    }
}