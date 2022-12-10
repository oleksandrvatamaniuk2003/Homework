#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct {
    unsigned int day;
    unsigned int month;
    unsigned int year;
} Date;

int eom(int year, int month) {
    if(month >= 1 && month <= 12){
        int month_since_January_length[12] = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2) {
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return month_since_January_length[1] + 1;
                }
                else {
                    return month_since_January_length[1];
                }
            }
            if(year % 4 == 0){
                return month_since_January_length[1] + 1;
            }
        }
        return month_since_January_length[month-1];
    }
    return 0;
}


bool valid_date(int day, int month, int year) {
    if(year < 1 || year > 9999) {
        return false;
    }
    return month >= 1 && month <= 12 && day >= 1 && day <= eom(year, month);
}

Date inputDate() {
    Date d;
    int enter = 1;
    while(enter == 1){
        printf("Enter date: ");
        scanf("%d.%d.%d", &d.day, &d.month, &d.year);
        if(valid_date(d.day, d.month, d.year) == true){
            enter = 0;
        } else{
            printf("Incorrect date!\n");
        }
    }
    return d;
}

void outputDate(Date d){
    printf("%u.%u.%u\n", d.day, d.month, d.year);
}

Date nextDay(Date d){
    Date d2;
    if(!valid_date(d.day + 1, d.month, d.year)){
        if(!valid_date(1, d.month + 1, d.year)){
            if(!valid_date(1, 1, d.year + 1)){
                printf("That was the last possible day!\n");
                return d;
            } else {
                d2.day = 1;
                d2.month = 1;
                d2.year = d.year + 1;
            }
        } else {
            d2.day = 1;
            d2.month = d.month + 1;
            d2.year = d.year;   
        }
    } else {
        d2.day = d.day + 1;
        d2.month = d.month;
        d2.year = d.year;   
    }
    return d2;
}

void getDayOfWeek(Date d){
    printf("%d-th day", (d.day + 2 * d.month + 3 * (d.month + 1) / 5 + d.year + d.year / 4 - d.year / 100 + d.year / 400 + 1) % 7);
}

int main(){
    
    Date d;
    d = inputDate();
    outputDate(d);
    
    Date d;
    d = inputDate();
    Date d2 = nextDay(d);
    outputDate(d2);
    getDayOfWeek(d);
}