#include "SquareInrquality.h"

double SquareInrquality::getValue(double x) {
    return a * x * x + b * x + c;
}

SetIntevals SquareInrquality::solve() {
    double D = b * b - 4 * a * c;
    if(D < 0) {
        return SetIntevals({{0, 0}});
    } else if(D == 0) {
        double x = -b / (2 * a);
        if(t == EQUAL) {
            return SetIntevals({{x, x}});
        } else if(t == NOT_EQUAL) {
            return SetIntevals({Interval(MINUS_INF, 0, x), Interval(PLUS_INF, x, 0)});
        } else if(t == BIGGER || t == BIGGER_EQUAL) {
            if(getValue(x - 10) > 0) {
                if(a < 0) {
                    return SetIntevals({Interval(PLUS_INF, x, 0)});
                } else {
                    return SetIntevals({Interval(MINUS_INF, 0, x)});
                }
            } else {
                if(a < 0) {
                    return SetIntevals({Interval(MINUS_INF, 0, x)});
                } else {
                    return SetIntevals({Interval(PLUS_INF, x, 0)});
                }
            }
        } else {
            if(getValue(x - 10) < 0) {
                if(a < 0) {
                    return SetIntevals({Interval(PLUS_INF, x, 0)});
                } else {
                    return SetIntevals({Interval(MINUS_INF, 0, x)});
                }
            } else {
                if(a < 0) {
                    return SetIntevals({Interval(MINUS_INF, 0, x)});
                } else {
                    return SetIntevals({Interval(PLUS_INF, x, 0)});
                }
            }
        }
    } else {
        double x1 = (-b + sqrt(D)) / (2 * a);
        double x2 = (-b -    sqrt(D)) / (2 * a);
        if(x1 > x2) {
            swap(x1, x2);
        }
        if(t == EQUAL) {
            return SetIntevals({{x1, x1}, {x2, x2}});
        } else if(t == NOT_EQUAL) {
            return SetIntevals({Interval(MINUS_INF, 0, x1), Interval(NO, x1, x2), Interval(PLUS_INF, x2, 0)});
        } else if(t == BIGGER || t == BIGGER_EQUAL) {
            if(getValue(x1 - 10) > 0) {
                if(a < 0) {
                    return SetIntevals({Interval(NO, x1, x2)});
                } else {
                    return SetIntevals({Interval(MINUS_INF, 0, x1), Interval(PLUS_INF, x2, 0)});
                }
            } else {
                if(a < 0) {
                    return SetIntevals({Interval(MINUS_INF, 0, x1), Interval(PLUS_INF, x2, 0)});
                } else {
                    return SetIntevals({Interval(NO, x1, x2)});
                }
            }
        } else {
            if(getValue(x1 - 10) < 0) {
                if(a < 0) {
                    return SetIntevals({Interval(NO, x1, x2)});
                } else {
                    return SetIntevals({Interval(MINUS_INF, 0, x1), Interval(PLUS_INF, x2, 0)});
                }
            } else {
                if(a < 0) {
                    return SetIntevals({Interval(MINUS_INF, 0, x1), Interval(PLUS_INF, x2, 0)});
                } else {
                    return SetIntevals({Interval(NO, x1, x2)});
                }
            }
        }
    }
}
