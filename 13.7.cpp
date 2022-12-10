#include <iostream>
#include <string>

std::string strip(std::string &a){
    int dot1 = -1, dot2 = -1;
    for(int i = 0; i < a.length(); i++){
        if(a[i] == '.' && dot1 == -1){
            dot1 = i;
        } else if(dot1 != -1 && a[i] == '.'){
            dot2 = i;
            break;
        }
    }
    std::string b; 
    if(dot1 == -1){
        for(int i = 0; i < a.length(); i++){
            if(a[i] != ' '){
                b.append(a, i+1, a.length() - i - 1);
                break;
            }
        }
    } else {
        if(dot2 == -1){
            b.append(a, dot1, a.length()-dot1);
        } else {
            b.append(a, 0, dot1);
            b.append(a, dot2+1, a.length()-dot2-1);
        }
    }
    // перезапис
    a = b;
    std::cout << a;
    return b;
}

int main(){
    std::string a = "Lorem    ipsun dolor bolor   dsda d";
    std::cout << strip(a) << "\n" << a;
}