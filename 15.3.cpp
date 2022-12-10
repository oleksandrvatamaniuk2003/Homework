#include <iostream>
#include <string>


std::string split(std::string str){
    int start = 0, min_length = 10000, i = 0;
    std::string min_str;
    // все
    // std::string min_str[100];
    for(int j = 0; j < str.length(); j++){
        if(str[j] == ',' || str[j] == '.' || str[j] == ' ' || str[j] == '\n'){
            if(str[j-1] == ',' || str[j-1] == '.' || str[j-1] == ' ' || str[j-1] == '\n'){}
            else {
                std::string a;
                a.append(str, start, j-start);
                // первую
                if(a.length() < min_length){
                    min_length = a.length();
                    min_str = a;
                }
                // // последнюю
                // if(a.length() < min_length){
                //     min_length = a.length();
                //     min_str = a;
                // }
                // // все
                // if(a.length() < min_length){
                //     min_length = a.length();
                //     min_str->clear();
                //     i = 0;
                //     min_str[i] = a;
                //     i++;
                // } else if(a.length() == min_length){
                //     min_str[i] = a;
                //     i++;
                // }
            }
            start = j+1;
        }
    }   
    return min_str;          
}

int main(){
    std::string str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam lobortis eros neque, in sagittis augue sodales vitae. Suspendisse quis augue nec lacus";
    std::cout << split(str);
}