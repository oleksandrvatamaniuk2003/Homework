#include <stdlib.h>
#include <math.h>
int main(){
    unsigned int elements_amount = 100;
    double eps = 0.00000001;
    int *dyn_array = (int*) malloc(elements_amount * sizeof(int));
    int num, i = 0, sum1 = 0, sum2 = 0;
    printf("Enter number: ");
    scanf("%d", &num);
    while(num != 0){
        dyn_array[i] = num;
        printf("Enter number: ");
        scanf("%d", &num);
        i++;
    }
    for(int j = 0; j < i; j++){
        if(fabs(pow((double) dyn_array[j], 0.5) - round(pow((double) dyn_array[j], 0.5))) < eps){
            sum1 += 1;
        }
        if(fabs(pow((double) dyn_array[j], 0.3333333333333) - round(pow((double) dyn_array[j], 0.3333333333333))) < eps){
            sum2 += 1;
        }
    }
    printf("Squares: %d", sum1);
    printf("\nCubes: %d", sum2);
}