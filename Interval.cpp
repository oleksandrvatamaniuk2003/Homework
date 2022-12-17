#include "Interval.h"

istream &operator>>(istream &in, Interval &i) {
    int op;
    in >> op;
    if(op == 0) {
        i.t = NO;
        in >> i.a >> i.b;
    } else if(op == 1) {
        i.t = PLUS_INF;
        i.b = DBL_MAX;
        in >> i.a;
    } else if(op == 2) {
        i.t = MINUS_INF;
        i.a = DBL_MIN;
        in >> i.b;
    } else {
        i.t = ALL;
        i.b = DBL_MAX;
    }
    return in;
}

ostream &operator<<(ostream &out, const Interval &i) {
    switch (i.t) {
        case NO:
            out << "(" << i.a << ", " << i.b << ")";
            break;
        case PLUS_INF:
            out << "(" << i.a << ", +inf)";
            break;
        case MINUS_INF:
            out << "(-inf, " << i.b << ")";
            break;
        case ALL:
            out << "(-inf, +inf)";
            break;
    }
    return out;
}

Interval Interval::operator*(Interval i) {
    double l = max(a, i.a), r = min(b, i.b);
    if(l < r) {
        return Interval(NO, l, r);
    } else {
        return Interval(NO, 0, 0);
    }
}

Interval Interval::operator+(Interval i) {
    if(i.a <= b) {
        return Interval(max(t, i.t), a, max(b, i.b));
    }
    return *this;
}

Interval Interval::operator-(Interval i) {
    if(t == ALL || i.t == ALL) {
        return Interval(ALL, DBL_MIN, DBL_MAX);
    }
    if(t == MINUS_INF || i.t == MINUS_INF) {
        return Interval(MINUS_INF, DBL_MIN, b - i.b);
    }
    if(t == PLUS_INF || i.t == PLUS_INF) {
        return Interval(PLUS_INF, a - i.a, DBL_MAX);
    }
    return Interval(NO, a - i.a, b - i.b);
}
