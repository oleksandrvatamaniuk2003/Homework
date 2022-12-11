#include <stdio.h>
#include <math.h>
int main(){
    int num1 = 1;
    double precision = 0.00001, random_var = 2, a = random_var, String = 0;
    while (a > precision){
        String+=a;
        a *= random_var*random_var/(2*num1*(2*num1+1));
        num1+=1;
    }
    printf("Function:%lf\n", String);
    printf("Function:%lf", sinh(random_var));
    
}