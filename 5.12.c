#include <stdio.h>
int main( )
{
    int	num1, num2, num3, natnum, perpetrator;
    scanf("%d", &num2);
    if (num2 == 1){
        printf("one");
    } else {
        num2-=1;
        num1 = 0;
        natnum = 1;
        do {
        for ( natnum*=10, num1++, num3 = natnum; num3 /= 10; num1++ );
        } while ( num1 < num2 );
        for ( num1 -= num2; num1 -= 1; natnum /= 10 );

        printf("Vidpovid:%d\natnum", natnum%10);
        num2++;
    }
    num1 = natnum = 0;
    do {
    for ( natnum+=1, num1+=1, num3 = natnum; num3 /= 10; num1++ );
    } while ( num1 < num2 );
    for ( num1 -= num2; num1--; natnum /= 10 );
    printf("Vidpovid:%d\natnum", natnum%10);
    num1 = natnum = perpetrator = 0;
    do {
    for ( perpetrator+=1, natnum = perpetrator*perpetrator, num1++, num3 = natnum; num3 /= 10; num1+=1 );
    } while ( num1 < num2 );
    for ( num1 -= num2; num1-=1; natnum /= 10 );
    printf("Vidpovid:%d", natnum%10);
}


