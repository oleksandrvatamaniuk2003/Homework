#include <iostream>
#include <fstream>
#include <string>
class Polynome{
    private:
        double *coeffs;
        int degree;

    public:

        Polynome(){
            degree = -1;
        }

        Polynome(int n){
            coeffs = (double *) malloc(n);
            degree = n-1;
        }

        Polynome(int n, double *array){
            coeffs = array;
            degree = n-1;
        }

        Polynome(const Polynome &poly) : coeffs(poly.coeffs), degree(poly.degree){
            std::cout << "Copied!\n";
        }

        ~Polynome(){
            delete[] coeffs;
            delete &degree;
        }

        friend std::ostream& operator<<(std::ostream& out, const Polynome &poly);

        friend std::istream& operator>>(std::istream& in, Polynome &poly);

        friend std::fstream& write(std::fstream& file, const Polynome &poly);

        void fill(){
            for(int i = 0; i <= degree; i++){
                std::cout << "coef(x^" << i << ") = ";
                std::cin >> coeffs[i];
            }
        }

        void fill_coeff(int i, double k){
            coeffs[i] = k;
        }

        void print(){
            std::cout << "f(x) = ";
            for(int i = degree; i > 0; i--){
                std::cout << coeffs[i] << "*x**" << i << " + ";
            }
            std::cout << coeffs[0] << "*x**0\n";
        }
};

std::ostream& operator<<(std::ostream& out, const Polynome &poly)
{
    out << "f(x) = ";
    for(int i = poly.degree; i > 0; i--){
        out << poly.coeffs[i] << "*x**" << i << " + ";
    }
    out << poly.coeffs[0] << "*x**0\n";
    return out;
}

std::fstream& write(std::fstream& file, const Polynome &poly)
{
    std::string str;
    file.write("f(x) = ", sizeof(char)*7);
    for(int i = poly.degree; i > 0; i--){
        str = std::to_string(poly.coeffs[i]);
        file.write(str.c_str(), sizeof(char)*str.length());
        file.write("*x**", sizeof(char)*4);
        str = std::to_string(i);
        file.write(str.c_str(), sizeof(char)*str.length());
        file.write(" + ", sizeof(char)*3);
    }
    str = std::to_string(poly.coeffs[0]);
    file.write(str.c_str(), sizeof(char)*str.length());
    file.write("*x**0\n", sizeof(char)*7);
    return file;
}

std::istream& operator>>(std::istream& in, Polynome &poly)
{
    std::cout << "n = ";
    std::cin >> poly.degree;
    poly.degree--;
    poly.coeffs = (double *) realloc(poly.coeffs, poly.degree * sizeof(double));
    for(int i = 0; i <= poly.degree; i++){
        std::cout << "coef(x^" << i << ") = ";
        std::cin >> poly.coeffs[i];
    }
    return in;
}

int main(){
    int n = 5;
    double array[n] = {1.0, 2.0, 3.0, 4.0, 5.0};
    Polynome poly(n, array);
    poly.fill_coeff(2, 5);
    poly.print();
    Polynome cop = poly;
    std::cout << cop;
    Polynome cat;
    std::cin >> cat;
    std::cout << cat;
    std::ofstream output("example.bin", std::ios::binary);
    output << cat;
    output.close();
}