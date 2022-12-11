#include <stdio.h>
#include <math.h>

int main(){
    double mass_1, mass_2, absolute_distance, free_fall_acceleration; 
    mass_1 = 2.12;
    mass_2 = 3.55;
    absolute_distance = 1.54;
    free_fall_acceleration = 6.673*pow(10, -11);
    double resulting_force = (mass_1*mass_2*free_fall_acceleration)/pow(absolute_distance, 2);

    printf("Force is:%e", resulting_force);
}