#include <stdio.h>

int main( )
{
    int	c, k, j, n, f;

    scanf("%d", &k);
    // a
    if (k == 1){
        printf("1");
    } else {
        k--;
        c = 0;
        n = 1;
        do {
        for ( n*=10, c++, j = n; j /= 10; c++ );
        } while ( c < k );
        for ( c -= k; c--; n /= 10 );

        printf("Result=%d\n", n%10);
        k++;
    }

    // b
    c = n = 0;
    do {
    for ( n++, c++, j = n; j /= 10; c++ );
    } while ( c < k );
    for ( c -= k; c--; n /= 10 );
    printf("Result=%d\n", n%10);

    // с
    c = n = f = 0;
    do {
    for ( f++, n = f*f, c++, j = n; j /= 10; c++ );
    } while ( c < k );
    for ( c -= k; c--; n /= 10 );
    printf("Result=%d", n%10);
}