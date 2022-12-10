#include <iostream>
#include <cmath>
using namespace std;
int main(){
    int n;
    cin >> n;
    cout << "++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
    for(int i = 1; i <= n; i++){
        cout << "  " << i << "  ";
    }
    cout << "\n++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
    for(int i = 1; i <= n; i++){
        if(sqrt(i) == round(sqrt(i))){
            cout.precision(0);
            cout << "  " << sqrt(i) << "  ";
        } else{
            cout.precision(3);
            cout << sqrt(i) << " ";
        }
        
    }
}