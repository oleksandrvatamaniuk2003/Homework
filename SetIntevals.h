#pragma once
#include "Interval.h"
#include <vector>

using namespace std;

class SetIntevals {
private:
    //Вектор інтервалів
    vector<Interval> intervals;
public:
    //Конструктор за замовчуванням
    SetIntevals() {};
    //Конструктор який приймає вектор інтервалів
    SetIntevals(vector <Interval> v): intervals(v) {};
    //Конструктор який приймає вектор пар чисел, а вже з цих чисел робить вектор інтервалів
    SetIntevals(vector <pair <double, double> > v);

    //Функція яка повертає результат перетину двох векторів інтервалів
    SetIntevals operator*(SetIntevals s) {
        SetIntevals res;
        for(int i = 0; i < min(intervals.size(), s.intervals.size()); ++i) {
            res.intervals.push_back(intervals[i] * s.intervals[i]);
        }
        return res;
    }

    //Функція яка повертає результат різниці двох векторів інтервалів
    SetIntevals operator-(SetIntevals s);

    //Функція яка повертає результат об'єднання двох інтервалів
    SetIntevals operator+(SetIntevals s);

    //Функція яка повертає загальну довжину вектору інтервалів
    double getLen() const;

    //Операція виводу вектору інтервалів
    friend ostream&operator<<(ostream& out, const SetIntevals s);
};
