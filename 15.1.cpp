#include <iostream>

class RationalNumber 
{
    public:
        RationalNumber()
        {
            numerator = 1;
            denominator = 1;
        }
        
        RationalNumber(bool random)
        {
            if(random)
            {
                while(true){
                    int rand_numerator = rand() * ((-2)*(rand()%2) + 1),
                        rand_denominator = rand() + 1;
                    if(set_numerator(rand_numerator) && set_denominator(rand_denominator))
                    {
                        break;
                    }
                }
                
            }
            reduceFraction();
        }

        RationalNumber(int input_numerator, int input_denominator) 
        {
            int temp_numerator = numerator, temp_denominator = denominator;
            if(!set_numerator(input_numerator) || !set_denominator(input_denominator))
            {
                std::cout << "Incorrect number!\nInput declined!";
                numerator = temp_numerator;
                denominator = temp_denominator;
            }
            reduceFraction();
        }

        RationalNumber operator + (RationalNumber const &obj){
            RationalNumber result;

            result.set_numerator(numerator*obj.denominator + obj.numerator*denominator);
            result.set_denominator(obj.denominator*denominator);
            result.reduceFraction();

            return result;
        }

        void operator += (RationalNumber const &obj){
            numerator = numerator*obj.denominator + obj.numerator*denominator;
            denominator = obj.denominator*denominator;
            reduceFraction();
        }

        RationalNumber operator - (RationalNumber const &obj){
            RationalNumber result;

            result.set_numerator(numerator*obj.denominator - obj.numerator*denominator);
            result.set_denominator(obj.denominator*denominator);
            result.reduceFraction();

            return result;
        }

        RationalNumber operator * (RationalNumber const &obj){
            RationalNumber result;

            result.set_numerator(numerator*obj.numerator);
            result.set_denominator(denominator*obj.denominator);
            result.reduceFraction();

            return result;
        }

        RationalNumber operator / (RationalNumber const &obj){
            RationalNumber result;

            result.set_numerator(numerator*obj.denominator);
            result.set_denominator(denominator*obj.numerator);
            result.reduceFraction();

            return result;
        }

        bool operator < (RationalNumber const &obj)
        {
            RationalNumber result;
            if(numerator >= 0 && obj.numerator <= 0)
            {
                return false;
            }
            if(numerator < 0 && obj.numerator >= 0)
            {
                return true;
            }
            result = *this - obj;
            return (result.numerator < 0);
        }

        bool operator > (RationalNumber const &obj)
        {
            RationalNumber result;
            if(numerator >= 0 && obj.numerator <= 0)
            {
                return true;
            }
            if(numerator < 0 && obj.numerator >= 0)
            {
                return false;
            }
            result = *this - obj;
            return (result.numerator > 0);
        }
        
        void show()
        {
            std::cout << numerator << "/" << denominator << "\n";
        }

        void enter()
        {
            int input_numerator, input_denominator = 0;
            while(true)
            {
                std::cout << "Enter numerator: ";
                std::cin >> input_numerator;
                if(set_numerator(input_numerator))
                {
                    break;
                }
            }
            while(true)
            {
                std::cout << "Enter denominator: ";
                std::cin >> input_denominator;
                if(set_denominator(input_denominator))
                {
                    break;
                }
            }
        }

    private:
        int numerator;
        int denominator;

        bool set_numerator(int input_numerator)
        {
            numerator = input_numerator;
            return true;
        }

        bool set_denominator(int input_denominator)
        {
            if(input_denominator > 0)
            {
                denominator = input_denominator;
                return true;
            }
            return false;
        }

        int gcd(int m, int n)
        {
            return n ? gcd(n, m % n) : m;
        }

        void reduceFraction()
        {
            int NOD = gcd(std::abs(numerator), denominator);
            numerator /= NOD;
            denominator /= NOD;
        }
};

int main()
{
    const int n = 4;
    RationalNumber array[n], min_object;
    
    for(int i = 0; i < n; i++)
    {
        array[i].enter();
    }
    min_object = array[0];
    
    for(int i = 0; i < n; i++)
    {
        if(array[i] < min_object)
        {
            min_object = array[i];
        }
    }
    min_object.show();

    RationalNumber eps_object(1, 200), eps_object2(-1, 100);
    RationalNumber sum;
    int i = 2;
    while(true){
        RationalNumber temp((i%2)*2 - 1, i*i);
        temp.show(); 
        if(temp < eps_object && temp > eps_object2){
            break;
        }
        sum += temp;
        i++;
    }
    sum.show();
}
    