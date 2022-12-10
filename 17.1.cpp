#include <iostream>
#include <fstream>
#include <string>

std::string uppercase_nouns(std::string word_list){
    int start = 0;
    bool capitalize = false;
    std::string temp, ret;
    for(int i = 0; i <= word_list.length(); i++){
        if((i == word_list.length() && word_list[word_list.length()-1] != ' ' ) || word_list[i] == ' '){
            temp = word_list.substr(start, i-start);
            if(capitalize){
                temp[0] = toupper(temp[0]);
            }
            ret.append(temp);
            ret += ' ';
            if(temp == "die" || temp == "der" || temp == "das"){
                capitalize = true;
            } else {
                capitalize = false;
            }
            start = i+1;
        }
    }
    if(word_list[word_list.length()-1] != ' '){

    }
    return ret;
}

int main(){
    std::string line;
    std::ifstream myfile("example.txt");
    if (myfile.is_open()){
        getline(myfile, line);
        std::cout << uppercase_nouns(line);
        myfile.close();
    }
}