#include <iostream>



class Naturalne_chyslo 
{
    public:
        Naturalne_chyslo()
        {
            initial_value_1 = 1;
            initial_value_2 = 1;
        }
        

        Naturalne_chyslo(bool random)

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

        Naturalne_chyslo(int input_numerator, int input_denominator) 
        {
            int variable_not_count = initial_value_1, number_rationalizer = initial_value_2;
            if(!set_numerator(input_numerator) || !set_denominator(input_denominator))
            {
                std::cout << "Incorrect number!\nInput declined!";
                initial_value_1 = variable_not_count;
                initial_value_2 = number_rationalizer;
            }
            reduceFraction();
        }

        Naturalne_chyslo operator + (Naturalne_chyslo const &obj){
            Naturalne_chyslo vidpovid;

            vidpovid.set_numerator(initial_value_1*obj.initial_value_2 + obj.initial_value_1*initial_value_2);
            vidpovid.set_denominator(obj.initial_value_2*initial_value_2);
            vidpovid.reduceFraction();

            return vidpovid;
        }

        void operator += (Naturalne_chyslo const &obj){
            initial_value_1 = initial_value_1*obj.initial_value_2 + obj.initial_value_1*initial_value_2;
            initial_value_2 = obj.initial_value_2*initial_value_2;
            reduceFraction();
        }

        Naturalne_chyslo operator - (Naturalne_chyslo const &obj){
            Naturalne_chyslo vidpovid;

            vidpovid.set_numerator(initial_value_1*obj.initial_value_2 - obj.initial_value_1*initial_value_2);
            vidpovid.set_denominator(obj.initial_value_2*initial_value_2);
            vidpovid.reduceFraction();

            return vidpovid;
        }

        Naturalne_chyslo operator * (Naturalne_chyslo const &obj){
            Naturalne_chyslo vidpovid;

            vidpovid.set_numerator(initial_value_1*obj.initial_value_1);
            vidpovid.set_denominator(initial_value_2*obj.initial_value_2);
            vidpovid.reduceFraction();

            return vidpovid;
        }

        Naturalne_chyslo operator / (Naturalne_chyslo const &obj){
            Naturalne_chyslo vidpovid;

            vidpovid.set_numerator(initial_value_1*obj.initial_value_2);
            vidpovid.set_denominator(initial_value_2*obj.initial_value_1);
            vidpovid.reduceFraction();

            return vidpovid;
        }

        bool operator < (Naturalne_chyslo const &obj)
        {
            Naturalne_chyslo vidpovid;
            if(initial_value_1 >= 0 && obj.initial_value_1 <= 0)
            {
                return false;
            }
            if(initial_value_1 < 0 && obj.initial_value_1 >= 0)
            {
                return true;
            }
            vidpovid = *this - obj;
            return (vidpovid.initial_value_1 < 0);
        }

        bool operator > (Naturalne_chyslo const &obj)
        {
            Naturalne_chyslo vidpovid;
            if(initial_value_1 >= 0 && obj.initial_value_1 <= 0)
            {
                return true;
            }
            if(initial_value_1 < 0 && obj.initial_value_1 >= 0)
            {
                return false;
            }
            vidpovid = *this - obj;
            return (vidpovid.initial_value_1 > 0);
        }
        
        void show()
        {
            std::cout << initial_value_1 << "/" << initial_value_2 << "\n";
        }

        void enter()
        {
            int input_numerator, input_denominator = 0;
            while(true)
            {
                std::cout << "Enter initial_value_1: ";
                std::cin >> input_numerator;
                if(set_numerator(input_numerator))
                {
                    break;
                }
            }
            while(true)
            {
                std::cout << "Enter initial_value_2: ";
                std::cin >> input_denominator;
                if(set_denominator(input_denominator))
                {
                    break;
                }
            }
        }

    private:
        int initial_value_1;
        int initial_value_2;

        bool set_numerator(int input_numerator)
        {
            initial_value_1 = input_numerator;
            return true;
        }

        bool set_denominator(int input_denominator)
        {
            if(input_denominator > 0)
            {
                initial_value_2 = input_denominator;
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
            int vvedene_chyslo_nayb_spil_dilnyk = gcd(std::abs(initial_value_1), initial_value_2);
            initial_value_1 /= vvedene_chyslo_nayb_spil_dilnyk;
            initial_value_2 /= vvedene_chyslo_nayb_spil_dilnyk;
        }
};

int main()
{
    const int n = 4;
    Naturalne_chyslo array[n], min_object;
    
    for(int iterating_object_1 = 0; iterating_object_1 < n; iterating_object_1++)
    {
        array[iterating_object_1].enter();
    }
    min_object = array[0];
    
    for(int iterating_object_1 = 0; iterating_object_1 < n; iterating_object_1 +=1 )
    {
        if(array[iterating_object_1] < min_object)
        {
            min_object = array[iterating_object_1];
        }
    }
    min_object.show();

    Naturalne_chyslo eps_object(1, 200), precision_counter(-1, 100);
    Naturalne_chyslo sum;
    int iterating_object_1 = 2;
    while(true){
        Naturalne_chyslo temp((iterating_object_1%2)*2 - 1, iterating_object_1*iterating_object_1);
        temp.show(); 
        if(temp < eps_object && temp > precision_counter){
            break;
        }
        sum += temp;
        iterating_object_1++;
    }
    sum.show();
}





