#include "SetIntevals.h"

ostream &operator<<(ostream &out, const SetIntevals s) {
    for(int i = 0; i < s.intervals.size(); ++i) {
        out << s.intervals[i] << ", ";
    }
    out << endl;
    return out;
}

double SetIntevals::getLen() const {
    double len = 0;
    for(int i = 0; i < intervals.size(); ++i) {
        len += intervals[i].b - intervals[i].a;
    }
    return len;
}

SetIntevals SetIntevals::operator+(SetIntevals s) {
    SetIntevals res;
    Interval a = intervals.front();
    int ind0 = 1, ind1 = 0;
    while(ind0 < intervals.size() || ind1 < s.intervals.size()) {
        if(ind0 < intervals.size() && a != a + intervals[ind0]) {
            a = a + intervals[ind0];
            ++ind0;
        } else if(ind1 < s.intervals.size() && a != a + s.intervals[ind1]) {
            a = a + s.intervals[ind1];
            ++ind1;
        } else {
            res.intervals.push_back(a);
            if(ind0 < intervals.size()) {
                a = intervals[ind0];
                ++ind0;
            } else {
                a = s.intervals[ind1];
                ++ind1;
            }
        }
    }
    return res;
}

SetIntevals SetIntevals::operator-(SetIntevals s) {
    SetIntevals res;
    for(int i = 0; i < min(intervals.size(), s.intervals.size()); ++i) {
        res.intervals.push_back(intervals[i] - s.intervals[i]);
    }
    return res;
}

SetIntevals::SetIntevals(vector<pair<double, double>> v) {
    for(int i = 0; i < v.size(); ++i) {
        intervals.push_back(Interval(NO, v[i].first, v[i].second));
    }
}
