#include <iostream>
#include <string>


std::string strip(std::string &a){
    int colon = -1, comma = -1;
    for(int i = 0; i < a.length(); i++){
        if(a[i] == ':' && colon == -1){
            colon = i;
        } 
        if(colon != -1 && a[i] == ','){
            comma = i;
            break;
        }
    }
    if(colon == -1){
        return a;
    } else {
        std::string b; 
        if(comma == -1){
            b.append(a, colon+1, b.length()-colon-1);
        } else {
            b.append(a, colon+1, comma-colon-1);
        }
        // перезапис
        a = b;
        return b;
    }
    
}

int main(){
    std::string a = "dasdasdasdsa:dsadasddsadsadads:dasdsa";
    std::cout << strip(a) << "\n" << a;
}