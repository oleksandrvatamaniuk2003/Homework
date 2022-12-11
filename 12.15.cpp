#include <iostream>
#include <string>
#include <cmath>
using namespace std;

int main(){
    char quotient1[9], quotient2[9], quotient3[9];
    cin >> quotient1 >> quotient2 >> quotient3;
    char qtr1[7] = {quotient1[2], quotient1[3], quotient1[4], quotient1[5], quotient1[6], quotient1[7], quotient1[8]};
    char qtr2[7] = {quotient2[2], quotient2[3], quotient2[4], quotient2[5], quotient2[6], quotient2[7], quotient2[8]};
    char qtr3[7] = {quotient3[2], quotient3[3], quotient3[4], quotient3[5], quotient3[6], quotient3[7], quotient3[8]};
    float a3 = atof(qtr1);
    float precision = 0.00001;
    float b3 = atof(qtr2);
    float c3 = atof(c2);
    if(fabs(a3) < precision || fabs(b3) < precision || fabs(c3) < precision){
        cout << "Vvedit' inshi znachennya";
    } else {
        float harmonic = 3/((1/a3) + (1/b3) + (1/c3));
    }
}