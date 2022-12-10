# include<stdio.h>
# include<math.h>

void a (){
    double a,b,c,r1,r2,d,eps;
    eps = 0.000000001;
    printf ("enter the values of a b c");
    scanf (" %lf %lf %lf", &a, &b, &c);
    d= b*b - 4*a*c;
    if (d>eps){
        r1 = -b+sqrt (d) / (2*a);
        r2 = -b-sqrt (d) / (2*a);
        printf ("The real roots = %f %f", r1, r2);
    }
    else if (fabs(d)<=eps){
        r1 = -b/(2*a);
        r2 = -b/(2*a);
        printf ("roots are equal =%f %f", r1, r2);
    }
    else if(d<-eps){
        printf("Roots are imaginary");
    }
}


void b (){
    double a,b,c,r1,r2,d,eps;
    eps = 0.000000001;
    printf ("enter the values of a b c");
    scanf (" %lf %lf %lf", &a, &b, &c);
    d= b*b - 4*a*c;
    if (d>eps){
        r1 = -b+sqrt (d) / (2*a);
        r2 = -b-sqrt (d) / (2*a);
        if (r1 > eps){
            printf ("The real roots = %f %f\n", sqrt(r1), -sqrt(r1));
        } else if(fabs(r1) <= eps){
            printf ("The real roots = %f\n", sqrt(r1));
        }
        if (r2 > eps){
            printf ("The real roots = %f %f", sqrt(r2), -sqrt(r2));
        } else if(fabs(r2) <= eps){
            printf ("The real roots = %f\n", sqrt(r2));
        }
        if (r1 < -eps && r2 < -eps){
            printf("Roots are imaginary");
        }
    }
    else if (fabs(d) <= eps){
        r1 = -b/(2*a);
        r2 = -b/(2*a);
        if (r1 > eps){
            printf ("The real roots = %f %f\n", sqrt(r1), -sqrt(r1));
        } else if(fabs(r1) <= eps){
            printf ("The real roots = %f\n", sqrt(r1));
        } else {
            printf("Roots are imaginary");
        }
    }
    else if (d < -eps){
        printf("Roots are imaginary");
    }
}
int main (){
    a();
    b();
}