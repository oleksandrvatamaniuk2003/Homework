#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <type_traits>

char reverseChar(char str, int len){
    for(int i=0; i<len/2; i++)
    {
        char temp = str[i];
        str[i]=str[len-i-1];
        str[len-i-1]=temp;
    }
    return str;
}

void readDB(std::string filename, uint32_t K){
    std::fstream fs(filename, std::ios::in | std::ios::binary);
    bool LE;
    int num = 1;
    LE = *(char *)&num == 1;
    if (fs.is_open())
    {
        bool isValid = true;
        uint32_t verifying, k, Kn, Km;
        char temp;
        char *pictureK;
        fs.read(&temp, sizeof(uint32_t));
        if(LE){
            verifying = (uint32_t) reverseChar(temp, 4);
        }
        fs.read(&temp, sizeof(uint32_t));
        if(LE){
            k = (uint32_t) reverseChar(temp, 4);
        }

        for(uint32_t i = 0; i < k; i++){
            uint32_t n, m;
            if(!fs.read(&temp, sizeof(uint32_t))){
                std::cout << "Unable to read size of picture!";
                isValid = false;
            }
            if(LE){
                n = (uint32_t) reverseChar(temp, 4);
            }
            if(!fs.read(&temp, sizeof(uint32_t))){
                std::cout << "Unable to read size of picture!";
                isValid = false;
            }
            if(LE){
                m = (uint32_t) reverseChar(temp, 4);
            }
        
            char picture[n*m];
            if(!fs.read(&picture, sizeof(n*m))){
                std::cout << "Unable to read picture's array!";
                isValid = false;
            }
            
            if(i == K){
                pictureK = (char *)malloc(n*m * sizeof(char));
                pictureK = picture;
                Kn = n;
                Km = m;
            }

        }
        if(isValid){
            for(uint32_t x = 0; x < Kn; x++){
                for(uint32_t y = 0; y < Km; y++){
                    const int f = x*Kn + y;
                    std::cout << pictureK[f] << " ";
                }
                std::cout << "\n";
            }
        }
        fs.close();
    }
    
}

int main(){
   readDB("example.bin", 23);
}