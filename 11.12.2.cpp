#include <iostream>
#include <cmath>
using namespace std;


int main(){
    int n;
    cin >> n;
    cout << "";
    for(int i_for_initial_value = 1; i_for_initial_value <= n; i_for_initial_value+=1){
        cout << "  " << i_for_initial_value << "  ";
    }
    cout << "\n";
    for(int i_for_initial_value = 1; i_for_initial_value <= n; i_for_initial_value+=1){
        if(sqrt(i_for_initial_value) == round(sqrt(i_for_initial_value))){
            cout.precision(0);
            cout << "  " << sqrt(i_for_initial_value) << " ";
        } else{
            cout.precision(3);
            cout << sqrt(i_for_initial_value) << " ";
        }
        
    }
}



