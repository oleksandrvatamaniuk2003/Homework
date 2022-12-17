#pragma once
#include <iostream>
#include <float.h>

using namespace std;

//Тип перерахування
enum Typeinterval {NO, PLUS_INF, MINUS_INF, ALL};

struct Interval {
    double a, b;
    Typeinterval t;
    //Конструктор за замовчуванням
    Interval(): t(ALL), a(DBL_MIN), b(DBL_MAX) {};
    //Конструктор з параметрами
    Interval(Typeinterval _t, int _a, int _b): a(_a), b(_b), t(_t) {};
    //Конструктор копіювання
    Interval(const Interval& i): a(i.a), b(i.b), t(i.t) {};
    //Деструктор
    ~Interval(){};

    //Функція вводу інтервалу з потоку
    friend istream&operator>>(istream& in, Interval& i);

    //Функція виводу інтервалу у потік
    friend ostream&operator<<(ostream& out, const Interval& i);

    //Функція перетину двох інтервалів
    Interval operator*(Interval i);

    //Функція об'єднання двох інтервалів
    Interval operator+(Interval i);

    //Функція різниці двох інтервалів
    Interval operator-(Interval i);

};
//Функція рівності двох інтервалів
inline bool operator==(const Interval& lhs, const Interval& rhs) { return lhs.a == rhs.a && lhs.b == rhs.b; }
inline bool operator!=(const Interval& lhs, const Interval& rhs) { return !(lhs == rhs); }
