#include <iostream>
#include <string>

void split(std::string str){
    int initial_value = 0, min_length = 10000, resulting_sum = 0, iterating_counter = 0;
    std::string min_str;
    for(int j = 0; j < str.length(); j++){
        if(str[j] == ',' || str[j] == '.' || str[j] == ' ' || str[j] == '\n'){
            if(str[j-1] == ',' || str[j-1] == '.' || str[j-1] == ' ' || str[j-1] == '\n'){}
            else {
                std::string a;
                a.append(str, initial_value, j-initial_value);
                for(int iterator_value_2 = 1; iterator_value_2 < a.length(); iterator_value_2 = iterator_value_2+1){
                    if(toupper(a[iterator_value_2]) == toupper(a[iterator_value_2-1])){
                        if(toupper(a[iterator_value_2]) != 'A' && toupper(a[iterator_value_2]) != 'U' && toupper(a[iterator_value_2]) != 'E' && toupper(a[iterator_value_2]) != 'I' && toupper(a[iterator_value_2]) != 'O'){
                            iterating_counter += 1;
                            break;
                        }
                    }
                }
                resulting_sum += 1;
            }
            initial_value = j+1;
        }
    }  
    std::cout.precision(3);
    std::cout <<  ((double) iterating_counter/resulting_sum) * 100 << "%\n";          
}

int main(){
    std::string str = "It depends, what degree to choose. If you wanna code all night long, then the faculty of mechanics and mathematics is your choice";
    split(str);
}