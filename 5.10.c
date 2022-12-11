#include <stdio.h>

int main(){
    long long n = 11, variable_2 = 1, the_innit_counter = 1;
    double initial_value_given_2 = 1, s = 0;
    for(int nat_num = 1; nat_num <= n; nat_num = nat_num + 1){
        variable_2 *= 2;
        the_innit_counter *= nat_num;
        initial_value_given_2 =  nat_num*initial_value_given_2 + 1./nat_num;
        s += (variable_2*initial_value_given_2)/the_innit_counter;
    }
    printf("Resultat%lf", s);
}