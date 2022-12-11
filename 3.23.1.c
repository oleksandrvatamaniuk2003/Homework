# include<stdio.h>
# include<math.h>

void a (){
    double a,parameter_1,c,value_1,value_2,diskriminant,precision;
    precision = 0.00000001;
    printf ("Vvedit' chysla");
    scanf (" %lf %lf %lf", &a, &parameter_1, &c);
    diskriminant= parameter_1*parameter_1 - 4*a*c;
    if (diskriminant>precision){
        value_1 = -parameter_1+sqrt (diskriminant) / (2*a);
        value_2 = -parameter_1-sqrt (diskriminant) / (2*a);
        printf ("The real roots = %f %f", value_1, value_2);
    }
    else if (fabs(diskriminant)<=precision){
        value_1 = -parameter_1/(2*a);
        value_2 = -parameter_1/(2*a);
        printf ("roots are equal =%f %f", value_1, value_2);
    }
    else if(diskriminant<-precision){
        printf("Diysnych koreniv nemaye");
    }
}


void parameter_1 (){
    double a,parameter_1,c,value_1,value_2,diskriminant,precision;
    precision = 0.000000001;
    printf ("Vvedit' chysla");
    scanf (" %lf %lf %lf", &a, &parameter_1, &c);
    diskriminant= parameter_1*parameter_1 - 4*a*c;
    if (diskriminant>precision){
        value_1 = -parameter_1+sqrt (diskriminant) / (2*a);
        value_2 = -parameter_1-sqrt (diskriminant) / (2*a);
        if (value_1 > precision){
            printf ("The real roots = %f %f\n", sqrt(value_1), -sqrt(value_1));
        } else if(fabs(value_1) <= precision){
            printf ("The real roots = %f\n", sqrt(value_1));
        }
        if (value_2 > precision){
            printf ("The real roots = %f %f", sqrt(value_2), -sqrt(value_2));
        } else if(fabs(value_2) <= precision){
            printf ("The real roots = %f\n", sqrt(value_2));
        }
        if (value_1 < -precision && value_2 < -precision){
            printf("Diysnych koreniv nemaye");
        }
    }
    else if (fabs(diskriminant) <= precision){
        value_1 = -parameter_1/(2*a);
        value_2 = -parameter_1/(2*a);
        if (value_1 > precision){
            printf ("The real roots = %f %f\n", sqrt(value_1), -sqrt(value_1));
        } else if(fabs(value_1) <= precision){
            printf ("The real roots = %f\n", sqrt(value_1));
        } else {
            printf("Diysnych koreniv nemaye");
        }
    }
    else if (diskriminant < -precision){
        printf("Diysnych koreniv nemaye");
    }
}
int main (){
    a();
    parameter_1();
}


