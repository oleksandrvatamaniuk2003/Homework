#include <iostream>
#include <cmath>
class Point{
    private:
        static int count;
    public:
        double x;
        double y;
        Point(){ 
        
        } 
        void enter(double i_x, double i_y){ 
            x = i_x;
            y = i_y;
            count++;
        } 
        static int objCount() {
            return count;
        }

        double get_x(){
            return x;
        }

        double get_y(){
            return y;
        }
};
int Point::count;
main() {
    double x, y, perimetr = 0;
    std::string answer;
    Point dots[100];
    int i = 1;
    std::cout << "x=";
    std::cin >> x;
    std::cout << "y=";
    std::cin >> y; 
    dots[0].enter(x, y);
    while(true){
        std::cout << "Enter a vertex?\n";
        std::cin >> answer;
        if(answer == "y"){
            
            std::cout << "x=";
            std::cin >> x;
            std::cout << "y=";
            std::cin >> y; 
            dots[i].enter(x, y);
            perimetr += sqrt(pow((dots[i-1].get_x() - x), 2) + pow((dots[i-1].get_y() - y), 2));
            std::cout << "sqrt((" << dots[i-1].get_x() << "-" << x << ")^2 +" << "(" << dots[i-1].get_y() << "-" << y << "))" << "\n";
            i++;
            
        } else if(answer == "n"){
            break;
        } else {
            std::cout << "Incorrect answer!\n Only 'y' and 'n'!";
        }
    }
    perimetr += sqrt(pow((dots[0].get_x() - x), 2) + pow((dots[0].get_y() - y), 2));
    int cnt;
    cnt = Point::objCount();
    std::cout << "Number of objects:" << cnt << "\nPerimetr:" << perimetr;
}