#include <iostream>
#include <cmath>
using namespace std;

int main(){
    double x, y;
    cin >> x >> y;
    cout.precision(10);
    cout << pow(x, y) << "\n";
    cout << scientific << pow(x, y);
}