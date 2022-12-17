#pragma once
#include "SetIntevals.h"
#include <cmath>

using namespace std;

//Тип перерахування
enum Type {BIGGER, LOWER, EQUAL, NOT_EQUAL, BIGGER_EQUAL, LOWER_EQUAL};

struct SquareInrquality {
    double a, b, c;
    Type t;
    //Конструктор за замовчуванням
    SquareInrquality():a(0), b(0), c(0), t(EQUAL) {};
    //Конструктор з параметрами
    SquareInrquality(Type _t, double _a, double _b, double _c): t(_t), a(_a), b(_b), c(_c) {};

    //Метод який повертає значення рівняння для Х
    double getValue(double x);

    //Функція яка повертає результат розв'язку рівняння
    SetIntevals solve();
};

