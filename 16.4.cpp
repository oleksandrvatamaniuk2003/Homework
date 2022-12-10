#include <iostream>
#include <fstream>
#include <string>

float split(std::string str){
    int start = 0, sign = 1;
    float sum = 0;
    std::string temp;
    for(int j = 0; j < str.length(); j++){
        if((str[j] == '+' || str[j] == '-' || str[j] == '=' ) && j != 0){
            temp = str.substr(start, j-start); 
            start = j+1;
            sum += sign * stof(temp);
            sign = -1 + 2*(str[j] == '+');
        }
    }   
    return sum;     
}

int main(){
    std::string line;
    std::ifstream myfile ("example.txt");
    if (myfile.is_open()){
        getline(myfile, line);
        std::cout << split(line);
        myfile.close();
    }
}