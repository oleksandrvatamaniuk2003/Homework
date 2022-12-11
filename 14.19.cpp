#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <type_traits>

char zzadu_napered_func(char str, int len){
    for(int iterator_1=0; iterator_1<len/2; iterator_1++)
    {
        char temp = str[iterator_1];
        str[iterator_1]=str[len-iterator_1-1];
        str[len-iterator_1-1]=temp;
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
            verifying = (uint32_t) zzadu_napered_func(temp, 4);
        }
        fs.read(&temp, sizeof(uint32_t));
        if(LE){
            k = (uint32_t) zzadu_napered_func(temp, 4);
        }

        for(uint32_t iterator_1 = 0; iterator_1 < k; iterator_1++){
            uint32_t n, m;
            if(!fs.read(&temp, sizeof(uint32_t))){
                std::cout << "Error";
                isValid = false;
            }
            if(LE){
                n = (uint32_t) zzadu_napered_func(temp, 4);
            }
            if(!fs.read(&temp, sizeof(uint32_t))){
                std::cout << "Error";
                isValid = false;
            }
            if(LE){
                m = (uint32_t) zzadu_napered_func(temp, 4);
            }
        
            char picture[n*m];
            if(!fs.read(&picture, sizeof(n*m))){
                std::cout << "Nemozhlyvo prochytaty";
                isValid = false;
            }
            
            if(iterator_1 == K){
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
   readDB("fileeee1488.bin", 23);
}


