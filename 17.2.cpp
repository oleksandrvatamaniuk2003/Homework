#include <iostream>
#include <string>

void split(std::string str){
    int start = 0, min_length = 10000, count_total = 0, count_doubled = 0;
    std::string min_str;
    for(int j = 0; j < str.length(); j++){
        if(str[j] == ',' || str[j] == '.' || str[j] == ' ' || str[j] == '\n'){
            if(str[j-1] == ',' || str[j-1] == '.' || str[j-1] == ' ' || str[j-1] == '\n'){}
            else {
                std::string a;
                a.append(str, start, j-start);
                for(int k = 1; k < a.length(); k++){
                    if(toupper(a[k]) == toupper(a[k-1])){
                        if(toupper(a[k]) != 'A' && toupper(a[k]) != 'U' && toupper(a[k]) != 'E' && toupper(a[k]) != 'I' && toupper(a[k]) != 'O'){
                            count_doubled++;
                            break;
                        }
                    }
                }
                count_total++;
            }
            start = j+1;
        }
    }  
    std::cout.precision(3);
    std::cout <<  ((double) count_doubled/count_total) * 100 << "%\n";          
}

int main(){
    std::string str = "English texts for beginners to practice reading and comprehension online and for free. Practicing your comprehension of written English will both improve your vocabulary and understanding of grammar and word order. The texts below are designed to help you develop while giving you an instant evaluation of your progress.";
    split(str);
}