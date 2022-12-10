#include <iostream>
#include <fstream>
#include <sstream>
#include <string>

bool checkTags(std::string html){
    bool hasOpenedParenthesis = 0;
    int lastOpened = 0, t = html.length(), i;
    for(i = 0; i < t; i++){
        if(html.substr(i, 4) == "<td>"){
            lastOpened = i;
            hasOpenedParenthesis = true;
        } 
        if(html.substr(i, 5) == "</td>"){
            if(hasOpenedParenthesis){
                html.replace(lastOpened, 4, "");
                html.replace(i-4, 5, "");
                t = html.length();
                i = -1;
                hasOpenedParenthesis = false;
            } else {
                return false;
            }
        }
    }
    return !hasOpenedParenthesis;
}

int main(){
    std::ifstream f("example.txt"); 
    std::string html;
    if(f) {
        std::ostringstream ss;
        ss << f.rdbuf(); 
        html = ss.str();
    }
    std::cout << checkTags(html);
}