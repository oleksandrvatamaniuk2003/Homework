#include <stdio.h>

int function_number_finder(nat_num1){
    nat_num1 = nat_num1 | (1<<0);
    nat_num1 = nat_num1 | (1<<(sizeof(nat_num1)*3 - 7));
    return nat_num1;
}

int main(){
    int num1;
    printf("num1=");
    scanf("%d", &num1);
    printf("nat_num1=%d", function_number_finder(num1));
}