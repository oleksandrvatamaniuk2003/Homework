#include <stdio.h>
#include <math.h>
int main(){
    int x[5], z[5];
    double y[5];
    scanf("%d %d %d %d %d %lf %lf %lf %lf %lf", &x[0], &x[1], &x[2], &x[3], &x[4], &y[0], &y[1], &y[2], &y[3], &y[4]);
    printf("x| %-6d| %-6d| %-6d| %-6d| %-6d|\n", x[0], x[1], x[2], x[3], x[4]);
    printf("-| ----- | ----- | ----- | ----- | ----- |\n", x[0], x[1], x[2], x[3], x[4]);
    printf("y| %-6.2f| %-6.2f| %-6.2f| %-6.2f| %-6.2f|", y[0], y[1], y[2], y[3], y[4]);
}