#define _USE_MATH_DEFINES 
#include <stdio.h>
#include <math.h>

int main()
{
	float a = pow(10, -4), b = 24.33E5;
	double c = M_PI, d = M_E;   
	long double e = sqrt(5), f = log(100);
	printf("%.2f %.2f %.2f %.2f %.2Le %.2Le", a, b, c, d, e, f);
}