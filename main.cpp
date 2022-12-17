#include <iostream>
#include "Interval.h"
#include "SetIntevals.h"
#include "SquareInrquality.h"

using namespace std;

void user_test() {
    Interval i1(NO, 5, 10);
    cout << i1 << endl;
    Interval i2(NO, 8, 12);
    cout << i2 << endl;
    cout << i1 * i2 << endl;
    cout << i1 + i2 << endl;
    cout << i1 - i2 << endl;
    Interval i3(PLUS_INF, 8, 12);
    Interval i4(MINUS_INF, 8, 12);
    Interval i5(ALL, 8, 12);
    cout << i3 << endl;
    cout << i4 << endl;
    cout << i5 << endl;

    SetIntevals s1({{1, 10}, {12, 15}, {19, 21}});
    cout << s1 << endl;
    SetIntevals s2({{7, 12}, {14, 21}});
    cout << s2 << endl;
    cout << s1 * s2 << endl;
    cout << s1 + s2 << endl;
    cout << s1 - s2 << endl;
    cout << s1.getLen() << endl;

    SquareInrquality si1(LOWER, 1, -8, 16);
    cout << si1.solve() << endl;
}

int main() {
    user_test();
    return 0;
}
